program VoterTest (input, output);
uses crt;

const
MinAge = 18;
var
Age:integer;
Voter:boolean;

begin
ClrScr;
readln(Age);
if Age>=MinAge
then
Voter:=true
else
Voter:=false;

if Voter
then
writeln('eligible to vote')
else
writeln('not eligible to vote');
readln
end.
