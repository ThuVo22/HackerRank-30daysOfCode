import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        
        double tip = (mealCost/100)* tipPercent;
        double tax = (mealCost/100)* taxPercent;
        double totalCost1 = mealCost + tip + tax;
        int  totalCost = (int) Math.round(totalCost1);
        
        System.out.print("The total meal cost is " + totalCost + " dollars.");
    }
}
