// The "Assignment4_1_NeelPatel" class.
import java.awt.*;
import java.io.*;  //Input Output package
import javax.swing.*; // dialog boxes
import hsa.Console;

public class Assignment4_1_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args) throws IOException
    {
	int yn = 0;
	boolean state = false;
	do
	{
	    String Select = JOptionPane.showInputDialog ("Please Select an Operation:\n1. Create a file of String values\n2. Read strings back from file and count the vowels\n3. Exit");
	    int Selection = Integer.parseInt (Select);

	    int STotal = 0;
	    switch (Selection) //selction analyzer
	    {
		case 1:
		    {
			Option1 (STotal);
			break;
		    }
		case 2:
		    {
			Option2 (STotal);
			break;
		    }
		case 3:
		    break;

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
    public static int Option1 (int STotal) throws IOException
    {
	STotal = 0;
	String st;
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("A4_1.txt");
	outputPW = new PrintWriter (outputFW);
       
	 st = JOptionPane.showInputDialog ("Enter your text now. Use the character '^' as an EOF ON A SEPARATE LINE");

	while (!st.equals ("^"))
	{
	    outputPW.println (st); // print each string on to file
	    st = JOptionPane.showInputDialog ("Enter your text now. Use the character '^' as an EOF ON A SEPARATE LINE");
	    STotal += 1;
	}
	outputPW.println ("EOF");
	outputFW.close ();
	outputPW.close ();
	
	JOptionPane.showMessageDialog (null, "FILE HAS SUCCESSFULLY BEEN CREATED", "File Status", JOptionPane.INFORMATION_MESSAGE);
	
	return (STotal);
    }


    public static void Option2 (int STotal) throws IOException
    {
	String line;
	BufferedReader inputBR;
	FileReader inputFR;
	
	inputFR = new FileReader ("A4_1.txt");
	inputBR = new BufferedReader (inputFR);
	
	line = inputBR.readLine ();
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


    // Place your program here.  'c' is the output console
    // main method
} // Assignment4_2_NeelPatel class


