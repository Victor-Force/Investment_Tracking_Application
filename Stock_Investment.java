/*
   Mini investment tracking application/software built using the concept of basic java.
 */

package sandeep;
import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Buying Price of one share that you have purchased:");
        double buyingPrice = input.nextDouble();
        
        int day = 1;
        double closingPrice;
        double[] weeklyEarnings = new double[7];
        
        int i = 0;
        while (i < weeklyEarnings.length) {
            System.out.println("Enter the closing price of day " + day + ":");
            closingPrice = input.nextDouble();
            double earning = closingPrice - buyingPrice;
            weeklyEarnings[i] = earning;
            
            if (earning > 0) {
                System.out.println("Profit for day " + day + " is: " + earning);
                System.out.printf("Earning: $%.2f\n", earning);              
                System.out.println("*********************************");
            } else if (earning < 0) {
                System.out.println("Loss for day " + day + " is: " + earning);
                System.out.printf("Loss: $%.2f\n", earning);
                System.out.println("*********************************");
            } else {
                System.out.println("No profit/loss for day " + day);
                System.out.printf("Earning: $%.2f\n", earning);
                System.out.println("*********************************");
            }
            
            day++;
            i++;
        }
        
        System.out.println("Calculate Total Earning for the whole week");
        System.out.println("*********************************");
        double totalWeeklyEarning = 0;
        
        for (int j = 0; j < weeklyEarnings.length; j++) {
            totalWeeklyEarning += weeklyEarnings[j];
            System.out.println("Earning for day " + (j + 1) + " is: " + weeklyEarnings[j]);
        }
        System.out.println("*********************************");
        System.out.println("Total earnings for the whole week: " + totalWeeklyEarning);
        System.out.println("*********************************");
        input.close();
    }

}
