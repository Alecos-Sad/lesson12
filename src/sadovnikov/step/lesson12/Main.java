package sadovnikov.step.lesson12;

import sadovnikov.step.lesson12.porsche.Car;
import sadovnikov.step.lesson12.porsche.CarFabric;

public class Main {

    public static void main(String[] args) {

        for (Car car : CarFabric.getCars()) {
            System.out.println(car);
        }
    }
}
