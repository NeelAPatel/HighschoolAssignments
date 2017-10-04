// The "Assignment13_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment13_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
       //Math.floor(var or function) will round down to nearest integer.
       //Math.random(); will give a random number between 0&1. (includes decimals)
       //Math.random()*10  will give a random number from 0 to 9 (includes decimals)
       //Math.floor((Math.random()*10)) will give a random number from 0 - 9 ONLY INTEGERS
       //Math.floor((Math.random()*10)+1) will give a random number from 1-10 ONLY INTEGERS
       //(int)((Math.random()*10)+1) random INTEGER from 1 - 10
       
       int i=0;
       long Die;
       int counter=0;
       
       for (i=1;i<=10000;i++)
       {
       Die = Math.round((Math.random()*5)+1);
       
       if (Die>=3.0)
	{
	counter = counter+1;
	}
       //c.print(Die,2);
       
       }
       //c.println();
       c.println("Number of times 3 or higher value was rolled: "+counter);
     //   c.println("Math.random();   returns a number between 0&1");
     //   c.println("Math.floor((Math.random()*10)+1);   returns a number between 1 and 10");
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment13_NeelPatel class
