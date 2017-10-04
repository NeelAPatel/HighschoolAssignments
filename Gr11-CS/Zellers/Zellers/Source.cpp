#include <iostream>
using namespace std;

int F,K,M,D,C,day,month,year;
void CalculationOutput()
{
		K = day;
		M = month;
		D = year % 100;
		C = year / 100;
		F = K + 13*(M+1)/5 + D + D/4 + C/4 + 5*C;
		F = F % 7;

		switch (F)
		{
		case 0: 
			cout << "Saturday";
			break;
		case 1:
			cout << "Sunday";
			break;
		case 2:
			cout << "Monday";
			break;
		case 3:
			cout << "Tuesday";
			break;
		case 4:
			cout << "Wednesday";
			break;
		case 5:
			cout << "Thursday";
			break;
		case 6:
			cout << "Friday";
			break;
		}
}
int main()
{
	//int h,q,m,k,j,day,month,year;
	char yn;
	do
	{
		cout << "Date number: ";
			cin >> day;
		cout << "Month number: ";
			cin >> month;
		cout << "Year number: ";
			cin >> year;
		
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
					CalculationOutput();
				}
				else
				{
					cout << "Sorry the date of February 29, " << year << " does not exist." << endl;
					cout << "Re-run the program to try again.";
				}
			}
			else
			{
				CalculationOutput();
			}

		cout << endl << "Restart the program? [Y/N]" << endl;
		cin >> yn;
	}
	while (yn == 'y'||yn == 'Y');

	return 0;
}