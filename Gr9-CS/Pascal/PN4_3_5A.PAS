program AnyExponent (input, output);
uses crt;
var
X:integer;
N:integer;
Ans:integer;

begin
ClrScr;
write('This program will calculate the value of ');
write('X^N');
writeln(' using user defined values.');
writeln;
writeln('Enter the value of X:');
readln(X);
writeln('Enter the value of N:');
readln(N);
writeln('Therefore the value of X^N is: ');
writeln(X:3,'^',N);
Ans:=
for N:= 0 to N do
  begin
    Ans:= Ans * X;
  end;

writeln(Ans);

readln;
end.


