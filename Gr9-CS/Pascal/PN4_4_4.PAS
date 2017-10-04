program Pass (input, output);
uses crt;

var
User:string;
admin:string;
Count:integer;
passcount
begin
 Clrscr;
 NormVideo;
 writeln('This program askes for the user to enter a two-character password.');
 writeln('If correctly entered, he is allowed in the program. If not the user is forced out.');
 writeln(' Tip: the password involves both uppercase and lower case characters');
 writeln;
 writeln;

 Count := 0;
 admin :='nP';

 repeat
  writeln('What is the password');
  readln(User);
  if User <> admin
  then
   begin
    ClrScr;
    writeln('The password " ',User,' " is incorrect.');
    writeln('Incorrect pasword ',Count+1,'/3 times.');
    Count := Count+1;
   end;

  if User = admin
   then
   begin

   writeln('Welcome to the Fake FBI account.');
   readln;
   halt;
   end;


 until Count = 4
 end.