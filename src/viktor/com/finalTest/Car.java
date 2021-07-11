package viktor.com.finalTest;

import java.util.Objects;

public class Car {
    private String name;
    public enum carModel {
        CIVIC, PILOT, ACCORD;
    }
    private carModel carModel;
    private int engineCapacity;

    public Car() { }

    public Car(String n, carModel cm, int ec) {
        this.name = n;
        this.carModel = cm;
        this.engineCapacity = ec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car.carModel getCarModel() {
        return carModel;
    }

    public void setCarModel(Car.carModel carModel) {
        this.carModel = carModel;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engineCapacity == car.engineCapacity && name.equals(car.name) && carModel == car.carModel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, carModel, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carModel=" + carModel +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
