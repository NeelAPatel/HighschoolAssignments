// The "P2_Method3_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class P2_Method3_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	char yn;
	do
	{
	    c.print ("Enter A: ");
	    double s1 = c.readDouble ();
	    c.print ("Enter B: ");
	    double s2 = c.readDouble ();
	    c.print ("Enter C: ");
	    double s3 = c.readDouble ();

	    double s = (s1 + s2 + s3) / 2;

	    if (s > s1 && s > s2 && s > s3)
	    {
		c.print ("The area of the triangle is "); 
		c.println (area (s1, s2, s3, s));
	    }
	    else
		c.println ("-1");

	    c.println("Would you like to repeat again? Y/N");
	    yn = c.readChar ();
	    c.println();
	}
	while (yn == 'Y' || yn == 'y');

	// Place your program here.  'c' is the output console
    } // main method


    public static double area (double s1, double s2, double s3, double s)
    {
	double area = (Math.sqrt (s * (s - s1) * (s - s2) * (s - s3)));
	return area;
    } // triangle method
} // P2_Method3_NeelPatel class
