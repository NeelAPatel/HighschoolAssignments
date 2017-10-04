// The "Assignment4_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment4_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	//This program will read length, width, and height from user.
	//It will use these numbers to calculate volume of the specified box.
	
	double Length,Width,Height,Volume;
	
	c.println("Enter the dimensions");
	c.println("--------------------");
	c.println();
	c.print  ("Length: ");
	Length=c.readDouble();
	c.print  ("Width : ");
	Width =c.readDouble();
	c.print  ("Height: ");
	Height=c.readDouble();
	
	Volume=Length*Width*Height;
	c.print("The volume of the cube is: ");
	c.print(Volume,0,5);
	
   
	
       
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment4_NeelPatel class
