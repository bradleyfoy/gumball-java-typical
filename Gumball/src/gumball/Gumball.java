

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
        GumballMachine myGumball = new GumballMachine(2);
        Scanner scanner = new Scanner(System.in);
        int coinValue = 0;
        while(coinValue != -1)
        {
            System.out.println("Enter a coin value");
            coinValue = scanner.nextInt();
            myGumball.insertQuarter(coinValue);
            myGumball.turnCrank();
        }
    }
}
