package sadovnikov.step.lesson12.porsche;

import java.util.Arrays;

public class Car {

    private String brand;
    private String model;
    private Engine engine;
    public Transmission transmission;
    private Wheel[] wheels;

    public Car() {
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model, Engine engine, Transmission transmission, Wheel[] wheels) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel[] getWheels() {
        return wheels == null ? new Wheel[]{} : wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
