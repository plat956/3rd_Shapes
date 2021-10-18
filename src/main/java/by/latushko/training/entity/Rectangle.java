package by.latushko.training.entity;

import by.latushko.training.util.IdGenerator;

public class Rectangle {
    private long rectangleId;
    private Point startingPoint;
    private double width;
    private double height;

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
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
}
