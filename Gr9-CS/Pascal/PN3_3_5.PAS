program isolation (input,output);
uses crt;
{By:Neel Patel - 9B}
{ICS 2O3}
{Created: 28 Feb 2012}
{Last edited: 1 Mar 2012}
{Calulates unknown variable x}
var
a,b,x:real;


begin
ClrScr;
writeln('enter value of a');
readln(a);
writeln('enter value of b');
readln(b);


if (a<>0)
then
  x:=(-b)/a
 else
  b:=0;

writeln('The value of x is: 'x:0:1);
writeln('The value of a is: 'a:0:1);
writeln('The value of b is: 'b:0:1);




readln;
end.


