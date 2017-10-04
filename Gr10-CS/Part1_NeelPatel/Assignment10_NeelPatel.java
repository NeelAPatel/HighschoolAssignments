// The "Assignment10_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment10_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int Repeat, Size, Quantity;
	double Small = 1.50;
	double Medium = 2.00;
	double Large = 3.00;
	double XL = 4.00;
	double HST = 0, Cost = 0, Total = 0, Order = 0;

	c.println ("Order Coke Here:");
	c.println ();


	c.print (" [1] Small ");
	c.println (Small, 0, 2);
	c.print (" [2] Medium ");
	c.println (Medium, 0, 2);
	c.print (" [3] Large ");
	c.println (Large, 0, 2);
	c.print (" [4] Xtra Large ");
	c.println (XL, 0, 2);
	c.println ();
	c.print ("Enter the times to repeat the program: ");
	Repeat = c.readInt ();

	for (int i = 1 ; i <= Repeat ; i++)
	{
	    c.print ("Enter drink size: ");
	    Size = c.readInt ();
	    c.print ("Enter quantity to order: ");
	    Quantity = c.readInt ();

	    while (Size < 1 || Size > 4)
	    {
		c.print ("Invalid Size!  Please enter again: ");
		Size = c.readInt ();
	    }
	    if (Size == 1)
	    {
		Cost = Small * Quantity;
	    }
	    if (Size == 2)
	    {
		Cost = Medium * Quantity;
	    }
	    if (Size == 3)
	    {
		Cost = Large * Quantity;
	    }
	    if (Size == 4)
	    {
		Cost = XL * Quantity;
	    }

	    HST = Cost * 0.13;
	    Total = Cost + HST;
	    c.print ("Cost: $");
	    c.print (Cost, 0, 2);
	    c.print ("    HST: $");
	    c.print (HST, 0, 2);
	    c.print ("    Total: $");
	    c.println (Total, 0, 2);




	    c.println ();

	} //for loop

	c.println ("Thank you for ordering. Have a nice day!");



	// Place your program here.  'c' is the output console
    } // main method
} // Assignment10_NeelPatel class
