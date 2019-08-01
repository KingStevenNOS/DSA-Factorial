/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;
import java.util.Scanner;

/**
 *
 * @author Steve Nyanumba
 */
public class Factorial {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You entered " + number + "\n");
        System.out.println(number+"! = " + factorial(number));
    }

   
    public static int factorial(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException();
        }
        else if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}