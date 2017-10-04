program Leapyears (input,output);
uses crt;
{By:Neel Patel - 9B}
{ICS 2O3}
{Created: 28 Feb 2012}
{Last edited: 29 Feb 2012}
{Calulates if inputed year is a leap year}
var
Year:integer;
LeapYear:boolean;
begin
writeln('year?');
readln(Year);

if (Year mod 100=0)
 then
   if (Year mod 400=0)
    then
     LeapYear:=true
    else
     LeapYear:=false
 else
 LeapYear:=false;

if LeapYear
then
writeln('It is a leap year.')
else
writeln('It is not a leap year.');

readln
end.
