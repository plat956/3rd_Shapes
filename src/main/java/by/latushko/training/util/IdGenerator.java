package by.latushko.training.util;

public class IdGenerator {
    private static long id = 0L;

    private IdGenerator() {
    }

    public static long generateId() {
        return ++id;
    }
}
