program absvalue (input,output);
uses crt;
{By:Neel Patel - 9B}
{ICS 2O3}
{Calulates absolute value}
var
X:real;
abs:real;

begin
ClrScr;
writeln('enter a number');
readln(X);

if X>=0
then
writeln('The X value and the absolute value are ',X:1:0)
else
 begin
 abs:=(X*-1);
 writeln('The X value is ',X:1:1,' and the absolute value is ',abs:1:1,'.');
 end;

readln;
end.