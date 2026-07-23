public class Violation {
    private String v;
    private double price;
    private String message;

    public Violation(String s , double p , String message){
        this.v = s;
        this.price = p;
        this.message = message;
    }

    public String getName() {
        return v;
    }
    public String getMessage() {
        return message;
    }

    public double getPrice() {
        return price;
    }
}