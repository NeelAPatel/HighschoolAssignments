// The "Assignment3_6_NeelPatel" class.
import java.awt.*;
import hsa.Console;

import java.util.*; //Array sort activator.

public class Assignment3_6_NeelPatel
{
    static Console c;           // The output console

    //MAIN Method
    public static void main (String[] args)
    {
	c = new Console ();

	int RandInt[] = new int [100];

	int H = 0, L = 0;
	
	c.println ("What is the minimum (low) value? ");
	L = c.readInt ();
	c.println ("What is the maximum (high) value? ");
	H = c.readInt ();


	for (int i = 0 ; i <= 99 ; i++)
	    RandInt [i] = Num (L, H);
	
	ChooseOrder(RandInt);
    
    } // main method
    
    
    // CHOOSEORDER method: Chooses order of how to sort the array =====================================
    public static void ChooseOrder(int RandInt[])
    {
	c.println ("Enter 1 to sort in ascending order or 2 to sort in descending order");
	int Order = c.readInt ();

	switch (Order)
	{
	    case 1:
		Ascending (RandInt);
		break;

	    case 2:
		Descending (RandInt);
		break;
	    default:
		c.println ("Invalid Number");
	}
	
	
    
    }
 
    // NUM Method: Assigns 100 random integers            =============================================
    public static int Num (int L, int H)
    {
	return (int) (Math.random () * (H - L + 1)) + L;
    } // Num method



    // ASCENDING method: Sorts in ascending order        ==========================================
    public static void Ascending (int RandInt[])
    {
	Arrays.sort (RandInt);
	Print (RandInt);
    }


    // DESCENDING method: Sorts in decending order==========================================
    public static void Descending (int RandInt[])
    {
	int temp;
	for (int Count = 0 ; Count < RandInt.length ; Count++)  //Repeats Shuffle process 100 times
	    for (int i = 0 ; i < RandInt.length - 1 ; i++)     // ^ Shuffles 99 times as we play with 1 number each time
	    {
		if (RandInt [i] < RandInt [i + 1])
		{
		    temp = RandInt [i + 1];          // Temp = 2nd number
		    RandInt [i + 1] = RandInt [i];   // 2nd  = 1st
		    RandInt [i] = temp;              // 1st = Temp (which USED TO equal to 2nd)
		}
	    }
	 Print(RandInt);
     }

    // Print Out Array                            ========================================
    public static void Print (int RandInt[])
    {
	for (int i = 0 ; i <= 99 ; i++)
	    c.print (RandInt [i], 4);
    }
} // Assignment3_6_NeelPatel class


