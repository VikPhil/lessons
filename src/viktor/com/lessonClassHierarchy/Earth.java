package viktor.com.lessonClassHierarchy;

import java.util.Objects;

public class Earth extends SolarSystem {

        protected int numberOfSatellites;
        protected long population;

        public Earth() {  }

        public Earth(int count, int radius, String mass, long population) {

            this.population = population;
            this.numberOfSatellites = count;
            radiusOfPlanet = radius;
            massOfPlanet = mass;

        }

       public void show() {
        Earth earth = new Earth(1, 6371, "5,976 * 10^24", 7_830_458_560l);
        System.out.println(earth);
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public void setNumberOfSatellites(int numberOfSatellites) {
        this.numberOfSatellites = numberOfSatellites;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Earth earth = (Earth) o;
        return numberOfSatellites == earth.numberOfSatellites && population == earth.population;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSatellites, population);
    }

    @Override
    public String toString() {
        return "\n\'Earth\'\n" +
                "Number of satellites: " + numberOfSatellites + " (Moon)" +
                "\nPopulation: " + population + " people" +
                "\nPlanet radius: " + radiusOfPlanet + " km" +
                "\nPlanet mass: " + massOfPlanet + " kg";
    }
}
