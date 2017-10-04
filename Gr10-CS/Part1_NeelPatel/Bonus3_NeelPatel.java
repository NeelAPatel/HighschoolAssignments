// The "Bonus3_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Bonus3_NeelPatel
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
	    c.println ("strL = " + strL);
	    strL = strL.replaceAll ("\\s", ""); //strL = Main string[Lowercase] + [No spaces]
	    c.println ("strL = " + strL);
	    strL = strL.replaceAll ("\\W", ""); //strL = Main string[Lowercase/Space] + [No spaces]
	    c.println ("strL = " + strL);
	    
	    
	    sLen = strL.length ();
	    c.println ("sLen = " + sLen);
	    for (a = 0 ; a < sLen ; a++)
	    {
		if (strL.charAt (a) == strL.charAt (((sLen - 1) - a)))
		{
		c.println("charAt("+a+") = OK!");
		}
		else
		{
		    break;
		}


	    }
	   
	    
	    if (a == sLen)
		c.println ("Your phrase is a palindrome!");
	    else
		c.println ("Sorry it is not a palindrome");



	    c.println ("Do you wish to continue?");
	    yn=c.readChar();
	}
	while (yn =='Y'||yn=='y');


	// Place your program here.  'c' is the output console
    } // main method
} // Bonus3_NeelPatel class


