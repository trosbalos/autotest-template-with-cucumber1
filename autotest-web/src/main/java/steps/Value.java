package steps;


public enum Value {
    ДОРОЖЕ("Дороже", 2),
    ДЕШЕВЛЕ("Дешевле", 1),
    ПО_УМОЛЧАНИЮ("По умолчанию", 101),
    ПО_ДАТЕ("По дате", 104);


    private final String value;
    private final int option;

    Value(String value, int option) {

        this.value = value;
        this.option = option;
    }

    public String getValue() {
        return value;
    }

    public int getOption() {
        return option;
    }
}
