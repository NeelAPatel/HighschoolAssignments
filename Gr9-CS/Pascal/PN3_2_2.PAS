program PageSide (input,output);
uses crt;

var
Page:integer;
LeftSide:boolean;

begin
ClrScr;
write('Page no: ');readln(Page);

if (ODD(Page))
then
LeftSide:=false
else
LeftSide:=true;

if LeftSide
then
writeln(Page,' will be on the left side')
else
writeln(Page,' will be on the right side');

readln
end.

