// The "Assignment3_4_NeelPatel" class.
import java.awt.*;
import hsa.Console;

import java.util.*;

public class Assignment3_4_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	String Main[] = new String[10];
	for (int i = 0 ; i <= 9 ; i++)
	    Main [i] = Enter ();
	Arrays.sort (Main);
	for (int x = 0 ; x <= 9 ; x++)
	    c.println (Main [x]);
	    
	// Place your program here.  'c' is the output console
    } // main method
     public static String Enter ()
    {
	c.print ("Enter string: ");
	return c.readLine ();
    }
    
} // Assignment3_4_NeelPatel class


// Credits to Betty Wen the self-proclaimed Baka.
// Helped with: Arrays.sort and formation of UDM.
