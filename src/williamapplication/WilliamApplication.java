package williamapplication;

/*
    Make a program that use a formula to calculate 
    the force based on the input from the user.
    [Express the result and show the unit measure]
*/
import java.util.Scanner;

public class WilliamApplication {

    public static void main(String[] args) 
    {        
        // Create variables below. 
        double force= 0.0;// Variable use for force
        double m=0.0; // Variable use for mass
        double a=0.0; // Variable use for acceleration              
        // Ask the user for input.
        System.out.println("Enter the mass :");
        Scanner keyboard = new Scanner (System.in);
        m = keyboard.nextDouble();
        System.out.println("Enter the acceleration");
        a = keyboard.nextDouble();
        force=m*a;       
        // Show the result. (Example:"The value of the var is:" [*Unit measure include*])
        System.out.println("The Force is :" + force + "m/s^2");
    }
    
}
