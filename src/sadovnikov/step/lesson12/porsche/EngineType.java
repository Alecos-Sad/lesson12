package sadovnikov.step.lesson12.porsche;

public enum EngineType {

    GAZ("Бензин"),
    DIESEL("Дизель"),
    HYBRID("Гибрид"),
    ELECTRO("Ээлектро");


    private final String type;

    EngineType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "type='" + type + '\'' +
                '}';
    }
}
