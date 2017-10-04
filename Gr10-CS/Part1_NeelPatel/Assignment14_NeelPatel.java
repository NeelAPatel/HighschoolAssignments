// The "Assignment14_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment14_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int i=0;
	long Die1,Die2;
	long DieSum;
	int Counter2=0,Counter7=0,Counter12=0;
	
	
	
	//c.println("Die1       Die2      DieSum");
	//c.println("---------------------------");
	
	for (i=1; i<=10000;i++)
	{
	Die1 = Math.round((Math.random()*5)+1);
	Die2 = Math.round((Math.random()*5)+1);
	
	DieSum = Die1+Die2;
	
	if (DieSum == 2)
	{
	 Counter2=Counter2+1;
	}
	if (DieSum == 7)
	{
	 Counter7=Counter7+1;
	}
	if (DieSum == 12)
	{
	 Counter12=Counter12+1;
	}
	
	//c.print  (Die1,4);
	//c.print  (Die2,11);
	//c.print  (DieSum,12);
	//c.println();
	}//for loop
	
	//c.println();
	c.println("The sum was equal to 2 : "+Counter2+" times.");
	c.println("The sum was equal to 7 : "+Counter7+" times.");
	c.println("The sum was equal to 12: "+Counter12+" times.");
	

     




	// Place your program here.  'c' is the output console
    } // main method
} // Assignment14_NeelPatel class
