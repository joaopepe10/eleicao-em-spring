package joaopepe10.com.github.eleicao.enums;

public enum StatusEnum {
    Registered(0, "Registered"),
    InVoting(1, "InVoting"),
    Closed(2, "Closed");
    private final int intValue;
    private final String stringValue;

    private StatusEnum(int value, String stringValue){
        this.intValue =  value;
        this.stringValue = stringValue;
    }

    public int getIntValue(){
        return intValue;
    }

    @Override
    public String toString() {
        return stringValue;
    }
}
