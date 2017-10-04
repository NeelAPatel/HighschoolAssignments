// The "P2_Method1_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class P2_Method1_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	char yn;
	do
	{
	    c.print ("#1: ");
	    int num1 = c.readInt ();
	    c.print ("#2: ");
	    int num2 = c.readInt ();
	    c.print ("#3: ");
	    int num3 = c.readInt ();

	    biggest (num1, num2, num3);
	    c.println ("Would you like to repeat?");
	    yn = c.readChar ();
	}
	while (yn=='y'||yn=='Y');
	// Place your program here.  'c' is the output console
    } // main method


    public static void biggest (int num1, int num2, int num3)

    {
	if (num1 == num2 && num2 == num3)
	    c.println ("All three numbers are equal");
	else
	    if (num1 > num2 && num1 > num3)
		c.println ("#1 is the biggest number");
	    else
		if (num2 > num3)
		    c.println ("#2 is the biggest number");
		else
		    c.println ("#3 is the biggest number");

    } //biggest method
} // P2_Method1_NeelPatel class
