package sadovnikov.step.lesson12.porsche;

public class Transmission {

    private TransmissionType type;
    private int gearCount;

    public Transmission() {
    }

    public Transmission(TransmissionType type, int gearCount) {
        this.type = type;
        this.gearCount = gearCount;
    }

    public TransmissionType getType() {
        return type;
    }

    public void setType(TransmissionType type) {
        this.type = type;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gearCount=" + gearCount +
                '}';
    }
}
