package strategy;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    private SortStrategy strategy;
    List<Integer> items = new ArrayList<>();

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }
    public void add(Integer integer){
        items.add(integer);
    }
    public void sort(){
        strategy.sort(items);
    }
}
