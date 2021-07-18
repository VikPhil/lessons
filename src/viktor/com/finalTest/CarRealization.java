package viktor.com.finalTest;

import java.util.*;

public class CarRealization {
    public static void show() {

        String path = "/home/boris/Рабочий стол/itacademy/data/data1/carModels.txt";
        List<Car> carList = new ArrayList<Car>(10);
        Map<Integer, List<Car>> mapCar = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            if(i <= 3) {
                carList.add(new Car("Honda", CarModel.CIVIC, 1 ));
            }else if(i > 3 && i <= 6) {
                carList.add(new Car("Honda", CarModel.PILOT, 2));
            }else {
                carList.add(new Car("Honda", CarModel.ACCORD, 3));
            }
        }

        for (Car car: carList) {
            List<Car> carNext  = mapCar.get(car.getEngineCapacity());
            if(carNext == null) {
                carNext = new ArrayList<>();
            }
            carNext.add(car);
            mapCar.put(car.getEngineCapacity(),carNext);
        }
        mapCar.entrySet().stream()
                .forEach(a -> WritingToFile.write(path, a.getValue().toString().replace(",", "")
                                                                               .replace("[", " ")
                                                                               .replace("]", "")));

    }
}
