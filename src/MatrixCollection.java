import java.util.Iterator;

public class MatrixCollection implements Iterable<Integer> {
    private final int[][] matrix = new int[5][5];

    //1,1,0,0,0
    //1,1,0,0,0
    //0,0,0,0,0
    //0,0,0,0,0
    //0,0,0,0,0

    public void add(int value, int row, int col) {
        this.matrix[row][col] = value;
    }

    public int get(int row, int col) {
        return this.matrix[row][col];
    }

    public void remove(int row, int col) {
        this.matrix[row][col] = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MatrixIterator();
    }

    private class MatrixIterator implements Iterator<Integer> {

        int row = 0;
        int col = 0;

        @Override
        public boolean hasNext() {
            //return matrix[row][col] != 0;
            return row < matrix.length;
        }

        @Override
        public Integer next() {
            int element = matrix[row][col];
            System.out.println("row: " + row + ", col: " + col);

            if (row <= matrix[row].length - 1) {
                if (col < matrix[col].length - 1) {
                    col++;
                } else {
                    col = 0;
                    row++;
                }
            }
            return element;
        }
    }
}