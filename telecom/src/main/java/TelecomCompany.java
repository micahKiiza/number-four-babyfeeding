/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bata
 */
public class TelecomCompany {
  public static void main(String[] args) {
        double airtimeLoaded = 10000;  // UGX 10,000
        double deductionPercentage = 0.10;  // 10% deduction on airtime load
        int callDurationSeconds = 5 * 60;  // 5 minutes in seconds
        int callRatePerSecond = 200;  // UGX 200 per second

        // Calculate the deduction for loading airtime
        double initialDeduction = airtimeLoaded * deductionPercentage;
        double balanceAfterLoad = airtimeLoaded - initialDeduction;

        // Calculate the cost of the call
        double callCost = callDurationSeconds * callRatePerSecond;

        // Calculate the remaining balance
        double remainingBalance = balanceAfterLoad - callCost;

        System.out.printf("The remaining balance after the call is: UGX %.2f\n", remainingBalance);
    }  
}
