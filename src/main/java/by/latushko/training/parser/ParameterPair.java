package by.latushko.training.parser;

import java.util.Arrays;

public class ParameterPair {
    private Integer[] key;
    private Double[] value;

    public ParameterPair(Integer[] key, Double[] value) {
        this.key = key;
        this.value = value;
    }

    public Integer[] getKey() {
        return key;
    }

    public void setKey(Integer[] key) {
        this.key = key;
    }

    public Double[] getValue() {
        return value;
    }

    public void setValue(Double[] value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParameterPair parameterPair = (ParameterPair) o;

        if (!Arrays.equals(key, parameterPair.key)) return false;
        return Arrays.equals(value, parameterPair.value);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(key);
        result = 31 * result + Arrays.hashCode(value);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pair{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}