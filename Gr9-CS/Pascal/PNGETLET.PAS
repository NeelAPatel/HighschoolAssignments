program GetLetter (output);
uses crt;

{Created by: Neel Patel}
{Created on: 29/03/12}
{Last Edited: 29/02/12}
{This program finds the amount of "l"'s in the String value : Hello ,World!}


var
I:integer;
S:string;
HM:integer; {How many}
Len:integer;

begin
ClrScr;
S:='Hello, World!';
Len:=Length(S);

     for I:= 1 to Len do
       begin
        if (S[I] = 'l') then
        HM:=HM+1;
        end;

writeln('There are ',HM,' l''s in "',S,'".');
readln;
end.