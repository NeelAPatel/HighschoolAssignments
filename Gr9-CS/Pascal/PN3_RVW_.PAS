program MailCost (input,output);
uses crt;
{By:Neel Patel - 9B}
{ICS 2O3}
{Calulates cost of package according to weight in grams}
var
Grams:integer;
Cost:real;
begin
ClrScr;
writeln('Enter weight:');
readln(Grams);

if Grams<=30
  then
   Cost:=38
  else
    if (Grams>30) and (Grams<=50)
      then
       Cost:=55
      else
        if (Grams>50) and (Grams<=100)
          then
           Cost:=73
          else
           Cost:= 73+(((Grams-100)/50) *24);

      writeln('The cost is ',Cost:0:0,' cents for your package.');
readln
end.

