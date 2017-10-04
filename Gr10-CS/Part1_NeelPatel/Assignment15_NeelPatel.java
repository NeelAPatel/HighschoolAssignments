// The "Assignment15_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment15_NeelPatel
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int A = 0;
	int E = 0;
	int I = 0;
	int O = 0;
	int U = 0;
	int i = 0;

	c.println ("Enter your string");
	String Mstr = c.readLine ();
	Mstr = Mstr.toLowerCase ();

	int Str_L = Mstr.length ();

	char Ltr;

	for (i = 0 ; i <= Str_L -1 ; i++)
	{
	    Ltr=Mstr.charAt(i);


	    if (Ltr == 'a')
		A++;
	    if (Ltr == 'e')
		E++;
	    if (Ltr == 'i')
		I++;
	    if (Ltr == 'o')
		O++;
	    if (Ltr == 'u')
		U++;
	}

	c.println ("# of A's = " + A);
	c.println ("# of E's = " + E);
	c.println ("# of I's = " + I);
	c.println ("# of O's = " + O);
	c.println ("# of U's = " + U);





	// Place your program here.  'c' is the output console
    } // main method
} // Assignment15_NeelPatel class


