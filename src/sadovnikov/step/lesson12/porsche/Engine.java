package sadovnikov.step.lesson12.porsche;

public class Engine {

    private double volume;
    private int power;
    private EngineType engineType;

    public Engine() {
    }

    public Engine(double volume) {
        this.volume = volume;
    }

    public Engine(double volume, int power, EngineType engineType) {
        this.volume = volume;
        this.power = power;
        this.engineType = engineType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", power=" + power +
                ", engineType=" + engineType +
                '}';
    }
}
