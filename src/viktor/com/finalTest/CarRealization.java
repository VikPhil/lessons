package viktor.com.finalTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRealization {
    public static void show() {

        List<Car> carList = new ArrayList<Car>(10);
        Map<Integer, List<Car>> mapCar = new HashMap<Integer, List<Car>>();

        for (int i = 0; i < 10; i++) {
            if(i <= 3) {
                carList.add(new Car("Honda", Car.carModel.CIVIC, 1 ));
            }else if(i > 3 && i <= 6) {
                carList.add(new Car("Honda", Car.carModel.PILOT, 2));
            }else {
                carList.add(new Car("Honda", Car.carModel.ACCORD, 3));
            }
        }

    }
}
