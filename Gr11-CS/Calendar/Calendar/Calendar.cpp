#include <iostream>
#include <iomanip>
using namespace std;

int F,K,M,D,C,day,month,year;
int WeekNum;



void Output()
{
	// 81
	cout << "Sunday    Monday     Tuesday      Wednesday     Thursday     Friday  Saturday";

	switch (Weekum)
	{
		case 0: //Saturday
			cout << setw(81);
		break;
		case 1: //Sunday
			cout << setw(6);
		break;
		case 2: //Monday
			cout << setw(16);
		break;
		case 3:
			cout << setw();
		break;
		case 4:
			cout << setw();
		break;
		case 5:
			cout << setw();
		break;
		case 6:
			cout << setw();
		break;
	}

	
}

void Calculation()
{
		day= 1;

		K = day;
		M = month;
		D = year % 100;
		C = year / 100;
		F = K + 13*(M+1)/5 + D + D/4 + C/4 + 5*C;
		F = F % 7;
		WeekNum = F;
}

void MonthManip()
{
	switch (month)
		{
		case 1:
			{
				month = 13;
				year = year - 1;
				break;
			}
		case 2:
			{
				month = 14;
				year = year -1;
			}
		}
		//Calculations
		if ((month == 2) && (day == 29)) //Determines if you chose february 29th.
		{
			if ((year % 400) ==0 || ((year % 4) == 0 && (year % 100) != 0))
			{
				Calculation();
			}
			else
			{
				cout << "Sorry the date of February 29, " << year << " does not exist." << endl;
				cout << "Re-run the program to try again.";
			}
		}
		else
		{
			Calculation();
		}
}

int main()
{
	//declarations
	char yn;
	do
	{
		cout << "Year: ";
			cin >> year;
		cout << "Month: ";
			cin >> month;
		MonthManip();

		Output();




		cout << "Run the program again? [Y/N]" << endl;
		cin >> yn;
	}
	while(yn == 'y'||yn == 'Y');

	return 0;
}
