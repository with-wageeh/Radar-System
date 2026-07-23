public class Main {
    public static void main(String[] args) {
        Radar radar = new Radar();

        radar.addRule(new SpeedRule("Truck", 60));
        radar.addRule(new SpeedRule("Private", 80));
        radar.addRule(new SpeedRule("Bus", 70));

        radar.addRule(new SeatBelt());

        Information car1 = new Information("ABC1234", 20260724, "Private", 94, false);
        Information car2 = new Information("TRK999", 20260724, "Truck", 50, true);
        Information car3 = new Information("XYZ7890", 20260724, "Truck", 75, false);
        Information car4 = new Information("DEF5678", 20260724, "Private", 70, false);
        Information car5 = new Information("BUS111", 20260724, "Bus", 90, true);

        radar.getNumberOfViolations(car1);
        radar.getNumberOfViolations(car2);
        radar.getNumberOfViolations(car3);
        radar.getNumberOfViolations(car4);
        radar.getNumberOfViolations(car5);

        System.out.println("\n--- Summary of All Fines ---");
        radar.getAllFines();

        System.out.println("\n--- Summary of All Violated Rules ---");
        radar.getAllViolated();
    }
}