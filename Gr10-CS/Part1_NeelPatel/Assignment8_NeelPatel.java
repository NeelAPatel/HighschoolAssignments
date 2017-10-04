// The "Assignment8_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment8_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	String Student;
	double T1,T2,T3,Exam,Final;
	
	
	c.print("Enter Student's Name: ");
	Student=c.readLine();
	
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
	c.print(Math.round(Final));
	c.println("%");
	
	c.println(Student);
	


	
   
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment8_NeelPatel class
