// The "P2_Bonus4_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class P2_Bonus4_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	char yn;
	
	
	
	do
	{
	    c.print("Enter string 1= ");
	    String str1 = c.readLine ();
	    c.print("Enter string 2= ");
	    String str2 = c.readLine ();
	    
	   str_main(str1,str2);
	    
	    c.println ("Do you wish to continue? Y/N");
	    yn = c.readChar ();
	}
	while (yn == 'y' || yn == 'Y');

	// Place your program here.  'c' is the output console
    } // main method


    public static void str_main (String str1, String str2)
    {
       if (str1.charAt(str1.length()-1) ==str2.charAt(0))
	   c.println("Last character of string 1  =  first character of string 2.");
       else
	   c.println("Last character of string 1 =/= first character of string 2.");
    
    } //method str
} // P2_Bonus4_NeelPatel class
