program Tests(input,output);
uses crt;


var
TestNumber:integer;
Score:integer;
WeightedScore:real;

begin
ClrScr;
writeln('Enter Test number and Score:  (format: "Test# Score")');
writeln;
readln(TestNumber,Score);

if (TestNumber>0) and (TestNumber<7)
 then
   if Score>=0
    then
     case TestNumber of
              1: WeightedScore := Score*(10/100);
          2,3,6: WeightedScore := Score*(20/100);
            4,5: WeightedScore := Score*(15/100);
     end

    else
    writeln('Score is Invalid')

  else
  writeln('Test Number is invalid');

  writeln('A score of ',Score,' on test ',TestNumber,' gives a weighted score of ',WeightedScore:1:1,'.');


readln;
end.


