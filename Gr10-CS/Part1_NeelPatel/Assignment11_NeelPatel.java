// The "Assignment11_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment11_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int Repeat, Quantity;
	
	char SizeSel;
	double Small = 1.50;
	double Medium = 2.00;
	double Large = 3.00;
	double XL = 4.00;
	double HST = 0, Cost = 0, Total = 0, Order = 0;

	c.print (" [S] Small ");
	c.println (Small, 0, 2);
	c.print (" [M] Medium ");
	c.println (Medium, 0, 2);
	c.print (" [L] Large ");
	c.println (Large, 0, 2);
	c.print (" [X] Xtra Large ");
	c.println (XL, 0, 2);
	c.println ();

	c.print ("Enter how many times to order: ");
	Repeat = c.readInt ();

      

       
	int i = 0;
	for (i = 0 ; i < Repeat ; i++)
	{
	char Size;
	
	c.print ("Enter drink sizes: ");
	Size = c.readChar ();
	

	    SizeSel = Size;
	    c.print ("Enter quantity to order: ");
	    Quantity = c.readInt ();

	    if (SizeSel == 'S'||SizeSel == 's')
	    {
		Cost = Small * Quantity;
	    }
	    if (SizeSel == 'M'||SizeSel == 'm')
	    {
		Cost = Medium * Quantity;
	    }
	    if (SizeSel == 'L'||SizeSel == 'l')
	    {
		Cost = Large * Quantity;
	    }
	    if (SizeSel == 'X'||SizeSel == 'x')
	    {
		Cost = XL * Quantity;
	    }

	    c.print ("Cost: $");
	    c.print (Cost, 0, 2);
	    HST = Cost * 0.13;
	    Total = HST + Cost;
	    c.print ("    HST:   $");
	    c.print(HST, 0, 2);
	    c.print ("    Total: $");
	    c.println (Total, 0, 2);
	    c.println();



	} //for loop

	c.println ("Thank you for ordering. Have a nice day!");




	// Place your program here.  'c' is the output console
    } // main method
} // Assignment11_NeelPatel class
