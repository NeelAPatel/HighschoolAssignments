// The "Culminating_BettyWenNeelPatelFinal" class.
import java.awt.*;
import java.awt.event.*;
import java.io.*;      // Files
import javax.swing.*;  // Dialog boxes
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Culminating_BettyWenNeelPatelFinal
    extends JFrame
{
    public static void main (String[] args) throws IOException // Executes the menu, repeat
    {
	// Background colours
	UIManager UI = new UIManager ();
	UI.put ("OptionPane.background", Color.white);
	UI.put ("Panel.background", Color.white);
	boolean state = false;
	// Title screen
	Font f = new Font ("Serif", Font.ITALIC + Font.BOLD, 33);
	JTextArea outputArea = new JTextArea ();
	outputArea.setFont (f);
	outputArea.setBackground (Color.white);
	outputArea.setForeground (Color.red);
	String str = "  Welcome to The MarkBook  \n\n Copyright 2013 Betty Wen and Neel Patel ";
	outputArea.setText (str);
	JOptionPane.showMessageDialog (null, outputArea, "Welcome", JOptionPane.PLAIN_MESSAGE);
	// Calls menu method
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
    } // Main method


    public static boolean error () throws IOException // Outputs error statement
    {
	JOptionPane.showMessageDialog (null, "Invalid Input", "ERROR", JOptionPane.WARNING_MESSAGE);
	return false;
    }


    public static boolean append () throws IOException // Determines to create or append files
    {
	boolean append = false;
	boolean state;
	do
	{
	    state = true;
	    String createAppend; // Create or append?
	    createAppend = JOptionPane.showInputDialog (null, "Enter 1 to create file. Enter 2 to append file", "Create or append?", JOptionPane.PLAIN_MESSAGE);
	    if (createAppend == null) // When cancelled
		System.exit (0);
	    else if (createAppend.equals ("1"))
		append = false; // Create file
	    else if (createAppend.equals ("2"))
		append = true; // Append file if no existing file
	    else
		state = error ();
	} // Do while loop ends
	while (state == false);
	return append;
    } // Append method


    public static void menu () throws IOException // Prints out menu
    {
	String[] choices = {"Choose here", "0 . Create/Append Student Name File", "1 . Create/Append Test 1 File", "2 . Create/Append Test 2 File", "3 . Create/Append Test 3 File", "4 . Create/Append Exam File", "5 . Calculate Final Mark", "6 .  Exit"};
	String stringInput = (String) JOptionPane.showInputDialog (null, "", "MENU", JOptionPane.QUESTION_MESSAGE, null, choices, choices [0]);
	//option = JOptionPane.showInputDialog (null, " [0] Create/Append Student Name File \n [1]. Create/Append Test 1 File \n [2] Create/Append Test 2 File \n [3] Create/Append Test 3 File \n [4] Create/Append Exam File \n [5] Calculate Final Mark \n [6] Exit", "Menu", JOptionPane.PLAIN_MESSAGE);
	if (stringInput == null || stringInput.charAt (0) == '6') // When canceled
	    System.exit (0);
	else if ((stringInput.charAt (0)) == ('0'))
	    name ();
	else if ((stringInput.charAt (0)) == ('1'))
	    test1 ();
	else if ((stringInput.charAt (0)) == ('2'))
	    test2 ();
	else if ((stringInput.charAt (0)) == ('3'))
	    test3 ();
	else if ((stringInput.charAt (0)) == ('4'))
	    exam ();
	else if ((stringInput.charAt (0)) == ('5'))
	    errorCheck ();
    } // Menu method


    public static void name () throws IOException  //=========================================================================================================
    {
	// Section: Variables
	boolean state = false;
	String student = "";
	// Section: Append
	boolean app = append ();
	// Section: File Manager -- Name.txt
	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("Name.txt", app);
	PW = new PrintWriter (FW);
	// Section: Activity
	do
	{
	    student = JOptionPane.showInputDialog (null, "Enter student name (enter 'EOF' to stop).", "CREATE/APPEND STUDENT NAME FILE", JOptionPane.PLAIN_MESSAGE);
	    if (student == null) // When cancelled
		System.exit (0);
	    else if (student.equals ("EOF"))
		state = true;
	    else if (!(student.replaceAll ("[0-9]", "")).equals (student) || student.equals ("")) // When string includes numbers or is empty
		state = error ();
	    else
		PW.println (student);
	}
	while (state == false);
	// Close Name.txt
	FW.close ();
	PW.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    } // Name method


    public static void test1 () throws IOException //=========================================================================================================
    {
	// Section: Variables
	boolean state = false;
	String mark1 = "";
	// Section: Append
	boolean app = append ();
	// Section:File Manager -- Test1.txt
	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("Test1.txt", app);
	PW = new PrintWriter (FW);
	// Section: Activity
	do
	{
	    mark1 = JOptionPane.showInputDialog (null, "Enter test 1 mark (enter 'EOF' to stop).", "Create/Append Test 1 File", JOptionPane.PLAIN_MESSAGE);
	    if (mark1 == null)  // When cancelled
		System.exit (0);
	    else if (mark1.equals ("EOF"))
		state = true;
	    else if (mark1.equals ("") || mark1.length () > 3 || mark1.charAt (0) == '-' ||  // When string is empty, longer than 3 characters, negative
		    (mark1.length () == 3 && !mark1.equals ("100")) ||  // When string is 3 characters but not 100
		    (mark1.length () == 2 && (mark1.charAt (0) < '1' || mark1.charAt (0) > '9' || mark1.charAt (1) < '0' || mark1.charAt (1) > '9')) ||  //When string is 2 characters but not between 10-99
		    (mark1.length () == 1 && (mark1.charAt (0) < '0' || mark1.charAt (0) > '9')))  // When string is 1 character but not between 0-9
		state = error ();
	    else
		PW.println (mark1);
	}
	while (state == false);
	// Close Test1.txt
	FW.close ();
	PW.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    } // Test 1 method


    public static void test2 () throws IOException //=========================================================================================================
    {
	// Section: Variables
	boolean state = false;
	String mark2 = "";
	// Section: Append
	boolean app = append ();
	// Section:File Manager -- Test2.txt
	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("Test2.txt", app);
	PW = new PrintWriter (FW);
	// Section: Activity
	do
	{
	    mark2 = JOptionPane.showInputDialog (null, "Enter test 2 mark (enter 'EOF' to stop).", "Create/Append Test 2 File", JOptionPane.PLAIN_MESSAGE);
	    if (mark2 == null)  // When cancelled
		System.exit (0);
	    else if (mark2.equals ("EOF"))
		state = true;
	    else if (mark2.equals ("") || mark2.length () > 3 || mark2.charAt (0) == '-' ||  // When string is empty, longer than 3 characters, negative
		    (mark2.length () == 3 && !mark2.equals ("100")) ||  // When string is 3 characters but not 100
		    (mark2.length () == 2 && (mark2.charAt (0) < '1' || mark2.charAt (0) > '9' || mark2.charAt (1) < '0' || mark2.charAt (1) > '9')) ||  //When string is 2 characters but not between 10-99
		    (mark2.length () == 1 && (mark2.charAt (0) < '0' || mark2.charAt (0) > '9')))  // When string is 1 character but not between 0-9
		state = error ();
	    else
		PW.println (mark2);
	}
	while (state == false);
	// Close Test2.txt
	FW.close ();
	PW.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    } // Test 2 method


    public static void test3 () throws IOException //=========================================================================================================
    {
	// Section: Variables
	boolean state = false;
	String mark3 = "";
	// Section: Append
	boolean app = append ();
	// Section:File Manager -- Test3.txt
	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("Test3.txt", app);
	PW = new PrintWriter (FW);
	// Section: Activity
	do
	{
	    mark3 = JOptionPane.showInputDialog (null, "Enter test 3 mark (enter 'EOF' to stop).", "Create/Append Test 3 File", JOptionPane.PLAIN_MESSAGE);
	    if (mark3 == null)  // When cancelled
		System.exit (0);
	    else if (mark3.equals ("EOF"))
		state = true;
	    else if (mark3.equals ("") || mark3.length () > 3 || mark3.charAt (0) == '-' ||  // When string is empty, longer than 3 characters, negative
		    (mark3.length () == 3 && !mark3.equals ("100")) ||  // When string is 3 characters but not 100
		    (mark3.length () == 2 && (mark3.charAt (0) < '1' || mark3.charAt (0) > '9' || mark3.charAt (1) < '0' || mark3.charAt (1) > '9')) ||  //When string is 2 characters but not between 10-99
		    (mark3.length () == 1 && (mark3.charAt (0) < '0' || mark3.charAt (0) > '9')))  // When string is 1 character but not between 0-9
		state = error ();
	    else
		PW.println (mark3);
	}
	while (state == false);
	// Close Test3.txt
	FW.close ();
	PW.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    } // Test 3 method


    public static void exam () throws IOException //=========================================================================================================
    {
	// Section: Variables
	boolean state = false;
	String examMark = "";
	// Section: Append
	boolean app = append ();
	// Section:File Manager -- Exam.txt
	FileWriter FW;
	PrintWriter PW;
	FW = new FileWriter ("Exam.txt", app);
	PW = new PrintWriter (FW);
	// Section: Activity
	do
	{
	    examMark = JOptionPane.showInputDialog (null, "Enter exam mark (enter 'EOF' to stop).", "Create/Append Exam File", JOptionPane.PLAIN_MESSAGE);
	    if (examMark == null)  // When cancelled
		System.exit (0);
	    else if (examMark.equals ("EOF"))
		state = true;
	    else if (examMark.equals ("") || examMark.length () > 3 || examMark.charAt (0) == '-' ||  // When string is empty, longer than 3 characters, negative
		    (examMark.length () == 3 && !examMark.equals ("100")) ||  // When string is 3 characters but not 100
		    (examMark.length () == 2 && (examMark.charAt (0) < '1' || examMark.charAt (0) > '9' || examMark.charAt (1) < '0' || examMark.charAt (1) > '9')) ||  //When string is 2 characters but not between 10-99
		    (examMark.length () == 1 && (examMark.charAt (0) < '0' || examMark.charAt (0) > '9')))  // When string is 1 character but not between 0-9
		state = error ();
	    else
		PW.println (examMark);
	}
	while (state == false);
	// Close Exam.txt
	FW.close ();
	PW.close ();
	JOptionPane.showMessageDialog (null, "File has successfully been saved", "FILE STATUS", JOptionPane.INFORMATION_MESSAGE);
    } // Exam Method


    // Calculation & final output
    private JPanel topPanel;
    private JTable table;
    private JScrollPane scrollPane;

    public Culminating_BettyWenNeelPatelFinal () throws IOException
    {
	// Reading Name.txt to find size of file
	int fileSize = 0;
	FileReader FR0;
	BufferedReader BR0;
	FR0 = new FileReader ("Name.txt");
	BR0 = new BufferedReader (FR0);
	while (BR0.readLine () != (null))
	    fileSize++;
	// Declare variables
	String line0[] = new String [fileSize];
	String line1[] = new String [fileSize];
	String line2[] = new String [fileSize];
	String line3[] = new String [fileSize];
	String line4[] = new String [fileSize];
	int m0[] = new int [fileSize];
	int m1[] = new int [fileSize];
	int m2[] = new int [fileSize];
	int m3[] = new int [fileSize];
	int m4[] = new int [fileSize];
	FileReader FR1;
	BufferedReader BR1;
	FileReader FR2;
	BufferedReader BR2;
	FileReader FR3;
	BufferedReader BR3;
	FileReader FR4;
	BufferedReader BR4;
	FR1 = new FileReader ("Test1.txt");
	BR1 = new BufferedReader (FR1);
	FR2 = new FileReader ("Test2.txt");
	BR2 = new BufferedReader (FR2);
	FR3 = new FileReader ("Test3.txt");
	BR3 = new BufferedReader (FR3);
	FR4 = new FileReader ("Exam.txt");
	BR4 = new BufferedReader (FR4);
	String avg[] = new String [fileSize];
	// Reading lines of all files
	for (int count = 0 ; count < fileSize ; count++)
	{
	    line0 [count] = BR0.readLine ();
	    line1 [count] = BR1.readLine ();
	    line2 [count] = BR2.readLine ();
	    line3 [count] = BR3.readLine ();
	    line4 [count] = BR4.readLine ();
	    // Parsing string marks into integer marks for calculations
	    m1 [count] = Integer.parseInt (line1 [count]);
	    m2 [count] = Integer.parseInt (line2 [count]);
	    m3 [count] = Integer.parseInt (line3 [count]);
	    m4 [count] = Integer.parseInt (line4 [count]);
	    // Calculating average & putting it into a string
	    avg [count] = "" + (m1 [count] * 0.15 + m2 [count] * 0.20 + m3 [count] * 0.25 + m4 [count] * 0.40);
	}
	// Make table
	setTitle ("Student Averages");
	setSize (300, 200);
	setBackground (Color.blue);
	topPanel = new JPanel ();
	topPanel.setLayout (new BorderLayout ());
	getContentPane ().add (topPanel);
	String columnNames[] = {"Student Name", "Test 1", "Test 2", "Test 3", "Exam", "Average"};
	String values[] [] = new String [fileSize] [6];
	// Making 2D array from 6 1D arrays
	for (int i = 0 ; i < fileSize ; i++)
	{
	    values [i] [0] = line0 [i];
	    values [i] [1] = line1 [i];
	    values [i] [2] = line2 [i];
	    values [i] [3] = line3 [i];
	    values [i] [4] = line4 [i];
	    values [i] [5] = avg [i];
	}
	table = new JTable (values, columnNames);
	scrollPane = new JScrollPane (table);
	topPanel.add (scrollPane, BorderLayout.CENTER);
    }


    public static void errorCheck () throws IOException
    {
	// Check if all files exit
	File f0 = new File ("Name.txt");
	File f1 = new File ("Test1.txt");
	File f2 = new File ("Test2.txt");
	File f3 = new File ("Test3.txt");
	File f4 = new File ("Exam.txt");
	if (f0.exists () && f1.exists () && f2.exists () && f3.exists () && f4.exists ())
	{
	    // Check if sizes of files are equal
	    int count[] = new int [5];
	    for (int i = 0 ; i < 5 ; i++)
		count [i] = 0;
	    int largestFile; // The file number with the most lines
	    FileReader FR0;
	    BufferedReader BR0;
	    FileReader FR1;
	    BufferedReader BR1;
	    FileReader FR2;
	    BufferedReader BR2;
	    FileReader FR3;
	    BufferedReader BR3;
	    FileReader FR4;
	    BufferedReader BR4;233
	    FR0 = new FileReader ("Name.txt");
	    BR0 = new BufferedReader (FR0);
	    FR1 = new FileReader ("Test1.txt");
	    BR1 = new BufferedReader (FR1);
	    FR2 = new FileReader ("Test2.txt");
	    BR2 = new BufferedReader (FR2);
	    FR3 = new FileReader ("Test3.txt");
	    BR3 = new BufferedReader (FR3);
	    FR4 = new FileReader ("Exam.txt");
	    BR4 = new BufferedReader (FR4);
	    // Comparing number of lines in each file to find the largest file
	    while (BR0.readLine () != (null))
		count [0]++;
	    while (BR1.readLine () != (null))
		count [1]++;
	    if (count [1] > count [0])
		largestFile = 1;
	    else
		largestFile = 0;
	    while (BR2.readLine () != (null))
		count [2]++;
	    if (count [2] > count [largestFile])
		largestFile = 2;
	    while (BR3.readLine () != (null))
		count [3]++;
	    if (count [3] > count [largestFile])
		largestFile = 3;
	    while (BR4.readLine () != (null))
		count [4]++;
	    if (count [4] > count [largestFile])
		largestFile = 4;
	    // Difference between the sizes of files and the size of the largest file
	    int difference0 = count [largestFile] - count [0];
	    int difference1 = count [largestFile] - count [1];
	    int difference2 = count [largestFile] - count [2];
	    int difference3 = count [largestFile] - count [3];
	    int difference4 = count [largestFile] - count [4];
	    // File sizes are equal
	    if (difference0 == 0 && difference1 == 0 && difference2 == 0 && difference3 == 0 && difference4 == 0)
	    {
		Culminating_BettyWenNeelPatel mainFrame = new Culminating_BettyWenNeelPatel ();
		mainFrame.setVisible (true);
	    }
	    // File sizes are different
	    else
	    {
		switch (largestFile)
		{
		    case 0:
			JOptionPane.showMessageDialog (null, "Missing: \n" + difference1 + " values in Test 1 File\n" + difference2 + " values in Test 2 File\n" + difference3 + " values in Test 3 File\n" + difference4 + " values in Exam File\n\nPlease return to add more values", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		    case 1:
			JOptionPane.showMessageDialog (null, "Missing: \n" + difference0 + " values in Name File\n" + difference2 + " values in Test 2 File\n" + difference3 + " values in Test 3 File\n" + difference4 + " values in Exam File\n\nPlease return to add more values", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		    case 2:
			JOptionPane.showMessageDialog (null, "Missing: \n" + difference0 + " values in Name File\n" + difference1 + " values in Test 1 File\n" + difference3 + " values in Test 3 File\n" + difference4 + " values in Exam File\n\nPlease return to add more values", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		    case 3:
			JOptionPane.showMessageDialog (null, "Missing: \n" + difference0 + " values in Name File\n" + difference1 + " values in Test 1 File\n" + difference2 + " values in Test 2 File\n" + difference4 + " values in Exam File\n\nPlease return to add more values", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		    case 4:
			JOptionPane.showMessageDialog (null, "Missing: \n" + difference0 + " values in Name File\n" + difference1 + " values in Test 1 File\n" + difference2 + " values in Test 2 File\n" + difference3 + " values in Test 3 File\n\nPlease return to add more values", "ERROR", JOptionPane.WARNING_MESSAGE);
			break;
		}
	    }
	}
	else
	    JOptionPane.showMessageDialog (null, "No data available.", "ERROR", JOptionPane.WARNING_MESSAGE);
    } // Calculate Method
} // Culminating_BettyWenNeelPatelFinal class
