import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Radar {
    Vector<Rules>rules = new Vector<>();
    Map<String,Integer>countViolations = new HashMap<>();
    Map<String , Double>fines = new HashMap<>();

    public void getNumberOfViolations(Information car){
        double cnt = 0;
        Vector<String>fine = new Vector<>();
        for (int i = 0; i < rules.size(); i++) {
            Violation v = rules.get(i).check(car);
            if(v!=null){
                cnt += v.getPrice();
                fine.add(v.getMessage() + " " + v.getPrice());
                countViolations.put(v.getName(), countViolations.getOrDefault(v.getName(), 0) + 1);            }
        }
        fines.put(car.getNumber() , fines.getOrDefault(car.getNumber() , 0.0) + cnt);
       if(fine.size() >= 1) {
           System.out.println("Fine of Car: " + car.getNumber());
           System.out.println("Total amount : " + cnt + " EGP");
           for (int i = 0; i < fine.size(); i++) {
               System.out.println(fine.get(i) + " EGP");
           }
       }
    }


    public void addRule(Rules r){
        rules.add(r);
    }
    public void getAllFines(){
        for (Map.Entry<String, Double> x : fines.entrySet()) {
            String carNumber = x.getKey();
            Double count = x.getValue();
            System.out.println("Fine of Car: " + carNumber );
            System.out.println("Total amount : " + count);
        }
    }
    public void getAllViolated(){
        for (Map.Entry<String, Integer> x : countViolations.entrySet()) {
            String v = x.getKey();
            int count = x.getValue();
            System.out.println("Violation Of : " + v  + " and the count of them = " + count);
        }
    }


}
