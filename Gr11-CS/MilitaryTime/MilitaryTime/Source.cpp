/* Name: Neel Patel
   Title: Military Time
   Date: Mar 17 2014*/

#include <iostream>
#include <iomanip>
using namespace std;

void main()
{
	//Declarations
	int Time1, Time2, Hour, Min;

	cout << "Enter the start time: ";
		cin >> Time1;
	cout << "Enter the end time: ";
		cin >> Time2;

	if (Time1 < Time2)
	{
		cout << " Time1 is smaller";
		cout << Time2-Time1;
	}
return;
}
