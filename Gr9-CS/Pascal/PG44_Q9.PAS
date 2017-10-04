program Junk;
uses crt;
   {Here's a comment}

   var
     A : real;
     B : real;
     C : char;

   const
     Width = 3;
     Precision=1;

   begin
     clrScr;

     A := 75.6;
     writeln('Here is the integer ',A:Width:Precision);

     B := 7.2;
     writeln('Here is the real ',B:Width:Precision);

     C:='*';
     writeln('And here''s the char ',C);

   end.