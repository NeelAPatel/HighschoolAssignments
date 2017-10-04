// The "Assignment9_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment9_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String Student,random;
	double T1,T2,T3,Exam,Final;
	
	
	for (int i=0;i<5;i++)
	{
       
	
	c.print("Enter Student's Name: ");
	Student=c.readString();
	
	c.print("Enter "+Student+"'s Term 1 mark: ");
	T1=c.readDouble();
	c.print("Enter "+Student+"'s Term 2 mark: ");
	T2=c.readDouble();
	c.print("Enter "+Student+"'s Term 3 mark: ");
	T3=c.readDouble();
	
	c.print("Enter "+Student+"'s Final Exam mark: ");
	Exam=c.readDouble();
	
	Final= (T1*20/100)+(T2*20/100)+(T3*25/100)+(Exam*35/100);
	
	c.println();
	c.print("The Final mark for "+Student+" is : ");
	c.print(Final);
	c.println("%");
	
	if (Final>=90)
	{
	c.println("CONGRATULATIONS 1ST CLASS HONOURS!");
	}
	c.println();
	
	}
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment9_NeelPatel class
