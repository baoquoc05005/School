public class GasGiant extends Planet {
    private int numberOfMoons;
    private boolean hasStorms;

    public GasGiant(String name, double diameter, double mass, double daysToOrbitSun, int numberOfMoons, boolean hasStorms) {
        super(name, diameter, mass, SurfaceMaterial.GASEOUS, daysToOrbitSun, false, true);
        this.numberOfMoons = numberOfMoons;
        this.hasStorms = hasStorms;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of Moons:      %d\nStorms:      %s", numberOfMoons, hasStorms ? "Yes" : "No");
    }
}
