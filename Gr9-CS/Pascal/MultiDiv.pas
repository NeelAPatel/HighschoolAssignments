program arraytrial;
uses crt;
{43 = +
 45 = -
 42 = *
 47 = /}
var
 i: integer;
 count:integer;
 a:integer;
 b:integer;
 c:integer;
 ans:integer;
 mdsign:integer
 addsub:integer; {char (i) replacement. addition and substraction only 43 + 45 - }
begin
ClrScr;
randomize;
writeln('before bullet proof');
mdsign:= random(6)+42;
writeln(mdsign,' ',chr(mdsign));

if (mdsign>42) and (mdsign<47) then
 repeat
  mdsign:=random(6)+42;
 until (mdsign=42) or (mdsign=47);
writeln('real value after bullet proof');
 writeln(mdsign,' ',chr(mdsign));

{Example of a possible question}
a:=random(50);
b:=random(50);
c:=random(50);

if mdsign=42 then
 begin
 ans:=a*b
 end;

if mdsign=47 then
 begin
 ans:=a div b;
 end;
writeln('Conclusion of multiply and divide program');
writeln(a,' ',chr(mdsign),' ',b);
writeln(ans);

readln;
 end.
