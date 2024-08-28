public abstract class Planet {
    private String name;
    private double diameter; // in kilometers
    private double mass; // in 10^24 kilograms
    private SurfaceMaterial surfaceMaterial;
    private double daysToOrbitSun; // in days
    private boolean hasGlobalMagneticField;
    private boolean hasRings;

    public Planet(String name, double diameter, double mass, SurfaceMaterial surfaceMaterial, double daysToOrbitSun, boolean hasGlobalMagneticField, boolean hasRings) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.surfaceMaterial = surfaceMaterial;
        this.daysToOrbitSun = daysToOrbitSun;
        this.hasGlobalMagneticField = hasGlobalMagneticField;
        this.hasRings = hasRings;
    }

    public double getDiameter() {
        return diameter;
    }

    public SurfaceMaterial getSurfaceMaterial() {
        return surfaceMaterial;
    }

    @Override
    public String toString() {
        return String.format("Name:                  %s\nSurface Material:      %s\nDays to Orbit Sun:     %.1f\nDiameter:              %.1f\nGlobal Magnetic Field:  %s\nRings:                   %s",
                name, surfaceMaterial, daysToOrbitSun, diameter, hasGlobalMagneticField ? "Yes" : "No", hasRings ? "Yes" : "No");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planet planet = (Planet) obj;
        return surfaceMaterial == planet.surfaceMaterial;
    }
}
