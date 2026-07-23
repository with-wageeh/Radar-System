public class SeatBelt implements Rules{
    private double price = 100;
    private String message = "Seatbelt not fastned :";
    public Violation check(Information car){
        if(car.isStatusBelt() == false){
            return new Violation("belt" , price , message);
        }else return null;
    }
}
