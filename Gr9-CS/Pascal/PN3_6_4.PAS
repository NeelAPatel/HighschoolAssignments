program LastNumber (input,output);
uses crt;

{Created By :Neel Patel - 9B}
{Created    : March 1 2012}
{Last edited: March 1 2012}
{Isolates the last digit and turns it into word format.}

var
Number:integer;
Last:integer;
Word:string;

begin
ClrScr;
writeln('Enter your number');
readln(Number);

Last:=Number mod 10;

if (Last>=0) and (Last<=9)
 then
   case Last of
       1:Word:='one';
       2:Word:='two';
       3:Word:='three';
       4:Word:='four';
       5:Word:='five';
       6:Word:='six';
       7:Word:='seven';
       8:Word:='eight';
       9:Word:='nine';
   end
 else
  writeln('Invalid entry');

  writeln('The last digit is ',Word,'.');
  readln;
  end.

