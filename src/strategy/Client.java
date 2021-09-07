package strategy;

public class Client {
    public static void main(String[] args) {
        SortList sortList = new SortList();
        sortList.setStrategy(new BinarySort());
        sortList.sort();

        sortList.setStrategy(new QuickSort());
        sortList.sort();

        sortList.setStrategy(new MergeSort());
        sortList.sort();
    }
}
