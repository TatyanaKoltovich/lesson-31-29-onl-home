import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        StockDataProvider stockDataProvider = new StockDataProvider();
//        String xml = stockDataProvider.getData();

//        StockDataAdapter stockDataAdapter = new StockDataAdapter();
//        String json = stockDataAdapter.getData();

//        Analytics analytics = new Analytics();
//        analytics.process(json);

//        FileReader in = new FileReader("");
//        BufferedReader bufferedReader = new BufferedReader();

        List<String> stringList = new ArrayList<>();

//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");
//        stringList.add("asdasd");

//        ArrayListWithAddCount<String> arrayListWithAddCount = new ArrayListWithAddCount<>(stringList);
//
//        arrayListWithAddCount.add("Hello 1");
//        arrayListWithAddCount.add("Hello 2");
//        arrayListWithAddCount.add("Hello 3");
//        arrayListWithAddCount.remove(1);
//        arrayListWithAddCount.remove(1);
//        arrayListWithAddCount.add("Hello 4");
//        arrayListWithAddCount.add("Hello 5");
//
//        System.out.println(arrayListWithAddCount.getAddCount());
//
//        System.out.println(stringList);
//
//        Set<String> set = new TreeSet<>();
//
//        Iterator<String> iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        List<String> objects = new ArrayList<>();
//        objects.add("Hello 1");
//        objects.add("Hello 2");
//        objects.add("Hello 3");
//        objects.add("Hello 4");
//        objects.add("Hello 5");
//
//        Iterator<String> iterator = objects.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());

        MatrixCollection matrixCollection = new MatrixCollection();

        matrixCollection.add(1, 0,0);
        matrixCollection.add(1, 0,1);
        matrixCollection.add(1, 1,0);
        matrixCollection.add(1, 1,1);
        matrixCollection.add(1, 2,0);
        matrixCollection.add(1, 2,1);

        for (int i : matrixCollection) {
            System.out.println("i=" + i);
        }
    }
}
