import java.util.Scanner;
import java.text.DecimalFormat;
public class tipProject {
    public static void main (String[] args){
        DecimalFormat df;
        df = new DecimalFormat(".00");
        // welcoming the user and asking for number of people and tip percentage
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator!!!!");
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage (0-100) ");
        int tipPercentage = scan.nextInt();
        double totalCost = 0.0;

       // asks the price of each meal until the user types -1

        System.out.print("Enter the cost of a meal or type -1 to stop asking.: ");
        double mealPrice = scan.nextDouble();
        totalCost += mealPrice;
        while (mealPrice!=-1){
            System.out.print("Enter the cost of a meal or type -1 to stop asking.: ");
            mealPrice = scan.nextDouble();
            totalCost += mealPrice;
        }
        double tip = totalCost * (tipPercentage/100.0); // initializing variables to include in the receipt
        double totalCostAftTip = totalCost + tip;
        double perPersonPreTip = totalCost/numPeople;
        double tipPerPerson = tip/numPeople;
        double perPersonAftTip = totalCostAftTip/numPeople;
        System.out.println("Your Receipt: "); // printing out the receipt
        System.out.println("-------------------");
        System.out.println("Your total bill before tip is: " + df.format(totalCost));
        System.out.println("Tip: " + df.format(tip));
        System.out.println("Your total bill after tip is: " + df.format(totalCostAftTip));
        System.out.println("Cost per Person before tip: " + df.format(perPersonPreTip));
        System.out.println("Tip per person: " + df.format(tipPerPerson));
        System.out.println("Total cost per person: " + df.format(perPersonAftTip));
    }
}
