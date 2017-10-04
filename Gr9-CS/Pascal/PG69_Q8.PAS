program Deficit;
uses crt;

const
grods:real=47000000;
precision:real=1000000;
var
grod1:real;
grod2:real;

begin
ClrScr;
writeln;
writeln('Current deficit of Arrakis is ',grods:1:0);
grod1:=(grods*104.5)/100;
grod1:=grod1/precision;
writeln('Deficit of Arrakis next year is about: ',grod1:1:0);
grod1:=(grods*104.5)/100;
grod2:=(grod1*104.5)/100;
grod2:=grod2/precision;
writeln('Deficit of Arrakis in 2 years is about: ',grod2:1:0);
readln
end.