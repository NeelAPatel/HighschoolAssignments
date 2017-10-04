// The "Assignment3_1_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_1_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int Main[] = new int [20];

	for (int i = 0 ; i < 20 ; i++)
	{
	    Main [i] = (int) (Math.random () * 101);
	    //c.println (Main [i]);
	}


	int sum = 0;
	for (int index = 0 ; index < 20 ; index++)
	    sum = sum + (Main [index]);


	//c.println(sum);
	double avg = sum / 20.0;
	//c.println (avg, 10, 10);
	c.println ("Value    Average    Deviation");

	for (int i = 0 ; i < 20 ; i++)
	{
	c.print(Main[i]);
	c.print("       "+avg);
	c.print("         ");
	c.println(Main[i]-avg,6);
	}
	




	// Place your program here.  'c' is the output console
    } // main method
} // Assignment3_1_NeelPatel class
