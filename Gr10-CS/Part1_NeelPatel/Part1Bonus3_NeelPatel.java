// The "Part1Bonus3_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Part1Bonus3_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String str, strL;
	int a = 0;
	int sLen = 0;
	char yn;

	do
	{
	    c.println ("Enter your phrase:");
	    c.print ("str = ");
	    str = c.readLine ();

	    strL = str.toLowerCase ();
	    //c.println ("strL = " + strL);
	    strL = strL.replaceAll ("\\s", ""); //strL = Main string[Lowercase] + [No spaces]
	    //c.println ("strL = " + strL);
	    strL = strL.replaceAll ("\\W", ""); //strL = Main string[Lowercase/Space] + [No spaces]
	    //c.println ("strL = " + strL);


	    sLen = strL.length ();
	    //c.println ("sLen = " + sLen);
	    for (a = 0 ; a < sLen ; a++)
	    {
	    // a = counter/repeat var
	    //a must always be 1 less than length due to an index "0"
	    //a++ = incrementer
	    
		if (strL.charAt (a) == strL.charAt (  (   (sLen - 1) - a)  )   )
		{
		   //if char at #current index = last char -1 - #current index
		   //keep going
		}
		else
		{
		    break; //stop everything 
		}
	    }


	    if (a == sLen)
		c.println ("Your phrase is a palindrome!");
	    else
		c.println ("Sorry it is not a palindrome");

	    c.println ("Do you wish to continue?");
	    yn = c.readChar ();
	}
	while (yn == 'Y' || yn == 'y');


	// Place your program here.  'c' is the output console
    } // main method
} // Part1Bonus3_NeelPatel class


