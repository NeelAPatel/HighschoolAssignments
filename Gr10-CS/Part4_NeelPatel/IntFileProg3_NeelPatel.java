// The "IntFileProg3_NeelPatel" class.
import java.awt.*;
import java.io.*; //files
import java.util.*; //Arrays.sort
import javax.swing.*; //dialog boxes
import hsa.Console;

//          http://mathbits.com/MathBits/Java/arrays/Binary.htm

public class IntFileProg3_NeelPatel
{
    static Console c;           // The output console


    public static void main (String[] args) throws IOException
    {

	c = new Console ();

	String Continue;
	int yn;

	do
	{
	    int RandInt[] = new int [100];
	    String Select = JOptionPane.showInputDialog ("1. Create a file of random integers between 0 and 1000\n2. Read back and sort\n3. Binary Search\n4. Linear Search");
	    int Optionx = Integer.parseInt (Select);

	    switch (Optionx)
	    {
		case 1:
		    RandInt = CreateFile (RandInt);
		    break;
		case 2:
		    ReadSort (RandInt);
		    break;
		case 3:
		    BinarySearch (RandInt);
		    break;
		case 4:
		    LinearSearch (RandInt);
		    break;
		default:
		    while (Optionx > 4 || Optionx < 0)
		    {    
		    Select = JOptionPane.showInputDialog(null,"Error: Choose an option from below.\n1. Create a file of random integers between 0 and 1000\n2. Read back and sort\n3. Binary Search\n4. Linear Search","Error: Option Not Found");
		    Optionx = Integer.parseInt(Select);
		    }   
	    } //Case

	    Continue = JOptionPane.showInputDialog (null, "Do you wish to continue?\n1 for Yes, 2 for No"," Continue? ", JOptionPane.ERROR_MESSAGE);
	    yn = Integer.parseInt (Continue);
	}
	while (yn == 1);

    } //main


    public static int[] CreateFile (int RandInt[]) throws IOException //======================================================================================
    {
	PrintWriter outputPW;   //PW = PrintWriter
	FileWriter outputFW;     // FW = FileWriter

	outputFW = new FileWriter ("IFP_3_NeelPatel.txt");
	// Name of file : XXXXX.txt
	//Location: same folder as the program.
	// to change location:   "E:\2. Compsci\1. MY ASSIGNMENTS\ XXXXXX.txt"
	outputPW = new PrintWriter (outputFW);


	// index = 0 - 99
	for (int i = 0 ; i <= 99 ; i++)
	{
	    RandInt [i] = (int) (Math.random () * 1001);
	    outputPW.println (RandInt [i]);
	}

	JOptionPane.showMessageDialog (null, "FILE HAS SUCCESSFULLY BEEN CREATED", "File Status", JOptionPane.INFORMATION_MESSAGE);
	outputFW.close ();
	outputPW.close ();
	return RandInt;
    } //CreateFile


    // =========Read back in======
    public static int[] ReadSort (int RandInt[]) throws IOException //============================================================================================
    {
	String s;
	BufferedReader BR;
	FileReader FR;
	// the BufferedReader and FileReader are classess from java.io
	FR = new FileReader ("IFP_3_NeelPatel.txt");
	BR = new BufferedReader (FR);
	// NOTE ALL text files are READ BACK LINE BY LINE!
	s = BR.readLine ();

	for (int i = 0 ; i <= 99 ; i++)
	{
	    RandInt [i] = Integer.parseInt (s);
	    //c.println (s);
	    s = BR.readLine ();
	}
	Arrays.sort (RandInt);
	/*for (int i = 0 ; i <= 99 ; i++)
	{
	    c.println (RandInt [i]);
	}
	*/
	JOptionPane.showMessageDialog (null,"Array Sorted", "Array Status", JOptionPane.INFORMATION_MESSAGE);
	return RandInt;
    } //ReadSort


    public static void BinarySearch (int RandInt[])  //===================================================================================================
    {
    
   //Prints array in C Console 
	for (int SearchNum =0; SearchNum<= 99 ; SearchNum++)
	{
	 c.println(RandInt[SearchNum]);
	}
	
    // decides on what number to look for    
	String SNum = JOptionPane.showInputDialog("What number are you looking for?");
	int Num = Integer.parseInt(SNum); 

	int LowBound = 0; // Lowest index possible
	int UpBound = RandInt.length - 1;//Highest index possible 0 to 99 = 100 values thus 100-1 = 99
	
	int position = (LowBound + UpBound) / 2;

	while ((RandInt [position] != Num) && (LowBound <= UpBound))
	{
	    if (RandInt [position] > Num)
		UpBound = position - 1;
	    else
		LowBound = position + 1;

	    position = (LowBound + UpBound) / 2;
	}
	
	/*while ((RandInt [position] != Num) && (LowBound >= UpBound))
	{
	    if (RandInt [position] > Num)
		UpBound = position - 1;
	    else
		LowBound = position + 1;

	    position = (LowBound + UpBound) / 2;
	}
	*/
	
	if (RandInt[position] == Num)
	    JOptionPane.showMessageDialog (null,"The number was found in the array subscript " + position,"Location Found",JOptionPane.PLAIN_MESSAGE);
	else
	    JOptionPane.showMessageDialog (null, "Error: Number not found", "Error",JOptionPane.PLAIN_MESSAGE);
    } //Search
    
    
    public static void LinearSearch (int RandInt[]) 
    {
      //Asks user what number to search for
	String SNum = JOptionPane.showInputDialog("What number are you looking for?");
	int Num = Integer.parseInt(SNum); 
	
	for (int position = 0; position <=99 ; position++)
	{
	if (RandInt[position] == Num)
	    JOptionPane.showMessageDialog (null,"The number was found in the array subscript " + position,"Location Found",JOptionPane.PLAIN_MESSAGE);
	else
	    //JOptionPane.showMessageDialog (null, "Error #101: Number not found", "Number not found",JOptionPane.PLAIN_MESSAGE);
	    c.println("nope " + Num);
	}
    
    
    }
    
    


    // Place your program here.  'c' is the output console

} // IntFileProg3_NeelPatel class


