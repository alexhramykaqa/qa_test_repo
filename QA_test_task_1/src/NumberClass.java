import java.text.DecimalFormat;

public class NumberClass {
    final int number;

    public NumberClass(int number) {
        this.number = number;
    }

    public String compare(NumberClass otherNumber) {
        return this.number > otherNumber.number ? this.number + " > " + otherNumber.number : this.number < otherNumber.number ? this.number + " < " + otherNumber.number : this.number + " = " + otherNumber.number;
    }

    public int add(NumberClass otherNumber) {
        return this.number + otherNumber.number;
    }

    public int subtract(NumberClass otherNumber) {
        return this.number - otherNumber.number;
    }

    public String devide(NumberClass otherNumber) {
        DecimalFormat form = new DecimalFormat("#.##");
        return form.format((float) this.number / otherNumber.number);
    }

    public int multiply(NumberClass otherNumber) {
        return this.number * otherNumber.number;
    }

}
