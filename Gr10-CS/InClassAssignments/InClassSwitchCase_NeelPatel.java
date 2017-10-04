// The "InClassSwitchCase_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class InClassSwitchCase_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int op;
	int fail = 0;
	int poor = 0;
	int good = 0;
	int excellent = 0;
	
	for (int i = 0;i<10;i++)
	{    
	c.print("Enter op value between 1-10: ");
	op = c.readInt();
	
	switch (op)
	{
	case 1:case 2:case 3: case 4:
	    fail++;
	    break;
	case 5: case 6:
	    poor++;
	    break;
	case 7: case 8: case 9:
	    good++;
	    break;
	case 10:
	    excellent++;
	    break;
	default:c.println("Error");
	}
	}
	c.println(fail);
	c.println(poor);
	c.println(good);
	c.println(excellent);
	// Place your program here.  'c' is the output console
    } // main method
} // InClassSwitchCase_NeelPatel class
