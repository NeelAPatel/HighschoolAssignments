// The "Assignment3_3_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_3_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//Declare Arrays
	int Rndm[] = new int [10000]; // 10000 blocks
	int Counter[] = new int [49]; // 49 blocks

	int i = 0; //Use for Rndm[] Index Value

	int x = 0; //Use for Counter[] Index Value



	//Assign random integers to 10000 blocks
	for (i = 0 ; i < 10000 ; i++)
	{
	    Rndm [i] = (int) ((Math.random () * 49) + 1);
	    //  c.print (Rndm [i], 3);

	    for (x = 0 ; x < 49 ; x++)
	    {
		if (Rndm [i] == (x + 1))
		    Counter [x] = Counter [x] + 1;

	    }
	}

	for (x = 1 ; x <= 49 ; x++)
	{
	    c.println ("# of " + x + "'s :" + Counter [x - 1]);
	}





	// Place your program here.  'c' is the output console
    } // main method
} // Assignment3_3_NeelPatel class


