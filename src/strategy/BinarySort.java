package strategy;

import java.util.List;

public class BinarySort implements SortStrategy {
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("SX nhi phan");
    }
}
