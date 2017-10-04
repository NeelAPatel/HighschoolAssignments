// The "Bonus2_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Bonus2_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//declaration

	int a;          //Main generated number
	String A;       //converted into string

	int h, t, o;    //indiv digits from main number
	String H, T, O; //substringed digits

	int h3, t3, o3; // cubes of h/t/o
	int sum;        // sum of h,t,o

	for (a = 100 ; a <= 999 ; a++)
	{
	    A = Integer.toString (a);
	    H = A.substring (0, 1);
	    T = A.substring (1, 2);
	    O = A.substring (2, 3);

	    h = Integer.parseInt (H);
	    t = Integer.parseInt (T);
	    o = Integer.parseInt (O);

	    h3 = h * h * h;
	    t3 = t * t * t;
	    o3 = o * o * o;

	    sum = h3 + t3 + o3;

	    if (sum == a)
		c.println (a);

	}
	
	c.println("End of execution");





	// Place your program here.  'c' is the output console
    } // main method
} // Bonus2_NeelPatel class
