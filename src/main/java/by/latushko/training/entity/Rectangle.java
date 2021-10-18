package by.latushko.training.entity;

import by.latushko.training.observer.Observable;
import by.latushko.training.observer.RectangleEvent;
import by.latushko.training.observer.RectangleObserver;
import by.latushko.training.util.IdGenerator;

import java.util.HashSet;
import java.util.Set;

public class Rectangle implements Observable {
    private long rectangleId;
    private Point startingPoint;
    private double width;
    private double height;
    private final Set<RectangleObserver> observers = new HashSet<>();

    {
        rectangleId = IdGenerator.generateId();
    }

    public Rectangle(Point startingPoint, double width, double height) {
        this.startingPoint = startingPoint;
        this.width = width;
        this.height = height;
    }

    public long getRectangleId() {
        return rectangleId;
    }

    public void setRectangleId(long rectangleId) {
        this.rectangleId = rectangleId;
    }

    public Point getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(Point startingPoint) {
        this.startingPoint = startingPoint;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        notifyObservers();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        notifyObservers();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (rectangleId != rectangle.rectangleId) return false;
        if (Double.compare(rectangle.width, width) != 0) return false;
        if (Double.compare(rectangle.height, height) != 0) return false;
        return startingPoint != null ? startingPoint.equals(rectangle.startingPoint) : rectangle.startingPoint == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (rectangleId ^ (rectangleId >>> 32));
        result = 31 * result + (startingPoint != null ? startingPoint.hashCode() : 0);
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("rectangleId=").append(rectangleId);
        sb.append(", startingPoint=").append(startingPoint);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void attach(RectangleObserver observer) {
        if(observer != null) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(RectangleObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(observers.isEmpty()) {
            return;
        }
        RectangleEvent event = new RectangleEvent(this);
        observers.forEach(o -> o.parameterChange(event));
    }
}
