package by.latushko.training.observer;

public interface Observable {
    void attach(RectangleObserver observer);

    void detach(RectangleObserver observer);

    void notifyObservers();
}
