package model;

import java.util.ArrayList;
import java.util.List;

public class ObservableModel {
    private final List<IModelObserver> observers = new ArrayList<>();
    private String data;

    public void addObserver(IModelObserver observer) {
        observers.add(observer);
    }

    public void setData(String newData) {
        this.data = newData;
        notifyObservers();
    }

    private void notifyObservers() {
        for (IModelObserver observer : observers) {
            observer.update(this);
        }
    }

    public String getData() {
        return data;
    }
}