/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bata
 */
public class Babyfeeding {
   public static void main(String[] args) {
        double totalPorridge = 2.0;  // Liters of porridge
        double totalMilk = 2.0;  // Liters of milk
        double cupSize = 0.5;  // Half a liter per cup
        int porridgeInterval = 45;  // 45 minutes for porridge
        int milkInterval = 30;  // 30 minutes for milk

        // Calculate how many times the baby will be fed
        int porridgeFeeds = (int)(totalPorridge / cupSize);
        int milkFeeds = (int)(totalMilk / cupSize);

        // Calculate the total feeding time
        int totalPorridgeTime = porridgeFeeds * porridgeInterval;
        int totalMilkTime = milkFeeds * milkInterval;

        // Find the maximum time needed (whichever takes longer to finish)
        int totalTime = Math.max(totalPorridgeTime, totalMilkTime);

        System.out.println("The total time to finish both porridge and milk is: " + totalTime + " minutes.");
    }  
}
