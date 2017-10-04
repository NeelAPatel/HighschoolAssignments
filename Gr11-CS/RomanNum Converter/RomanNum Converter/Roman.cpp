#include <iostream> 
using namespace std;

// Number to Roman
int number;
char roman[16]; //global variables
int i, characterCount;
	int CC; //Roman Character Count
	int value;


void calculateOnes()
{
	int ones = number/1;
	switch (ones)
	{
	case 1:
	case 2:
	case 3:
		for (i = characterCount; i < characterCount + ones; i++)
		{
			roman [i] = 'I';
		}
		characterCount += ones;
		break;
	case 4:
		roman[characterCount] = 'I';
		roman[characterCount + 1] = 'V';
		characterCount += 2;
		break;
	case 5:
		roman[characterCount] = 'V';
		characterCount += 1;
		break;
	case 6:
	case 7:
	case 8:
		roman[characterCount] = 'V';
		characterCount += 1;

		for(int i = characterCount; i < characterCount + (ones - 5); i++){
			roman[i] = 'I';
		}
		characterCount += (ones - 5);
		break;
	case 9:
		roman[characterCount] = 'I';
		roman[characterCount + 1] = 'X';
		characterCount += 2;
		break;

	}
	number = number - ones * 1;
	if(characterCount < 16)
		roman[characterCount] = '\0';
	cout  << roman;
}

void calculateTens()
{
	int tens = number / 10;
	switch (tens)
	{
	case 1:
	case 2:
	case 3:
		for (i = characterCount; i < characterCount + tens; i++)
		{
			roman [i] = 'X';
		}
		characterCount += tens;
		break;
	case 4:
		roman[characterCount] = 'X';
		roman[characterCount + 1] = 'L';
		characterCount += 2;
		break;
	case 5:
		roman[characterCount] = 'L';
		characterCount += 1;
		break;
	case 6:
	case 7:
	case 8:
		roman[characterCount] = 'L';
		characterCount += 1;

		for(int i = characterCount; i < characterCount + (tens - 5); i++){
			roman[i] = 'X';
		}
		characterCount += (tens - 5);
		break;
	case 9:
		roman[characterCount] = 'X';
		roman[characterCount + 1] = 'C';
		characterCount += 2;
		break;

	}
	number = number - tens * 10;
	calculateOnes();

}

void calculateHundreds()
{
	int hundreds = number / 100;
	switch(hundreds)
	{
	case 1:
	case 2:
	case 3:
		for(int i = characterCount; i < characterCount + hundreds; i++){
			roman[i] = 'C';
		}
		characterCount += hundreds;
		break;
	case 4:
		roman[characterCount] = 'C';
		roman[characterCount + 1] = 'D';
		characterCount += 2;
		break;
	case 5:
		roman[characterCount] = 'D';
		characterCount += 1;
		break;
	case 6:
	case 7:
	case 8:
		roman[characterCount] = 'D';
		characterCount += 1;

		for(int i = characterCount; i < characterCount + (hundreds - 5); i++){
			roman[i] = 'C';
		}
		characterCount += (hundreds - 5);
		break;
	case 9:
		roman[characterCount] = 'C';
		roman[characterCount + 1] = 'M';
		characterCount += 2;
		break;
	}
	number = number - hundreds * 100;
	calculateTens();
}


void calculateThousands()
{
	int thousands = number / 1000;
	
	for(int i = 0; i < thousands; i++)
	{
		roman[i] = 'M';
	}

	characterCount = thousands;
	number = number - thousands * 1000;

	calculateHundreds();


}

void calculateValue()
{

	
	CC = 0;
	value = 0;
	do
	{
		if (roman[CC] =='I' && roman[CC+1] =='V')
			{
				CC+=2;
				value +=4;
				
			}
		if (roman[CC] =='I' && roman[CC+1] =='X')
			{
				CC+=2;
				value +=9;
				
			}
		if (roman[CC] =='X' && roman[CC+1] =='L')
			{
				CC+=2;
				value +=40;
				
			}
		if (roman[CC] =='X' && roman[CC+1] =='C')
			{
				CC+=2;
				value +=90;
				
			}
		if (roman[CC] =='C' && roman[CC+1] =='D')
			{
				CC+=2;
				value +=400;
				
			}
		if (roman[CC] =='C' && roman[CC+1] =='M')
			{
				CC+=2;
				value +=900;
				
			}
		if (roman[CC] == 'I')
			{
				CC+=1;
				value+=1;
				
			}
		if (roman[CC] == 'V')
			{
				CC+=1;
				value+=5;
				
			}
		if (roman[CC] == 'X')
			{
				CC+=1;
				value+=10;
				
			}
		if (roman[CC] == 'L')
			{
				CC+=1;
				value+=50;	
			}
		if (roman[CC] == 'C')
			{
				CC+=1;
				value+=100;
			}
		if (roman[CC] == 'D')
			{
				CC+=1;
				value+=500;	
			}
		if (roman[CC] == 'M')
			{
				CC+=1;
				value+=1000;
			}
	//cout << endl << "Answer: "<< value;

	}
	while (CC <= 16);
	//cout << endl << "Answer: "<< value;
}

int main()
{
	char YN;
	int option;
	YN = 'y';
	do
	{
		system("cls");
		for(int i = 0; i < 15; i++)
			roman[i] = ' ';

		//Declaration
		//Input
		cout << "[1] Number to roman" << endl;
		cout << "[2] Roman to Number" << endl;
		cin >> option;
		if (option == 1)
		{
		cout << "Enter a number between 1 to 3999 inclusive: " << endl;
		cin >> number;
		
		calculateThousands();
		}
		if (option == 2)
		{
			cout << "Enter a Roman Numeral: ";
			cin >> roman;
			calculateValue();
			cout << endl << "Answer: "<< value;

		}
		cout << "\nRun again?";
		cin >> YN;
	}
	while (YN =='y'||YN=='Y');
	return 0;
}