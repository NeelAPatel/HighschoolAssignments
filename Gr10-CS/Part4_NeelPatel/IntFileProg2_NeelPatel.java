// The "IntFileProg2_NeelPatel" class.
import java.awt.*;
import java.io.*;
import hsa.Console;



public class IntFileProg2_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException 
    {
	c = new Console ();

	PrintWriter outputPW;   //PW = PrintWriter
	FileWriter outputFW;     // FW = FileWriter

	outputFW = new FileWriter ("IFP_2_NeelPatel.txt");
	// Name of file : XXXXX.txt
	//Location: same folder as the program.
	// to change location:   "E:\2. Compsci\1. MY ASSIGNMENTS\ XXXXXX.txt"
	outputPW = new PrintWriter (outputFW);

	int RandInt[] = new int [1000];
	// index = 0 - 99
	for (int i = 0 ; i <= 999 ; i++)
	{
	    RandInt [i] = (int) (Math.random () * 101);
	    outputPW.println (RandInt [i]);
	}
	outputFW.close ();
	outputPW.close ();

	//======= Read in ========

	String s;
	BufferedReader BR;
	FileReader FR;
	// the BufferedReader and FileReader are classess from java.io
	FR = new FileReader ("IFP_2_NeelPatel.txt");
	BR = new BufferedReader (FR);
	// NOTE ALL text files are READ BACK LINE BY LINE!
	s = BR.readLine ();

	int Sum1 = 0;
	int Sum2 = 0;
	double Count1 = 0;
	double Count2 = 0;
	for (int i = 0 ; i <= 99 ; i++)
	{
	    RandInt [i] = Integer.parseInt (s);
	    //c.println (s);
	    s = BR.readLine ();
	    if (RandInt [i] >= 0 && RandInt [i] <= 49)
	    {
		Sum1 += RandInt [i];
		Count1 +=1;
	    }
	    if (RandInt [i] >= 50 && RandInt [i] <= 100)
	    {
		Sum2 += RandInt [i];
		Count2 +=1;
	    }
	}
	
	//===Output===
	/*
	c.println ("Sum1: " + Sum1);
	c.println ("Count1" + Count1);
	c.println ("Sum2: " + Sum2);
	c.println ("Count1" + Count2); 
	*/
	
	c.println("hello neel.");
	
	double Avg1 = Sum1/Count1;
	double Avg2= Sum2/Count2;
	
	c.print("The Average of values between 0 - 49 is :");
	c.println(Avg1,7,2);
	c.print("The Average of values between 50 - 100 is :");
	c.println(Avg2,7,2);
	
	// Place your program here.  'c' is the output console
    } // main method
} // IntFileProg2_NeelPatel class
