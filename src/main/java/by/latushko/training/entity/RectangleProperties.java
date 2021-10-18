package by.latushko.training.entity;

public class RectangleProperties {
    private double square;
    private double perimeter;

    public RectangleProperties(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RectangleProperties that = (RectangleProperties) o;

        if (Double.compare(that.square, square) != 0) return false;
        return Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(square);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RectangleProperties{");
        sb.append("square=").append(square);
        sb.append(", perimeter=").append(perimeter);
        sb.append('}');
        return sb.toString();
    }
}
