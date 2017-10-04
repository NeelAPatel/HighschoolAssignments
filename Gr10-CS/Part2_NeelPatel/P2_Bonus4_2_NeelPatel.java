// The "P2_Bonus4_2_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class P2_Bonus4_2_NeelPatel
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
	    String str1_L = str1.toLowerCase();
	    c.print("Enter string 2= ");
	    String str2 = c.readLine ();
	    String str2_L = str2.toLowerCase();
	    
	   str_main(str1_L,str2_L);
	    
	    c.println ("Do you wish to continue? Y/N");
	    yn = c.readChar ();
	}
	while (yn == 'y' || yn == 'Y');

	// Place your program here.  'c' is the output console
    } // main method


    public static void str_main (String str1_L, String str2_L)
    {
       if (str1_L.charAt(str1_L.length()-1) ==str2_L.charAt(0))
	   c.println("Last character of string 1  =  first character of string 2.");
       else
	   c.println("Last character of string 1 =/= first character of string 2.");
    
    } //method str
} // P2_Bonus4_2_NeelPatel class
