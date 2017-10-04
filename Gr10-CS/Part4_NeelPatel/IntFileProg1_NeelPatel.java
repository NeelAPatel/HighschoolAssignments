// The "IntFileProg1_NeelPatel" class.
import java.awt.*;
import java.io.*; //NEED
// io = Input/Output

import hsa.Console;

public class IntFileProg1_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException    // Recognize data errors
    {
	c = new Console ();

      

	PrintWriter outputPW;   //PW = PrintWriter
	FileWriter outputFW;     // FW = FileWriter

	outputFW = new FileWriter ("IFP_1_NeelPatel.txt");
	// Name of file : XXXXX.txt
	//Location: same folder as the program.
	// to change location:   "E:\2. Compsci\1. MY ASSIGNMENTS\ XXXXXX.txt"
	outputPW = new PrintWriter (outputFW);

	int RandInt[] = new int [100];
	// index = 0 - 99
	for (int i = 0 ; i <= 99 ; i++)
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
	FR = new FileReader ("IFP_1_NeelPatel.txt");
	BR = new BufferedReader (FR);
	// NOTE ALL text files are READ BACK LINE BY LINE!
	s = BR.readLine ();

	int Sum = 0;
  
	for (int i = 0 ; i <= 99 ; i++)
	{
	    RandInt[i]= Integer.parseInt(s);
	    //c.println (s);
	    s = BR.readLine ();
	    Sum+=RandInt[i];
	}

	c.println ("Sum: " + Sum);
	double Avg = Sum/100.0;
	c.println("Avg: " + Avg);
	
	for (int i = 0; i<=99;i++)
	{
	c.print("Deviation #");
	c.print((i+1),4);
	c.print("    value");
	c.print(RandInt[i],5);
	c.print("   has a deviation of   ");
	c.println((Avg - RandInt[i]),6,2);
	}
	
	








	// Place your program here.  'c' is the output console
    } // main method
} // IntFileProg1_NeelPatel class
