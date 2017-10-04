// The "Bonus5_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Bonus5_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int Magic[] [] = new int [4] [4];

	Warning ();
	Input (Magic);
	Display (Magic);
	Calculation (Magic);
    } // main method



    // Notifies of HOW the Numbers will be inputted =========================================
    public static void Warning ()
    {
	c.println ("Warning: This is how you will input the values");
	c.println ();
	c.drawRect (0, 0, 8, 18);

	for (int a = 1 ; a <= 16 ; a++)
	{
	    c.print (a, 3);
	    if ((a % 4) == 0)
		c.println ();
	}

	for (int Vert = 6 ; Vert <= 100 ; Vert += 23)
	    c.drawLine (Vert, 39, Vert, 119);

	for (int Horz = 39 ; Horz <= 119 ; Horz += 20)
	    c.drawLine (6, Horz, 98, Horz);

    } //Warning Method


    // User inputs Variables ==================================================================
    public static void Input (int Magic[] [])
    {
	int x = 1;
	c.println ();
	for (int Row = 0 ; Row < 4 ; Row++) // Row
	{
	    for (int Col = 0 ; Col < 4 ; Col++) //Column
	    {
		c.print ("Enter value #" + x + ": ");
		Magic [Row] [Col] = c.readInt ();
		// Magic [Row] [Col] = 99;// CHANGE THIS TO READ INT==============================================================================================
		x += 1;
	    }
	}

    } //Input method


    //DISPLAYS what you entered==============================================================
    public static void Display (int Magic[] [])
    {
	c.clear ();

	c.println ("This is what you entered:");
	c.println ();
	int Col;
	for (int Row = 0 ; Row < 4 ; Row++) // Row
	{
	    c.print ("                              ");
	    for (Col = 0 ; Col < 4 ; Col++) //Column
	    {
		c.print (Magic [Row] [Col], 3);
	    }
	    if (Col % 4 == 0)
		c.println ();
	}

	for (int Vert = 250 ; Vert <= 344 ; Vert += 23)
	    c.drawLine (Vert, 39, Vert, 119);

	for (int Horz = 39 ; Horz <= 119 ; Horz += 20)
	    c.drawLine (250, Horz, 342, Horz);
    }


    // Calculates if Values inputted make a Magic Square =======================================
    public static void Calculation (int Magic[] [])
    {
	//Horizonal Calculation
	int Calc[] = new int [4];

	int Sum = 0;
	for (int y = 0 ; y < 4 ; y++) // Column
	{
	    for (int x = 0 ; x < 4 ; x++) //Row
	    {
		Sum = Sum + Magic [x] [y];
	    }
	    Calc [y] = Sum;
	    c.print (Sum, 7);
	    Sum = 0;
	}
	c.println ();
	int ColumnSum = 0;

	if (Calc [0] == Calc [1] && Calc [1] == Calc [2] && Calc [2] == Calc [3])
	{
	    ColumnSum = Calc [0];
	    c.println ("Column values are valid");
	}
	else
	    c.println ("COLUMN VALUES NOT VALID");



	//Vertical Calculation
	for (int clr = 0 ; clr < 4 ; clr++) //Clears the array
	    Calc [clr] = 0;

	Sum = 0;
	for (int x = 0 ; x < 4 ; x++) // Column
	{
	    for (int y = 0 ; y < 4 ; y++) //Row
	    {
		Sum = Sum + Magic [x] [y];
	    }
	    Calc [x] = Sum;
	    c.print (Sum, 7);
	    Sum = 0;
	}
	c.println ();

	int RowSum = 0;
	if (Calc [0] == Calc [1] && Calc [1] == Calc [2] && Calc [2] == Calc [3])
	{
	    RowSum = Calc [0];
	    c.println ("Rows values  are valid");
	}
	else
	    c.println ("ROWS VALUES NOT VALID");


	// Diagonal from TOP LEFT ==> BOTTOM RIGHT
	for (int clr = 0 ; clr < 4 ; clr++) //Clears the array
	    Calc [clr] = 0;

	int y = 0;
	int Diag1 = 0;
	for (int x = 0 ; x < 4 ; x++)
	{
	    Diag1 = Diag1 + Magic [x] [y];
	    y++;
	}
	c.println ("Diag 1 = " + Diag1);


	// Diagonal from TOP RIGHT ==> BOTTOM LEFT
	for (int clr = 0 ; clr < 4 ; clr++) //Clears the array
	    Calc [clr] = 0;

	y = 0;
	int Diag2 = 0;
	for (int x = 3 ; x >= 0 ; x--)
	{
	    Diag2 = Diag2 + Magic [x] [y];
	    y++;
	}
	c.println ("Diag 2 = " + Diag2);


	Conclusion (RowSum, ColumnSum, Diag1, Diag2);
    }



    public static void Conclusion (int RowSum, int ColumnSum, int Diag1, int Diag2)
    {
	// =====   Conclusion    =====
	if (RowSum == ColumnSum)
	    if (Diag1 == Diag2)
		if (RowSum == Diag1)
		      c.println(" It is a Magic Square!! ");
		    //c.println ("HOORAY MOTHER FLUFFIN' PENGUINS! THE MAGIC SQUARE IS REALLY FLUFFIN' MAGIC BRUH!");

	else
	      c.println("It is NOT a Magic Square :( ");
	    //c.println ("You are such a Neel.. The so-called ''Magic Square'' is just a piece of ship.");

	else
	     c.println("It is NOT a Magic Square :( ");
	   // c.println ("You are such a Neel.. The so-called ''Magic Square'' is just a piece of ship.");

	else
	     c.println("It is NOT a Magic Square :( ");
	   // c.println ("You are such a Neel.. The so-called ''Magic Square'' is just a piece of ship.");




	/*  if (Diag1 == Diag2 == RowSum == ColumnSum)

	      c.println("HOORRAY MOTHER FLUFFYING BISSHIS!!! THE MAGIC SQUARE IS FLUFFIN' MAGIC BRUH");
	  else
	      c.println("You Aya.. *facepalm* The so-called Magic Square is just a piece of ship.");
	   */

    } // Calculation Method



} // Bonus5_NeelPatel class


