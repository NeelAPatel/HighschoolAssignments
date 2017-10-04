// The "Assignment18_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment18_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.print("Enter the string you wish to show in tapered form:  ");
	String str = c.readLine();
	
	for (int i = 0; i <= str.length(); i++)
	{
	c.println(str.substring(0,i));
	}
	
	
	
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment18_NeelPatel class
