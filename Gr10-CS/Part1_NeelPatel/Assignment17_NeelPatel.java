// The "Assignment17_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment17_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String s1, s2;
	String s1_lwr, s2_lwr;
	int l1,l2;
	int count;
	
	char repeat;
	

	do
	{
	//Input
	c.println ("Enter String #1: ");
	s1 = c.readLine ();
	c.println ("Enter String #2: ");
	s2 = c.readLine ();
	//Indv. var declaration
	    //Lowerstings
	s1_lwr= s1.toLowerCase();
	s2_lwr= s2.toLowerCase();
	    //lengths
	l1 = s1_lwr.length ();
	l2 = s2_lwr.length ();



	count = 0;//must be initalized outside loop or else it adds previous stored number
	for (int i = 0 ; i <= (l1-l2) ; i++)
	{
	
	    String sub = s1_lwr.substring(i,i+l2); //(i,i+l2) substrings' length of query 
	    if (sub.equals (s2_lwr))
		count++;
	
	}
	if (count ==0)
	    c.println("The string  "+s2+" does not appear in the string "+s1);
	else
	    c.println("The string  "+s2+" appears "+count+" times in the string "s1);
      
	
	c.println("Retry? [Y] /[N]");
	repeat = c.readChar();
	}
	while (repeat == 'Y'||repeat =='y');

	/*  Betty Wen had helped figure out how to search. 
	    Original idea: Search from Original User input string.
	    Proper idea  : Use substrings. 
	    
	    Thank you Betty Wen
	    */
	    

	// Place your program here.  'c' is the output console
    } // main method
} // Assignment17_NeelPatel class
