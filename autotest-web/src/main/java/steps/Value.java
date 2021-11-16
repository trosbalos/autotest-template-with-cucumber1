package steps;


public enum Value {
    ДОРОЖЕ("Дороже"),
    ДЕШЕВЛЕ("Дешевле"),
    ПО_УМОЛЧАНИЮ("По умолчанию"),
    ПО_ДАТЕ("По дате");


    private final String value;

    Value(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
