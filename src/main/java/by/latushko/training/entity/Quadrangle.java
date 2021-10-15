package by.latushko.training.entity;

public class Quadrangle {
    private long id;
    private String name;
    private ShapeSide firstSide;
    private ShapeSide secondSide;
    private ShapeSide thirdSide;
    private ShapeSide fourthSide;

    public Quadrangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        this.firstSide = new ShapeSide(firstPoint, secondPoint);
        this.secondSide = new ShapeSide(secondPoint, thirdPoint);
        this.thirdSide = new ShapeSide(thirdPoint, fourthPoint);
        this.fourthSide = new ShapeSide(fourthPoint, firstPoint);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShapeSide getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(ShapeSide firstSide) {
        this.firstSide = firstSide;
    }

    public ShapeSide getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(ShapeSide secondSide) {
        this.secondSide = secondSide;
    }

    public ShapeSide getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(ShapeSide thirdSide) {
        this.thirdSide = thirdSide;
    }

    public ShapeSide getFourthSide() {
        return fourthSide;
    }

    public void setFourthSide(ShapeSide fourthSide) {
        this.fourthSide = fourthSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadrangle that = (Quadrangle) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (firstSide != null ? !firstSide.equals(that.firstSide) : that.firstSide != null) return false;
        if (secondSide != null ? !secondSide.equals(that.secondSide) : that.secondSide != null) return false;
        if (thirdSide != null ? !thirdSide.equals(that.thirdSide) : that.thirdSide != null) return false;
        return fourthSide != null ? fourthSide.equals(that.fourthSide) : that.fourthSide == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (firstSide != null ? firstSide.hashCode() : 0);
        result = 31 * result + (secondSide != null ? secondSide.hashCode() : 0);
        result = 31 * result + (thirdSide != null ? thirdSide.hashCode() : 0);
        result = 31 * result + (fourthSide != null ? fourthSide.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Quadrangle{");
        sb.append("name='").append(name).append('\'');
        sb.append(", firstSide=").append(firstSide);
        sb.append(", secondSide=").append(secondSide);
        sb.append(", thirdSide=").append(thirdSide);
        sb.append(", fourthSide=").append(fourthSide);
        sb.append('}');
        return sb.toString();
    }
}
