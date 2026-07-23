public class Information {
    private  String number;
    private int date;
    private String carType;
    private int speed;
    boolean StatusBelt;

    public Information(String number , int date , String type , int speed , boolean belt){
        this.number = number;
        this.carType = type;
        this.date = date;
        this.speed = speed;
        this.StatusBelt = belt;
    }

    public String getNumber() {
        return number;
    }

    public int getDate() {
        return date;
    }

    public String getCarType() {
        return carType;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isStatusBelt() {
        return StatusBelt;
    }
}