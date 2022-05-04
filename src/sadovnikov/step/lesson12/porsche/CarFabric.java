package sadovnikov.step.lesson12.porsche;

public class CarFabric {


    public static Car[] getCars() {

//        //1
//        Car infinity = getCar1();
//        Car gaz = getCar2();
//        Car zil = getCar3();
//        Car[]cars = new Car[3];
//        cars[0] = infinity;
//        cars[1] = zil;
//        cars[2] = gaz;
//        return cars;
//
//        Car[]cars = new Car[3];
//        cars[0] = getCar1();
//        cars[1] = getCar2();
//        cars[2] = getCar3();
//        return cars;

        //3

        return new Car[]{getCar1(), getCar2(), getCar3()};

    }


    public static Car getCar1() {
        Engine engine = new Engine();
        engine.setEngineType(EngineType.GAZ);
        engine.setPower(300);
        engine.setVolume(3.5);

        Transmission transmission = new Transmission();
        transmission.setType(TransmissionType.A);
        transmission.setGearCount(6);


        Wheel wheel1 = new Wheel();
        wheel1.setRadius(21);
        wheel1.setWidth(255);

        Wheel wheel2 = new Wheel();
        wheel1.setRadius(21);
        wheel1.setWidth(255);

        Wheel wheel3 = new Wheel();
        wheel1.setRadius(21);
        wheel1.setWidth(255);

        Wheel wheel4 = new Wheel();
        wheel1.setRadius(21);
        wheel1.setWidth(255);

        Wheel[] wheels = new Wheel[4];
        wheels[0] = wheel1;
        wheels[1] = wheel2;
        wheels[2] = wheel3;
        wheels[3] = wheel4;

        Car car = new Car();
        car.setBrand("Infinity");
        car.setModel("fx25");
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setWheels(wheels);

        return car;
    }

    public static Car getCar2() {
        Engine engine = new Engine(6.0, 700, EngineType.DIESEL);
        Transmission transmission = new Transmission(TransmissionType.M, 6);
        Wheel[] wheels = new Wheel[4];
        wheels[0] = new Wheel(20, 255);
        wheels[1] = new Wheel(20, 255);
        wheels[2] = new Wheel(20, 255);
        wheels[3] = new Wheel(20, 255);

        return new Car(
                "GAZ", "3110", engine, transmission, wheels
        );
    }

    public static Car getCar3() {

        return new Car(
                "Zil",
                "138",
                new Engine(5.0, 500, EngineType.HYBRID),
                new Transmission(TransmissionType.M, 2),
                new Wheel[]{
                        new Wheel(25, 255),
                        new Wheel(25, 255),
                        new Wheel(25, 255),
                        new Wheel(25, 255)
                }
        );
    }


}
