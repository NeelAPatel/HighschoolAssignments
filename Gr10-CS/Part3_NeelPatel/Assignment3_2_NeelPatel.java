// The "Assignment3_2_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_2_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int Value[] = new int [26];
	for (int i = 0 ; i <= 25 ; i++)
	{
	    Value [i] = (int) Math.pow (i, 3);
	}

	for (int i = 0 ; i < 5 ; i++)
	{
	    c.print (Value [i],7);
	}
	c.println ();
	for (int i = 6 ; i <= 10 ; i++)
	{
	    c.print (Value [i],7);
	}
	c.println ();
	for (int i = 11 ; i <= 15 ; i++)
	{
	    c.print (Value [i],7);
	}
	c.println ();

	for (int i = 16 ; i <=20 ; i++)
	{
	    c.print (Value [i],7);
	}
	c.println ();

	for (int i = 21 ; i <= 25 ; i++)
	{
	    c.print (Value [i],7);
	}
	c.println ();


	// Place your program here.  'c' is the output console
    } // main method
} // Assignment3_2_NeelPatel class
