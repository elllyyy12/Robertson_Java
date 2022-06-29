import java.util.Calendar;
import java.text.DecimalFormat;

public class RatingEngine {
    
    public static void premiumGenerator(Policy policy) {

        double premium = 0; //declared variable for premium
        DecimalFormat format = new DecimalFormat("0.00"); 

        for (Vehicle vehicle: policy.getVehicles()) { //Iterating over all the vehicles
            int vp = vehicle.getPurchasePrice(); //Vehicle purchase price
            double vpf; //vehicle price factor

            if (vehicle.getYear() < 1) {
                vpf = 0.01;
            }
            else if (vehicle.getYear() < 3) {
                vpf = 0.008;
            }
            else if (vehicle.getYear() < 5) {
                vpf = 0.007;
            }
            else if (vehicle.getYear() < 10) {
                vpf = 0.006;
            }
            else if (vehicle.getYear() < 15) {
                vpf = 0.004;
            }
            else if (vehicle.getYear() < 20) {
                vpf = 0.002;
            }
            else {
                vpf = 0.001;
            }

            Calendar cal = Calendar.getInstance();
            int currentYear = cal.get(Calendar.YEAR) - 1900; //gets the current year
            int currentMonth = cal.get(Calendar.MONTH); //gets the month
            int currentDay = cal.get(Calendar.DAY_OF_YEAR); //gets the day
            int everyday = (currentDay + currentMonth + currentYear); //combines them for the computation that if checks if the license is ok. Example the license issued to user is july 2020 then it is only 1 year because it's only june this month. 
            int dlx = everyday - Integer.parseInt(policy.getPolicyHolder().getDateOfIssue().split("/")[2]); //Calculating number of years.
            vehicle.setPremiumCharge(Double.parseDouble(format.format((vp * vpf) + ((vp / 100.0) / dlx)))); //setting premium for that vehicle.
            premium += vehicle.getPremiumCharge(); //Adding premium for each vehicle.
        }
            policy.setPolicyPremium(Double.parseDouble(format.format(premium))); //Setting premium for the policy.
    }
}
