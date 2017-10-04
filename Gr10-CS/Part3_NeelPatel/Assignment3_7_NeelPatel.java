// The "Assignment3_7_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment3_7_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int marks[] [] = new int [4] [4]; // new int [rows][columns]
	
     
	c.println();
	TablePrint (marks);
	Graphic();
	
    }


    public static void TablePrint (int marks[] [])
    {
	//Make numbers in a table
	for (int x = 0 ; x < 4 ; x++) // Row
	{
	  c.print ("          ");
	    for (int y = 0 ; y < 4 ; y++) //Column
	    {
		marks [x] [y] = (int) (Math.random () * 100);
		c.print (marks [x] [y], 7);
	    }
	  c.println ();
	}
	Average (marks);
    }


    
    public static void Graphic()
    {
    c.setColor(Color.red);

    //c.drawLine(X, Y, Start point, End point)
    //c.drawRect(X,Y,Start point, End point)
    //X & Y are taken from the Top left of the screen

    c.drawRect( 13,20, 295, 120);
    c.drawLine(85,20,85,140); //Initial vertical line inside the table
    c.drawLine(13,115,308,115); //Horizontal line
    
	for (int Col = 140;Col <= 295; Col+=55) //column lines
	c.drawLine(Col,20,Col,140);
   }



    public static void Average (int marks[] [])
    {
	c.println ();
	double Avg = 0;

	for (int y = 0 ; y < 4 ; y++) // Column
	{
	    for (int x = 0 ; x < 4 ; x++) //Row
	    {
		Avg = Avg + marks [x] [y];
	    }
	    Avg = Avg / 4;
	    if (y == 0)
		c.print ("  Averages");
	       
	    c.print (Avg, 7, 1);
	    Avg = 0;
	}
    }
} // Assignment3_7_NeelPatel class


