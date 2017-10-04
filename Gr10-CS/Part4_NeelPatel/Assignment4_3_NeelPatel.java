// The "Assignment4_3_NeelPatel" class.
import java.awt.*;
import hsa.Console;
import javax.swing.*;
import java.io.*;

public class Assignment4_3_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException
    {
	c = new Console ();


	boolean state = false;
	while (state == false)
	{
	    menu ();
	    int answer = JOptionPane.showConfirmDialog (null, "Would you like to continue?", "CONTINUE?", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
	    if (answer != 0)
	    {
		state = true;
		System.exit (0);
	    }
	}

	// Place your program here.  'c' is the output console
    } // main method


    public static void menu () throws IOException
    {
	String[] choices = {"Choose here", "1 . Create File of 50 Random character strings", "2 . Selection Sort in Ascending order", "3 . Selection Sort in Descending order", "4 . Insertion Sort in Ascending order", "5 . Insertion Sort in Descending order", "6 .  Exit"};
	String stringInput = (String) JOptionPane.showInputDialog (null, "", "MENU", JOptionPane.QUESTION_MESSAGE, null, choices, choices [0]);




	if (stringInput == null || stringInput.charAt (0) == '6') // When canceled
	    System.exit (0);
	else if ((stringInput.charAt (0)) == ('1'))
	    CreateFile ();
	else if ((stringInput.charAt (0)) == ('2'))
	    SelAscending ();
	else if ((stringInput.charAt (0)) == ('3'))
	    SelDescending ();
	else if ((stringInput.charAt (0)) == ('4'))
	    InsAscending ();
	else if ((stringInput.charAt (0)) == ('5'))
	    InsDescending ();
    }


    public static void CreateFile () throws IOException
    {

	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("A4_3_Strings.txt");
	PW = new PrintWriter (FW);
/*
	PrintWriter countPW;
	FileWriter countFW;
	countFW = new FileWriter ("A4_3_Count.txt");
	countPW = new PrintWriter (countFW);
*/

	int CharCount = 0;
	String RandomString[] = new String [50];
	String MainStr = "";

       // int x = 0;
	for (int StringCount = 1 ; StringCount <= 50 ; StringCount++)
	{
	    int StringSize = (int) (Math.random () * 15 + 1);


	    //Creates a string
	    for (CharCount = 0 ; CharCount < StringSize ; CharCount++)
	    {
		char ASCII = (char) (Math.random () * 57 + 65);
		if (CharCount == StringSize)
		{
		    c.println (ASCII);
		    MainStr = MainStr + ASCII;
		}
		else
		{
		    c.print (ASCII);
		    MainStr = MainStr + ASCII;
		}
	    }
	    c.println (); //keep just outside for loop^
	    PW.println (MainStr);
	    MainStr = "";
	    //x += 1;
	}


       // countPW.println (x);

	// closing files
	FW.close ();
	PW.close ();
	//countFW.close ();
	//countPW.close ();

	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void SelAscending () throws IOException
    {

	//Reading files in
	FileReader FR;
	BufferedReader BR;
	FR = new FileReader ("A4_3_Strings.txt");
	BR = new BufferedReader (FR);


	//Creation of Ascending file
	FileWriter FWA;
	PrintWriter PWA;
	FWA = new FileWriter ("A4_3_Selection_Ascending.txt");
	PWA = new PrintWriter (FWA);

	String RandomString[] = new String [50];

	//Read back strings and put it in array
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    RandomString [i] = BR.readLine ();
	}


	//Selection Sorting process
	for (int index = 0 ; index < RandomString.length ; index++)
	{
	    int min = index;
	    for (int y = index ; y < RandomString.length ; y++)
	    {
		if (RandomString [min].compareTo (RandomString [y]) > 0)
		{
		    min = y;
		}
	    }
	    String temp = RandomString [index];
	    RandomString [index] = RandomString [min];
	    RandomString [min] = temp;
	}


	//Printing into file
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    PWA.println (RandomString [i]);
	}

	FWA.close ();
	PWA.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void SelDescending () throws IOException
    {

	//Reading files in
	FileReader FR;
	BufferedReader BR;
	FR = new FileReader ("A4_3_Strings.txt");
	BR = new BufferedReader (FR);

	//Creation of Ascending file
	FileWriter FWD;
	PrintWriter PWD;
	FWD = new FileWriter ("A4_3_Selection_Descending.txt");
	PWD = new PrintWriter (FWD);

	String RandomString[] = new String [50];

	//Read back strings and put it in array
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    RandomString [i] = BR.readLine ();
	}


	//Selection Sorting process
	for (int index = 0 ; index < RandomString.length ; index++)
	{
	    int min = index;
	    for (int y = index ; y < RandomString.length ; y++)
	    {
		if (RandomString [min].compareTo (RandomString [y]) < 0)
		{
		    min = y;
		}
	    }
	    String temp = RandomString [index];
	    RandomString [index] = RandomString [min];
	    RandomString [min] = temp;
	}


	//Printing into file
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    PWD.println (RandomString [i]);
	}

	FWD.close ();
	PWD.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void InsAscending () throws IOException
    {

	FileReader FR;
	BufferedReader BR;
	FR = new FileReader ("A4_3_Strings.txt");
	BR = new BufferedReader (FR);

	//Creation of Ascending file
	FileWriter FWA;
	PrintWriter PWA;
	FWA = new FileWriter ("A4_3_Insertion_Ascending.txt");
	PWA = new PrintWriter (FWA);

	String RandomString[] = new String [50];

	//Read back strings and put it in array
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    RandomString [i] = BR.readLine ();
	}

	String temp = "";
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    for (int j = i + 1 ; j < RandomString.length ; j++)
	    {
		if (RandomString [i].compareToIgnoreCase (RandomString [j]) > 0)
		{
		    temp = RandomString [i];
		    RandomString [i] = RandomString [j];
		    RandomString [j] = temp;
		}
	    }
	} // Put the key in its proper location




	//Printing into file
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    PWA.println (RandomString [i]);
	}

	FWA.close ();
	PWA.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }

 public static void InsDescending () throws IOException
    {

	FileReader FR;
	BufferedReader BR;
	FR = new FileReader ("A4_3_Strings.txt");
	BR = new BufferedReader (FR);

	//Creation of Ascending file
	FileWriter FWD;
	PrintWriter PWD;
	FWD = new FileWriter ("A4_3_Insertion_Descending.txt");
	PWD = new PrintWriter (FWD);

	String RandomString[] = new String [50];

	//Read back strings and put it in array
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    RandomString [i] = BR.readLine ();
	}

	String temp = "";
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    for (int j = i + 1 ; j < RandomString.length ; j++)
	    {
		if (RandomString [i].compareToIgnoreCase (RandomString [j]) < 0)
		{
		    temp = RandomString [i];
		    RandomString [i] = RandomString [j];
		    RandomString [j] = temp;
		}
	    }
	} // Put the key in its proper location




	//Printing into file
	for (int i = 0 ; i < RandomString.length ; i++)
	{
	    PWD.println (RandomString [i]);
	}

	FWD.close ();
	PWD.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    }





} // Assignment4_3_NeelPatel class



