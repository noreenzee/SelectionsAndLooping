/* Noreen Akhtar*/
package calculatetip;
import java.util.Scanner;


public class CalculateTip
{

   
    public static void main(String[] args)
    {
        Scanner tip;
        tip = new Scanner(System.in);
        
        System.out.print("Enter the total amount of the bill: $");
        double billAmount = tip.nextDouble();
        
        System.out.print("Enter the gratuity rate (as a whole number): ");
        int gratuityRate = tip.nextInt();
        
        double gratuityAmount = billAmount * (gratuityRate / 100.0);
        
        // Calculate the total bill
        double totalBill = billAmount + gratuityAmount;
        
        
        System.out.printf("Gratuity: $%.2f\n", gratuityAmount);
        System.out.printf("Total bill: $%.2f\n", totalBill);
        
        
        tip.close();
        
    }
    
}
