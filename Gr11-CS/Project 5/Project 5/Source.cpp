// Name: Neel Patel
//Date: mar 14 2014
// Title: All of project 5
// Purpose: Do the projects from 5-1 to 5-10

#include <iostream>
#include <iomanip>
using namespace std;
// OPTIONS================OPTIONS================OPTIONS================OPTIONS================OPTIONS================OPTIONS================
void opt1()
{
	// Declaration
			int Passengers; 
			cout <<  "TRANSPORTATION" << endl;
			cout <<  "**************" << endl;
			cout << "How many passengers do you have?" << endl;
				cin >> Passengers;
			cout << "Busses ordered: " << Passengers / 50 << endl;
			cout << "Vans ordered (7 seats): " << (Passengers % 50) / 7;
}
void opt2()
{
	const double pi = 3.141592654;
	float A, B;

	cout << "AREA OF AN ELLIPSE" << endl;
	cout << "******************" << endl;
	cout << "Length of A axis: ";
		cin >> A;
	cout << "Length of B Axis: ";
		cin >> B;
	cout << endl << "Area = pi*A*B";
	cout << endl<<"Area: " << (pi * A * B);
}
void opt3()
{
	double deg;

	cout << "Degrees to Radians" << endl << "******************" << endl;
	cout << "Degrees: ";
	cin >> deg;
	cout << "Radians = " << (deg / 57.3);
}
void opt4()
{
	double Miles, Feet,Speed, Seconds;
	cout << "miles/h to feet/s" << endl;
	cout << "*****************"<<endl;
	cout << "Miles traveled in an hour: ";
		cin >> Miles;
	Feet = Miles * 5280;
	Seconds = 1 * 3600;
	Speed = Feet / Seconds;
	cout << "Speed in feet/second = " << Speed;
}
void opt5()
{
	double Principal, Rate, Time;

	cout << "Simple Interest" << endl;
	cout << "***************" << endl;
	cout << "Principal Amount: ";
		cin >> Principal;
	cout << "Rate in %: ";
		cin >> Rate;
	cout << "Time in Years:    ";
		cin >> Time;
	cout << endl << "Simple Interest = " << (Principal*(Rate/100)*Time);
}
void opt6()
{
	double Volts, Resistance;
	cout << "Electricity" << endl;
	cout << "***********" << endl;
	cout << "Volts: ";
		cin >> Volts;
	cout << "Resistance: ";
		cin >> Resistance; 
	cout << endl << "Current = " << (Resistance*Volts);
}
void opt7()
{
	double mass,accel;
	cout << "Physics"<<endl;
	cout << "*******"<< endl;
	cout << "Mass in kg: ";
		cin >> mass;
	cout << "Acceleration in m/s: ";
		cin >> accel;
	cout << endl<< "Force = " << (mass*accel);
}
void opt8()
{

	double mass;
	float energy;
	const float C2 = 89875517873681800;

	cout << "E = mc^2"<< endl;
	cout << "********" << endl;
	cout << "Mass in kg:";
		cin >> mass;
	energy = mass*C2;
	cout << "Energy = " << energy;
}
void opt9()
{
	int Speed;
	cout << "Law Enforcement" << endl;
	cout << "***************" << endl;
	cout << "You have over the 100 km/h speed limit. Your base fine will be $200 and you will be charged an aditional $35 per km over speedlimit." << endl;
	cout << "State your speed in km/h: ";
		cin >> Speed;
	if (Speed > 100)
	{
		cout << "Fine: $" << (100 + (35*(Speed % 100)));
	}
	else
	{
		cout << "What fine? ;) You ain't gettin' one even if you beg. Now shoo.";
	}
}
void opt10()
{
	double L, T, C;
	cout << "Steel Production!"<<endl;
	cout << "*****************" << endl;
	cout << "Measured Length: ";
		cin >> L;
	cout << "Temperature in Celcius: ";
		cin >> T;
	C = 0.0000116 * (T-20) * L;
	cout << "New length: "<< (C+L) << " (whatever units go here) " ;
}
void main()
{
	system("color 5A");
	char YN;
	//Code repetition
	YN = 'Y';
	do 
	{
		int i, Choice;
		cout << "Main Menu:"<< endl;
		//cout << setfill('-') << setw(10)<< endl;
		for (i = 1; i <= 10 ; i++)
		{
			cout << "["<<i<<"]. Proj 5-" << i << '\n';
		}
		cout << endl<< "Which project would you like to run? \n";
		cout << "Project #:";
		cin >> Choice;
		system("cls");
		switch (Choice)
		{
			case 1: 
				opt1();
				break;
			case 2:
				opt2();
				break;
			case 3:
				opt3();
				break;
			case 4:
				opt4();
				break;
			case 5:
				opt5();
				break;
			case 6:
				opt6();
				break;
			case 7: 
				opt7();
				break;
			case 8:
				opt8();
				break;
			case 9: 
				opt9();
				break;
			case 10:
				opt10();
				break;
			default:
				cout << "Default" << endl;
		}

		cout << endl;
		cout << endl <<"Rerun the program?" << endl;
		cin >> YN;
		system("cls");
	}
	while (YN == 'Y' || YN == 'y');

}




