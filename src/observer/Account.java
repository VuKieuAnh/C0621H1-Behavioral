package observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notification(String mess) {
        for (Observer o: observerList
             ) {
            o.update(mess);
        }
    }
}
