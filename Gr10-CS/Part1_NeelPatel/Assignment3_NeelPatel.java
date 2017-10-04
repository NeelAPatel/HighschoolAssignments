// The "Assignment3_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	 
	double pi=3.14;
	c.println("     ===== Assignment 3 ===== ");
	c.println("This program uses a radius given by the user and uses it to");
	c.println("find the volume of a sphere.");
	c.println();
	c.print("Enter radius of sphere: ");
	double radius=c.readDouble();
	double sphere=4*pi*Math.pow(radius,3)/3;
	c.print("The volume of the sphere with the radius "+radius+" is: ");
	c.println(sphere,1,7);
  
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment3_NeelPatel class
