package viktor.com;

import viktor.com.lessonClassHierarchy.Earth;
import viktor.com.lessonClassHierarchy.Moon;
import viktor.com.lessonClassHierarchy.SolarSystem;

public class Main {
    public static void main(String[] args) {
	// write your code here
        SolarSystem system = new SolarSystem();
        Earth earth = new Earth();
        Moon moon = new Moon();
        System.out.println(system);
        system.show();
        earth.show();
        moon.show();
    }
}
