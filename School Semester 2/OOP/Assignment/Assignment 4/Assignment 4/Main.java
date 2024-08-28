public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.sortPlanetsByDiameter();
        solarSystem.displayPlanets();

        // Example to demonstrate equals method
        TerrestrialPlanet mars = new TerrestrialPlanet("Mars", 6792, 0.642, 687, false, 2);
        TerrestrialPlanet earth = new TerrestrialPlanet("Earth", 12756, 5.97, 365, true, 1);
        System.out.println("Is planet Mars equal to planet Earth? " + mars.equals(earth));
        
        IceGiant neptune = new IceGiant("Neptune", 49528, 102, 59800, 14, true, true);
        TerrestrialPlanet mercury = new TerrestrialPlanet("Mercury", 4879, 0.330, 88, true, 0);
        System.out.println("Is planet Neptune equal to planet Mercury? " + neptune.equals(mercury));
    }
}
