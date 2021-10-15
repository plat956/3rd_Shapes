package by.latushko.training.entity;

public class ShapeSide {
    private Point startPoint;
    private Point endPoint;

    public ShapeSide(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public int getLength() {
        int xLength = Math.abs(endPoint.getX() - startPoint.getX());
        int yLength = Math.abs(endPoint.getY() - startPoint.getY());
        return xLength > 0 ? xLength : yLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeSide shapeSide = (ShapeSide) o;

        if (startPoint != null ? !startPoint.equals(shapeSide.startPoint) : shapeSide.startPoint != null) return false;
        return endPoint != null ? endPoint.equals(shapeSide.endPoint) : shapeSide.endPoint == null;
    }

    public boolean equalsByLength(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShapeSide shapeSide = (ShapeSide) o;

        return getLength() == shapeSide.getLength();
    }

    @Override
    public int hashCode() {
        int result = startPoint != null ? startPoint.hashCode() : 0;
        result = 31 * result + (endPoint != null ? endPoint.hashCode() : 0);
        return result;
    }
}
