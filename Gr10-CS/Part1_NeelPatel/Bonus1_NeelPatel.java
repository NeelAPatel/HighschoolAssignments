// The "Bonus1_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Bonus1_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();


	/*
	Write a program that generates a random year between 1600 and
	2000 and then reports if it is a leap year. A leap year is an
	integer that is either divisible by 400 or is divisible by 4
	but not 100.
	Your program must include a minimum of 5 user comments with a
	loop allowing the user to repeat the program over again  */

	//Declaration
	int year = 0;
	String yn;
	
       //do loop mainframe
	do
	{
	    // Random year generator
	    year = (int) (Math.random () * 401) + 1600;

	    //decides if year is leap year or not
	    if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0))
		c.println (year + " Yes ");
	    else
		c.println (year + " No  ");


	    //Repeater
	    c.println ("Would you like to try again? Y / N");
	    yn = c.readString ();
	}
	while( yn.equalsIgnoreCase("y") );



	/*
	Credits for Deciding if statement:  Betty Wen
	She made it work. I thought of putting all of them together.
	Made it work by :  "Mod" ==> "%"

	THUS THIS WORK IS A COLLABORATION.
	*/


	// Place your program here.  'c' is the output console
    } // main method
} // Bonus1_NeelPatel class


