public class Data {

    private int number;
    private double decimalNumber;
    private String text;
    private String dataType;

    public Data(int number) {
        this.number = number;
        this.dataType = "number";
    }

    public Data(double decimalNumber) {
        this.decimalNumber = decimalNumber;
        this.dataType = "decimalNumber";
    }

    public Data(String text) {
        this.text = text;
        this.dataType = "text";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDecimalNumber() {
        return decimalNumber;
    }

    public void setDecimalNumber(double decimalNumber) {
        this.decimalNumber = decimalNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        if (this.dataType.equals("number")){
            return ""+number;
        }else if (this.dataType.equals("decimalNumber")) {
            return "" + decimalNumber;
        }else return ""+text;

    }
}
