program GetLetter (output);
uses crt;

{Created by: Neel Patel}
{Created on: 29/03/12}
{Last Edited: 29/02/12}
{This program finds the amount of the letter you wish to find in
 a user defined String value}


var
I:integer;
S:string;
HM:integer; {How many}
Len:integer;
Let:char;

begin
ClrScr;
writeln('Enter a sentence:');
readln(S);
writeln('Enter a letter:');
readln(Let);

Len:=Length(S);

     for I:= 1 to Len do
       begin
        if (S[I] = Let) then
        HM:=HM+1;
        end;

writeln('There are ',HM,' ',Let,'''s in "',S,'".');
readln;
end.