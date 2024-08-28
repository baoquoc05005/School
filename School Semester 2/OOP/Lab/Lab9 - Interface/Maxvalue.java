public class MaxValue {
    public static Comparable max(Comparable c1, Comparable c2) {
        if (c1.getComparableValue() > c2.getComparableValue()) {
            return c1;
        } else {
            return c2;
        }
    }
}
