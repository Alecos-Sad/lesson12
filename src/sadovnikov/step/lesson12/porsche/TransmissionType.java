package sadovnikov.step.lesson12.porsche;

public enum TransmissionType {

    M("механическая"),
    A("автоматическая");

    private final String type;

    TransmissionType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransmissionType{" +
                "type='" + type + '\'' +
                '}';
    }
}
