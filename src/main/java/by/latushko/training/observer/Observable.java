package by.latushko.training.observer;

import by.latushko.training.entity.Rectangle;

public interface Observable {
    void attach(RectangleObserver observer);

    void detach(RectangleObserver observer);

    void notifyObservers();
}
