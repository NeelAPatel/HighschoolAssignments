Program RectangleArea;
uses crt;
{This program is desgned to find the area and the perimeter of a rectangle with given dimenstions}


var
   Length       : integer;  {Length}
   Width        : integer;  {Width}
   Area         : integer;  {Area}
   Perimeter    : integer;  {Perimeter}
            Add : integer;
             L  : string;
             W  : string;
             A  : string;
             P  : string;




begin


ClrScr;

Length       := 10         ;
Width        := 7          ;
Area         := 10*7       ;
Perimeter    := 2*(10+7)   ;
Add          := 10+7       ;
            A:='AREA'      ;
            W:='WIDTH'     ;
            L:='LENGTH'    ;
            P:='PERIMETER' ;

writeln('QUESTION:');
writeln;
writeln('What is the ',A,' and ',P,' of the rectangle if the ',L,' is ',Length,'cm, and the');
writeln( W,' is ',Width,'cm long?');
writeln;
writeln;
writeln('ANSWER:');
writeln;
writeln(A:12);
writeln;
writeln(A,' = ',L,' * ',W);
writeln(A,' = ',Length,' * ',Width);
writeln(A,' = ',Area);
writeln;
writeln;
writeln(P:15);
writeln;
writeln(P,' = 2(',L,' + ',W,')');
writeln(P,' = 2(',Length,' + ',Width,')');
writeln(P,' = 2(',Add,')');
writeln(P,' = ',Perimeter);
writeln;
writeln;
writeln('Therefore the ',A,' is equal to ',Area,' and the ',P,' is equal to ', Perimeter,'.');

readln
end.
