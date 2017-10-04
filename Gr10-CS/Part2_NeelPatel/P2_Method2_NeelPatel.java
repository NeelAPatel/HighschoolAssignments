// The "P2_Method2_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class P2_Method2_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	char yn;
	do
	{
	    c.println ("Enter the coordinates:");
	    c.print ("Point 1: X= ");
	    double x1 = c.readDouble ();
	    c.print ("         Y= ");
	    double y1 = c.readDouble ();

	    c.print ("Point 2: X= ");
	    double x2 = c.readDouble ();
	    c.print ("         Y= ");
	    double y2 = c.readDouble ();

     
	
	    
	 
	if (x2==x1)
	    c.println ("Error: Division by 0");
	else
	    slope(x1,y1,x2,y2);      
	
	    
	c.println("Repeat?");
	yn = c.readChar();
	}
	while (yn == 'Y' || yn == 'y');
	// Place your program here.  'c' is the output console
    } // main method


    public static void slope (double x1, double y1, double x2, double y2)
    {
      double S = (y2-y1)/(x2-x1);
      c.println(S);
    }
} // P2_Method2_NeelPatel class
