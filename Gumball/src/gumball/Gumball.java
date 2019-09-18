

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gumball;
import java.util.Scanner;
/**
 *
 * @author foy
 */
public class Gumball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int machineType = 0;
        OneQuarter myOneQuarter = new OneQuarter(2);
        TwoQuarters myTwoQuarters = new TwoQuarters(2);
        AllCoins myAllCoins = new AllCoins(20);
        while(machineType != -1)
        {
            System.out.println("Enter a machine type\n1. Single quarter machine \n2. Two quarter machine \n3. Multi coin machine\nEnter 1, 2, or 3");
            machineType = scanner.nextInt();
            if (machineType == 1)
            {
                myOneQuarter.insertCoins("Quarter");
                myOneQuarter.turnCrank();
                myOneQuarter.retrieve();
            } else if (machineType == 2)
            {
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.turnCrank();
                myTwoQuarters.retrieve();
            } else if (machineType == 3)
            {
                myAllCoins.insertCoins("Nickle");
                myAllCoins.insertCoins("Quarter");
                myAllCoins.insertCoins("Dime");
                myAllCoins.insertCoins("Dime");
                myAllCoins.turnCrank();
                myAllCoins.retrieve(); 
            }
            else if (machineType == 4)
            {
                myAllCoins.insertCoins("Quarter");
                myAllCoins.insertCoins("Quarter");
                myAllCoins.insertCoins("Dime");
                myAllCoins.turnCrank();
                myAllCoins.retrieve(); 
            }
            else if (machineType == 5)
            {
                myOneQuarter.insertCoins("Quarter");
                myOneQuarter.turnCrank();
                myOneQuarter.retrieve();
            }
            else if (machineType == 6)
            {
                myOneQuarter.insertCoins("Nickle");
                myOneQuarter.turnCrank();
                myOneQuarter.retrieve();
            }
            else if (machineType == 7)
            {
                myOneQuarter.insertCoins("Dime");
                myOneQuarter.insertCoins("Dime");                
                myOneQuarter.turnCrank();
                myOneQuarter.retrieve();
            }
            else if (machineType == 8)
            {
                myOneQuarter.insertCoins("Quarter");
                myOneQuarter.turnCrank();
                myOneQuarter.retrieve();
            }
            else if (machineType == 9)
            {
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.insertCoins("Penny");
                myTwoQuarters.turnCrank();
                myTwoQuarters.retrieve(); 
            }
            else if (machineType == 10)
            {
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.turnCrank();
                myTwoQuarters.retrieve();
            }
            else if (machineType == 11)
            {
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.insertCoins("Quarter");
                myTwoQuarters.turnCrank();
                myTwoQuarters.retrieve();
            }
            else if (machineType == 12)
            {
                myAllCoins.insertCoins("Nickle");
                myAllCoins.insertCoins("Quarter");
                myAllCoins.insertCoins("Dime");
                myAllCoins.insertCoins("Dime");
                myAllCoins.turnCrank();
                myAllCoins.retrieve(); 
            }
            
        }
        scanner.close();
    }
}
