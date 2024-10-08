package exercise_3;

import java.util.Objects;

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExtendedClass that)) return false;
        return b == that.b && i == that.i && Double.compare(d, that.d) == 0 && Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + b;
        result = 31 * result + i;
        result = (int) (31 * result + d);
        result = 31 * result + s.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ExtendedClass{" +
                "b=" + b +
                ", i=" + i +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}
