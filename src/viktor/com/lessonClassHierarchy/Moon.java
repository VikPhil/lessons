package viktor.com.lessonClassHierarchy;

public class Moon extends Earth {

    public Moon() {  }

    public Moon(int count, int radius, String mass, long population) {

        super(count, radius, mass, population);
    }

    public void show() {
        Moon moon = new Moon(0, 1737, "7,35 * 10^22", 0);
        System.out.println(moon);
    }

    @Override
    public String toString() {
        return "\n\'Moon\'" +
                "\nNumber of satellites: " + numberOfSatellites +
                "\nPopulation: " + population + " people" +
                "\nSatellite radius: " + radiusOfPlanet + " km" +
                "\nSatellite mass: " + massOfPlanet + " kg" ;
    }
}
