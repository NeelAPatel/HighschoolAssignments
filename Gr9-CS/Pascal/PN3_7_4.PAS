program DivisionGender (input,output);
uses crt;

{Created by:Neel Patel - 9B}
{Created on:Mar 1 2012}
{Last edited on:Mar 1 2012}
{Takes in a code and rewrites in full form}
var
DivisionCode:char;  {MJS}
Division:string;
SexCode:char;
Gender:string;    {BG}

begin
ClrScr;
writeln('Enter Code');
readln(DivisionCode,SexCode
);

if (DivisionCode='M') or (DivisionCode='J') or (DivisionCode='S')
 then
    case DivisionCode of
       'M':Division:='Midget';
       'J':Division:='Junior';
       'S':Division:='Senior';
    end
 else
  writeln('Division code is invalid.');

if (SexCode='B') or (SexCode='G')
  then
    case SexCode of
       'B':Gender:='boys';
       'G':Gender:='girls';
    end
  else
   writeln('Sex Code is Invalid');


writeln(DivisionCode,SexCode,' represents: ',Division,' ',Gender);
readln;
end.

