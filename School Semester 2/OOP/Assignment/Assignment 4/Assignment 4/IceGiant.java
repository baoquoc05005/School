public class IceGiant extends Planet {
    private int numberOfMoons;
    private boolean hasSlushyIce;

    public IceGiant(String name, double diameter, double mass, double daysToOrbitSun, int numberOfMoons, boolean hasGlobalMagneticField, boolean hasSlushyIce) {
        super(name, diameter, mass, SurfaceMaterial.ICY, daysToOrbitSun, hasGlobalMagneticField, true);
        this.numberOfMoons = numberOfMoons;
        this.hasSlushyIce = hasSlushyIce;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of Moons:      %d\nHas slushy Ice:      %s", numberOfMoons, hasSlushyIce ? "Yes" : "No");
    }
}
