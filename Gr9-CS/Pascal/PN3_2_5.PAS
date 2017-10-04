program MultipleNum (input,output);
uses crt;

var
FN:integer;
SN:integer;
Multiple:boolean;

begin
ClrScr;
write('No. 1: ');readln(FN);
write('No. 2: ');readln(SN);

if (FN mod SN=0)
then
writeln(FN,' is a multiple of ',SN)
else
writeln(FN,' is not a multiple of ',SN);

readln;
end.