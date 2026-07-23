public class SpeedRule implements Rules {
    private String targetCarType;
    private int maxSpeed;
    private double fine = 300;

    public SpeedRule(String targetCarType, int maxSpeed) {
        this.targetCarType = targetCarType;
        this.maxSpeed = maxSpeed;
    }

    public Violation check(Information car) {
        if (car.getCarType().equals(targetCarType)) {
            if (car.getSpeed() > maxSpeed) {
                return new Violation("speed", fine, "speed of " + car.getSpeed() + " exceeded max allowed " + maxSpeed + ": ");
            }
        }
        return null;
    }
}