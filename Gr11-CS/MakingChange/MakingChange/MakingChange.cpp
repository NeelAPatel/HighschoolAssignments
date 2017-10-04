#include <iostream>
#include <ctime>
#include <iomanip>
#include <math.h> // fmod
using namespace std;


// extra credit
/*

B: date and Time
A: Dollars: 5 10 20 50 100
TAX

if 0 then dont display

Color*/






void AsciiArt()
{
	cout << endl << setfill('-')<<setw(64) << '\n' << setfill(' ')<< endl;
	cout << "     $                     $                                    " << endl;
	cout << "    $$$   3333            $$$     222                  ???????? " << endl;
	cout << "   $ $        3          $ $     2   2                 ??    ?? " << endl;
	cout << "   $ $        3          $ $         2    ======             ?? " << endl;
	cout << "    $$$    333   $$$$$$   $$$       2                      ???  " << endl;
	cout << "     $ $      3            $ $     2      ======          ??    " << endl;
	cout << "     $ $      3            $ $    2                       ??    " << endl;
	cout << "    $$$   3333            $$$    22222                          " << endl;
	cout << "     $                     $                              ??    " << endl;
	cout << endl << setfill('-')<<setw(64) << '\n' << setfill(' ')<< endl;
}
int main()
{ 
	char YN;
	YN = 'Y';
	system("color 3B");
	do
	{
	//Declarations
		//Input
		double purchase_price, amount_recieved;
		//Output
		double tax_amt;
		double change, cents;
		int dollars, quarters, dimes, nickels, pennies;
		int D5, D10, D20, D50, D100;

		
		//time_t now = time(0);
		//char* date = ctime(&now);
		// INPUT
		system("cls");
		AsciiArt();
		cout << endl << "Enter Purchase price:         $";//7
			cin >> purchase_price;
			tax_amt = purchase_price + (purchase_price * 0.0675);
		cout << "   Tax of 6.75%               $" << setiosflags(ios::fixed|ios::showpoint) << setprecision(2) << (purchase_price * 0.0675) << endl; 
		cout << "   Price /w Tax:              $" << setprecision(2) << tax_amt<< endl;
		cout << endl << setfill('-')<<setw(40) << '\n' << setfill(' ');
		cout << "Enter amount received:        $";//6
			cin >> amount_recieved;
		
		change = amount_recieved - tax_amt;
		if (amount_recieved >= tax_amt)
		{
			cout << endl<< "Change Due:                   $";//17
			cout << setw(8) << setiosflags(ios::left) << change;
		}
		else
		{
			cout << "Error: Not enough money paid.";
		}
		

		//Output
		//Date and Time
		
		//time_t now = time(0);
		//char* date = ctime(&now);
		char sdate[9];
		char stime[9];
		_strdate(sdate);
		_strtime(stime);
		cout << endl << setfill('-')<<setw(40) << '\n' << setfill(' ');
		cout << endl << "Billed on:";
		cout << endl << "Date:   " << sdate << " || Time:    "<< stime;
		cout << setfill('-')<<setw(40) << '\n' << setfill(' ') << endl;
		

		cents = fmod(change,1);
		dollars = change - cents;
		cout << "   Change received: " ;
		cout <<  setfill('-')<<setw(40) << '\n' << setfill(' ')<< endl;
		cout << "                   Qty      Amt ($)" << endl;
		
		
		
		
		D100 = int(dollars / 100);
		dollars -= (D100 * 100);
		if (D100 != 0)
		{
			cout << "Dollars   ($100):"<< setw(5)<<setiosflags(ios::right)<< D100<< setw(12) << setiosflags(ios::right) << (100.00*D100) << endl;
		}
		D50 = int(dollars/50);
		dollars -= (D50*50);
		if (D50 != 0)
		{
			cout <<  "Dollars    ($50):"<< setw(5)<<setiosflags(ios::right)<< D50 << setw(12) << setiosflags(ios::right) << (50.00 * D50) << endl;
		}
		D20 = int(dollars/20);
		dollars -= (D20*20);
		if (D20 != 0)
		{
			cout <<  "Dollars    ($20):"<< setw(5)<<setiosflags(ios::right)<< D20 << setw(12) << setiosflags(ios::right) << (20.00 * D20) << endl;
		}
		D10 = int(dollars/10);
		dollars -= (D10*10);
		if (D10 != 0)
		{
			cout << "Dollars    ($10):"<< setw(5)<<setiosflags(ios::right)<< D10 << setw(12) << setiosflags(ios::right) << (10.00 * D10) << endl;
		}
		D5 = int(dollars/5);
		dollars -= (D5*5);
		if (D5 != 0)
		{
			cout <<  "Dollars     ($5):"<< setw(5)<<setiosflags(ios::right)<< D5 << setw(12) << setiosflags(ios::right) << (5.00 * D5) << endl;
		}
		//D100 = int(dollars/100);
		//dollars -= (D100*100);
		if (dollars != 0)
		{
			cout << "Dollars     ($1):"<< setw(5)<<setiosflags(ios::right)<< dollars << setw(12) << setiosflags(ios::right) << (1.00 * dollars) << endl;
		}

		quarters = cents / 0.25;
		cents = cents - (0.25 * quarters);
		if (quarters != 0)
		{
			cout << "Quarters ($0.25):" << setw(5)<<setiosflags(ios::right)<< quarters << setw(12) << setiosflags(ios::right) << (0.25 * quarters)<< endl;
		}

		dimes = cents / 0.10;
		cents = cents - (0.10 * dimes);
		if (dimes!=0)
		{
			cout <<  "Dimes    ($0.10):" << setw(5)<<setiosflags(ios::right)<< dimes << setw(12) << setiosflags(ios::right) << (0.10 * dimes)<< endl;
		}

		nickels = cents / 0.05;
		cents = cents - (0.05 * nickels);
		if (nickels != 0)
		{
			cout <<  "Nickels  ($0.05):" << setw(5)<<setiosflags(ios::right)<< nickels << setw(12) << setiosflags(ios::right) << (0.05 * nickels)<< endl;
		}

		pennies = cents / 0.01;
		cents = cents - (0.01 * pennies);
		if (pennies != 0)
		{
			cout <<  "Pennies  ($0.01):" << setw(5)<<setiosflags(ios::right)<< pennies << setw(12) << setiosflags(ios::right) << (0.01 * pennies)<< endl;
		}
		cout << endl << setfill('-')<<setw(40) << '\n' << setfill(' ');
		cout << "Change Total: $" << setw(3) << setiosflags(ios::right) << change<< endl;
		


		cout << endl << "Repeat the program? [Y/N]" << endl;
		cin >> YN;
	}
	while (YN == 'y'||YN =='Y');

	return 0;
}
		