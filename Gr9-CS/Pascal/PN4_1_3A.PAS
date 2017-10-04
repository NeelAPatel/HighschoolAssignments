program Table (input, output);
uses crt;
{By: Neel Patel}
{Created: 29/03/12}
{Last Edited: 29/03/12}
{This program creates a table for the squares, cubes,
square roots and reciprocals}
var
N     : integer;
SqrM  : integer;
CubeM : integer;
SqrtM : real;
RC    : real;

begin
ClrScr;
writeln('Number:     Square:     Cube:     Square Root:     Reciprocal:');
N:=1;
for N:= 1 to 40 do
  begin
    SqrM:= sqr(N);
    CubeM:=N*N*N;
    SqrtM:=sqrt(N);
    RC:= 1/N;
    writeln(N:4,SqrM:13,CubeM:12,SqrtM:14:3,RC:16:3)
  end;

readln;
end.
