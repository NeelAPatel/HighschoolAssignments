#include <iostream> //Input Output
#include <ctime>  // Time and Date
using namespace std;
#include <iomanip> //Setiosflags (Manipulation)
#include <Windows.h> // Color
 // Date and Time
int main() //main procedure
{
	
	char YN;
	//Code repetition
	YN = 'Y';
	do
	{
		//Variable Declaration
		char YN; // to answer yes or no question
		double KWUsed;    //Input
		double Cost;      //Cost per KWH
		double BaseRate;  //KWUsed x Cost
		double Surcharge; // 0.1
		double CityTax;   // 0.03
		double Total;
		//Initialization
		Cost = 0.0475;
		Surcharge = 0.1;
		CityTax = 0.03;

		//Title
		//ASCII ART
		system("color 2A");
	    cout << "||####################################||"<< '\n';
		cout << "||                  $$                ||"<< '\n';
		cout << "||               $$$$$$$              ||"<< '\n';
		cout << "||              $$  $$                ||"<< '\n';
	    cout << "||   COMP-PROG   $$$$$$$   Electric   ||"<< '\n';
		cout << "||                  $$ $$             ||"<< '\n';
		cout << "||               $$$$$$$              ||"<< '\n';
		cout << "||                  $$                ||"<< '\n';
		cout << "||####################################||"<< '\n';
		

		cout << '\n' << "Billed on:      ";
		time_t now = time(0);
		char* date = ctime(&now);

		
		//Input
		cout << endl << "Enter the Kilowatts used:            ";
		cin >> KWUsed;
		
		// Setfill asks for a value of what to fill the line with. In this, it is the = sign
		//Setw is set width. basically it saves an line with a length of 26
		cout << setfill('=') << setw(41) << '\n';
		cout << "         Kummer's Electric Bill \n";

				cout << '\n' << "Billed on:      ";
		time_t now = time(0);
		char* date = ctime(&now);
		cout << date;

		cout << setfill('=') << setw(41) << '\n';

		cout << "Kilowatts used: " << setfill(' ') << setw(24) << setiosflags(ios::right) << KWUsed << '\n';

		// =======================================================================================Output
		//Baserate
		BaseRate = KWUsed * Cost;
		cout << "Base Rate:      "<< KWUsed << " @ $" << Cost;
		cout << setiosflags(ios::fixed|ios::showpoint) << setprecision(2);
		cout << setfill(' ') << setw(5) << setiosflags(ios::right)<< "$"  << setw(6) << BaseRate << '\n';
		//Surcharge
		Surcharge = Surcharge * BaseRate;
		cout << "Surcharge:" << setw(24) << setiosflags(ios::right) <<"$"<< setw(6)  << Surcharge << endl;
		//City Tax
		CityTax = CityTax * BaseRate;
		cout << "City Tax:" << setw(25) <<"$"<< setw(6) << CityTax << '\n';
		// Dashed Line
		cout << "                                 -------" << '\n';
		//Total
		Total = BaseRate + Surcharge + CityTax;
		cout << "Total:" << setw(28) <<"$"<< setw(6) <<  Total << '\n';		
		// Late Fee
		cout << endl;
		cout << "Late payment: "  << setw(20) <<"$"<< setw(6) << (Total*1.04) <<'\n';
		
		cout << endl << "(\\(^w^)/)" << endl;
		
		//Re run?
		cout << endl <<"Rerun the program?" << endl;
		cin >> YN;
		system("cls"); // Clears Screen
	}
    while (YN == 'Y' || YN == 'y'); //ReRun
	return 0;

}