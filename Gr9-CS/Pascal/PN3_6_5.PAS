program date (input,output);
uses crt;

{By:Neel Patel - 9B}
{ICS 2O3}
{Created: 28 Feb 2012}
{Last edited: 29 Feb 2012}
{Calulates yy mm dd into standard word format}
var
Day:integer;
Month:integer;
Year:integer;

begin
ClrScr;
writeln('yy mm dd');
readln(Year,Month,Day);

if (Year>50) and (Year<=99)
then
Year:=Year+1900
else
Year:=Year+2000;

if (Month>=1) and (Month<=12)
 then
   case Month of
     1:write('January');
     2:write('February');
     3:write('March');
     4:write('April');
     5:write('May');
     6:write('June');
     7:write('July');
     8:write('August');
     9:write('September');
     10:write('October');
     11:write('November');
     12:write('December');
   end {case}
 else
  writeln('Month is INVALID');

writeln(' ',Day,', ',Year);




readln

end.
