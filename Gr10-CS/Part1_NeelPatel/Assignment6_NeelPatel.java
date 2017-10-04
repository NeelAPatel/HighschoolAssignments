// The "Assignment5_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment6_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//User defined marks
	//Calculates Average of the three marks
	
	/**/
	
	
	
	//Declatation
	double MarkA,MarkB,MarkC,Avg;
	
	c.println("Enter your marks");
	c.println();
	
	//First Mark
	c.print  ("Mark A: ");
	MarkA=c.readDouble();
	while (MarkA<80 || MarkA>100)    
	 {
	  c.print("Value is invalid. Please re-enter between 80-100 : ");
	  MarkA=c.readDouble();
	 }
	
	//Second Mark  
	c.println(); 
	c.print  ("Mark B: ");
	MarkB=c.readDouble(); 
	while (MarkB<80 || MarkB>100)
	 {
	  c.print("Value is invalid. Please re-enter between 80-100 : ");
	  MarkB=c.readDouble();
	 }
	
	 //Third Mark
	c.println();
	c.print  ("Mark C: ");
	MarkC=c.readDouble(); 
	  
	while (MarkC<80 || MarkC>100)
	 {
	  c.print("Value is invalid. Please re-enter between 80-100 : ");
	  MarkC=c.readDouble();
	 }
	     
	
	
	//Calculate Average
	Avg=(MarkA + MarkB + MarkC)/3;
	c.print  ("The average of the three marks is ");
	c.print  (Avg,0,2);
	c.println("%.");
	
	
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment5_NeelPatel class
