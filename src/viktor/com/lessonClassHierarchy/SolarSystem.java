package viktor.com.lessonClassHierarchy;

import java.util.Objects;

public class SolarSystem {

     protected int radiusOfPlanet;
     protected String massOfPlanet;
     private final int NUMBER_PLANET = 8;

     enum Planet { Mercury, Venus, Earth, Mars,
                   Jupiter, Saturn, Uranus, Neptune; }

     public void show() {
         for (Planet title: Planet.values()) {
             System.out.println(title);
         }
     }

     public int getRadiusOfPlanet() {
         return radiusOfPlanet;
     }

     public void setRadiusOfPlanet(int radiusOfPlanet) {
         this.radiusOfPlanet = radiusOfPlanet;
     }

     public String getMassOfPlanet() {
         return massOfPlanet;
     }

     public void setMassOfPlanet(String massOfPlanet) {
         this.massOfPlanet = massOfPlanet;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolarSystem system = (SolarSystem) o;
        return radiusOfPlanet == system.radiusOfPlanet && massOfPlanet == system.massOfPlanet && NUMBER_PLANET == system.NUMBER_PLANET;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radiusOfPlanet, massOfPlanet, NUMBER_PLANET);
    }

    @Override
    public String toString() {
        return "Number of planets: " + NUMBER_PLANET;
    }
}


