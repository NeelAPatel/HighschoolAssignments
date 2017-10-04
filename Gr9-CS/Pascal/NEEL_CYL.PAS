program Cylinder (input,output);
uses crt;

var
H  : real;
D  : real;
R  : real;
V  : real;
SA : real;
const
pi=3.141592654;

begin
ClrScr;

{DEFINE HEIGHT AND DIAMETER}
writeln('Enter the height of the cylinder:');
readln(H);
writeln('Enter the diameter of the cylinder:');
readln(D);

{CALCULATIONS}
R:= D/2;
    {Volume}
    V:=pi*R*R*H;
    {Surface Area}
    SA:=2*pi*R*R+pi*R*H;


writeln('The Volume of the cylinder is: ',V:1:2);
writeln('The Surface Area of the cylinder is: ',SA:1:2);




readln
end.

