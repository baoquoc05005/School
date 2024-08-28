public class TerrestrialPlanet extends Planet {
    private int numberOfMoons;

    public TerrestrialPlanet(String name, double diameter, double mass, double daysToOrbitSun, boolean hasGlobalMagneticField, int numberOfMoons) {
        super(name, diameter, mass, SurfaceMaterial.TERRESTRIAL, daysToOrbitSun, hasGlobalMagneticField, false);
        this.numberOfMoons = numberOfMoons;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of Moons:      %d", numberOfMoons);
    }
}
