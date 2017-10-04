// The "Assignment1and2_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment1and2_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	 /* Declare Variables Assignment 1*/
	int miles = 50;
	double km = miles*1.62;
	
	
	/* Declare Variables Assignment 2*/
	int km2 = 500;
	double miles2 = km2/1.62;
	
	
	
	c.println("     =======   Assignment 1 =======      ");
	c.println("This program converts a constant value of 50 miles to Kilometers.");
	c.println("Miles = "+miles);
	c.print(miles+" Miles is ");
	c.print(km,10,3);
	c.println(" kilometers.");
	
	
	c.println(" ");
	c.println(" ");
	c.println(" ");
	c.println(" ");
	c.println(" ");
	
	c.println("     =======   Assignment 2 =======      ");
	c.println(" This program will convert a integer value of 500 km to miles.");
	c.println("Km = "+km2);
	c.print(km2+" km is ");
	c.print(miles2,10,3);
	c.println(" miles.");
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment1and2_NeelPatel class
