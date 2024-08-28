public class Cow implements Comparable {

    private String name;
    private int weightInPounds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Cow() {
        name = "abc";
        weightInPounds = 1880;
    }

    public Cow(String name, int weightInPounds) {
        setName(name);
        setWeightInPounds(weightInPounds);
    }

    @Override
    public int getComparableValue() {
        return weightInPounds;
    }

    @Override
    public String toString() {
        return name + " " + weightInPounds;
    }
}
