// The "Assignment4_2_NeelPatel" class.
import java.awt.*;
import java.io.*;  //Input Output package
import javax.swing.*; // dialog boxes
import java.util.*;
import hsa.Console;

public class Assignment4_2_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException
    {

	c = new Console ();
	int yn = 0;
	boolean state = false;
	do
	{
	    String Select = JOptionPane.showInputDialog ("Please Select an Operation:\n1. Create a file of String values\n2. Read strings back from file and count the vowels\n3. Read back the file into an array of string values\n4. Exit");
	    int Selection = Integer.parseInt (Select);


	    switch (Selection) //selction analyzer
	    {
		case 1:
		    {
			Option1 ();
			break;
		    }
		case 2:
		    {
			Option2 ();
			break;
		    }
		case 3:
		    {
			Option3 ();
			break;
		    }

		default:
		    {
			Select = JOptionPane.showInputDialog ("Error: Select from the options listed only");
			Selection = Integer.parseInt (Select);
		    }
	    }

	    if (Selection == 3)  // to prevent going from choosing 3 to choosing yn
		break;

	    //Repeater
	    yn = JOptionPane.showConfirmDialog (null, "Would you like to continue?");
	    if (yn != 0)
	    {
		state = false;
		System.exit (0);
	    }
	}
	while (yn == 0);
    }


    // Writes lines to
    public static void Option1 () throws IOException
    {

	String st;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("A_4_2_Strings.txt");
	outputPW = new PrintWriter (outputFW);


	PrintWriter countPW;
	FileWriter countFW;
	countFW = new FileWriter ("A_4_2_Count.txt");
	countPW = new PrintWriter (countFW);

	int count = 0;

	st = JOptionPane.showInputDialog ("Enter your text now. Use the character '^' as an EOF ON A SEPARATE LINE");

	while (!st.equals ("^"))
	{
	    outputPW.println (st); // print each string on to file
	    st = JOptionPane.showInputDialog ("Enter your text now. Use the character '^' as an EOF ON A SEPARATE LINE");
	    count += 1;
	}
	outputPW.println ("EOF");

	countPW.println (count);

	outputFW.close ();
	outputPW.close ();
	countFW.close ();
	countPW.close ();

	JOptionPane.showMessageDialog (null, "FILE HAS SUCCESSFULLY BEEN CREATED", "File Status", JOptionPane.INFORMATION_MESSAGE);

    }


    public static void Option2 () throws IOException
    {

	BufferedReader inputBR;
	FileReader inputFR;

	inputFR = new FileReader ("A_4_2_Strings.txt");
	inputBR = new BufferedReader (inputFR);

	String line = inputBR.readLine ();
	int a = 0;
	int e = 0;
	int i = 0;
	int o = 0;
	int u = 0;

	String concat = "";
	while (!line.equals ("EOF"))
	{
	    for (int Index = 0 ; Index < line.length () ; Index++)
	    {
		line = line.toLowerCase ();

		//line = line.replaceAll ("\\s", ""); //strL = Main string[Lowercase] + [No spaces]

		//line = line.replaceAll ("\\W", ""); //strL = Main string[Lowercase/Space] + [No spaces]


		switch (line.charAt (Index))
		{
		    case 'a':
			a++;
			break;
		    case 'e':
			e++;
			break;
		    case 'i':
			i++;
			break;
		    case 'o':
			o++;
			break;
		    case 'u':
			u++;
		} //switch
	    } //forloop
	    concat += line + "\n";
	    line = inputBR.readLine ();
	}
	JOptionPane.showMessageDialog (null, concat, "String Output", JOptionPane.PLAIN_MESSAGE);
	JOptionPane.showMessageDialog (null, "# of A's: " + a + "\n# of E's: " + e + "\n# of I's: " + i + "\n# of O's: " + o + "\n# of U's: " + u, "Vowel Count", JOptionPane.PLAIN_MESSAGE);
    }


    public static void Option3 () throws IOException
    {
	BufferedReader inputBR;
	FileReader inputFR;
	inputFR = new FileReader ("A_4_2_Strings.txt");
	inputBR = new BufferedReader (inputFR);

	BufferedReader countBR;
	FileReader countFR;
	countFR = new FileReader ("A_4_2_Count.txt");
	countBR = new BufferedReader (countFR);

	String line = "";
	String StringCount = countBR.readLine ();

	int count = Integer.parseInt (StringCount);

	String Strings[] = new String [count];


	for (int i = 0 ; i < count ; i++)
	{
	    Strings [i] = inputBR.readLine ();
	}

	Arrays.sort (Strings);

	for (int i = 0 ; i < count ; i++)
	{
	    c.println (Strings [i]);
	}





    }


    // Place your program here.  'c' is the output console
    // main method
} // Assignment4_2_NeelPatel class


