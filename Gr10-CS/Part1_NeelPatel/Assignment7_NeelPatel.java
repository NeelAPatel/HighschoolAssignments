// The "Assignment7_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment7_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//quadratic equation
	  // a =/= 0
	  //
	double A,B,C1;
	double Ans1, Ans2;

	c.print  ("Enter Value of A: ");
	A=c.readDouble();
	c.print  ("Enter Value of B: ");
	B=c.readDouble();
	c.print  ("Enter Value of C: ");
	C1=c.readDouble();

	Ans1=( (-B+(Math.sqrt(B*B-4*A*C1)))/(2*A) );
	
	Ans2=( (-B-(Math.sqrt(B*B-4*A*C1)))/(2*A) );
	
	c.print("The first root of the equation is ");
	c.println(Ans1,0,2);
	c.print("The second root of the equation is ");
	c.println(Ans2,0,2);
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment7_NeelPatel class
