package by.latushko.training.repository;

import by.latushko.training.entity.Rectangle;

import java.util.*;

public class RectangleRepository {
    private static RectangleRepository instance;
    private final List<Rectangle> rectangles;

    private RectangleRepository() {
        rectangles = new ArrayList<>();
    }

    public static RectangleRepository getInstance() {
        if(instance == null) {
            instance = new RectangleRepository();
        }
        return instance;
    }

    public int size() {
        return rectangles.size();
    }

    public boolean isEmpty() {
        return rectangles.isEmpty();
    }

    public boolean add(Rectangle rectangle) {
        return rectangles.add(rectangle);
    }

    public boolean remove(Object o) {
        return rectangles.remove(o);
    }

    public boolean addAll(Collection<? extends Rectangle> c) {
        return rectangles.addAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return rectangles.removeAll(c);
    }

    public Rectangle get(int index) {
        return rectangles.get(index);
    }

    public Rectangle set(int index, Rectangle element) {
        return rectangles.set(index, element);
    }

    public void add(int index, Rectangle element) {
        rectangles.add(index, element);
    }

    public Rectangle remove(int index) {
        return rectangles.remove(index);
    }

    public List<Rectangle> query(RectangleSpecification specification) {
        return rectangles.stream().filter(specification::specify).toList();
    }

    public List<Rectangle> sort(Comparator<? super Rectangle> comparator) {
        return rectangles.stream().sorted(comparator).toList();
    }
}
