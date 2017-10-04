// The "Assignment16_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment16_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Declaration of prices
	double S = 1.50;
	double M = 2.00;
	double L = 3.00;
	double X = 4.00;

	//Declaration of all global variables
	char yn;


	//Mainframe
	
	//Menu
	    c.print ("[S]mall  $");
	    c.println (S, 4, 2);
	    c.print ("[M]edium $");
	    c.println (M, 4, 2);
	    c.print ("[L]arge  $");
	    c.println (L, 4, 2);
	    c.print ("[X]Large $");
	    c.println (X, 4, 2);
	    c.println ();

	do
	{

	    double Size = 0;
	    int Qty = 0;
	    double Cost = 0, PST = 0, GST = 0, Total = 0;
	    String Sel;

	    c.println ();
	    
	    //Drink Size
	    c.print ("Enter Drink Size: ");
	    Sel = c.readString ();
	    // Quantity of Selected Size
	    c.print ("Enter the number of drinks: #");
	    Qty = c.readInt ();
	    //Drink Size tranlated into Correct Price
	    switch (Sel.charAt (0))
	    {
		case 'S': case 's':
		    Cost = 1.50 * Qty;
		    break;
		case 'M': case 'm':
		    Cost = 1.50 * Qty;
		    break;
		case 'L': case 'l':
		    Cost = 1.50 * Qty;
		    break;
		case 'X': case 'x':
		    Cost = 1.50 * Qty;
		    break;

	    }

	    // Calculations
	    PST = Cost * 0.08;
	    GST = Cost * 0.05;
	    Total = Cost + PST + GST;
	    
	    //Final Reciept Printout
	    c.print  ("Cost: $");
	    c.println(Cost,0,2);
	    c.print  ("PST: $");
	    c.println(PST,0,2);
	    c.print  ("GST: $");
	    c.println(GST,0,2);
	    c.print  ("Total: $");
	    c.println(Total,0,2);

	    //Repeater
	    c.println ("Do you wish to continue? Y/N");
	    yn = c.readChar ();
	}
	while (yn == 'Y' || yn == 'y');

	// Credits to betty wen for teaching me how to use switch statements properly









	// Place your program here.  'c' is the output console
    } // main method
} // Assignment16_NeelPatell class
