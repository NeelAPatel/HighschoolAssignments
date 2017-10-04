// The "Assignment5_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment5_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//User defined marks
	//Calculates Average of the three marks
	
	
	double A,B,C,Avg;
	c.println("Enter your marks");
	c.println();
	c.print  ("Mark A: ");
	A=c.readDouble();
	c.print  ("Mark B: ");
	B=c.readDouble();
	c.print  ("Mark C: ");
	C=c.readDouble();
	c.println();
	Avg=(A+B+C)/3;
	c.print  ("The average of the three marks is ");
	c.print  (Avg,0,2);
	c.println("%.");
	
	
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment5_NeelPatel class
