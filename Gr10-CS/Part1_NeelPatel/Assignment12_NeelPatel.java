// The "Assignment12_NeelPatel" class.
import java.awt.*;
import hsa.Console;

public class Assignment12_NeelPatel
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int Year,InvYear;
	int OriInvest;
	int Rate;
	double IntEarn;
	double Sum=0;
	double Accum_Value;
     
	c.print  ("Years to invest: ");
	InvYear=c.readInt();
	c.print  ("Original Investment: ");
	OriInvest=c.readInt();
	c.print  ("Intrest Rate: ");
	Rate=c.readInt();
	
	InvYear=InvYear+1;
	Accum_Value=OriInvest;            
	c.println(" YEAR           $Accumulated Value ");
	for (Year=1;Year<=InvYear;Year++)
	{
	
	IntEarn= Accum_Value * Rate / 100.00;
	Accum_Value= Accum_Value+IntEarn;
	c.print  (Year,5);
	
	 if (Year==InvYear)
	 {
	 c.println("                         $ETC");
	 }
	 else
	 {
	 c.println(Accum_Value,29,2);
	 }
	
	
	
	}
	
	
	
	
	
	
	
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // Assignment12_NeelPatel class
