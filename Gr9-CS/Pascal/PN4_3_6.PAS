program BankAcc (output);
uses crt;


var
Year   :integer;
Ammount:real;



begin
ClrScr;
Year    := 0;
Ammount := 1000;

repeat
writeln(Year, Ammount:3:3);
Ammount:= Ammount * 108 / 100;
Year:= Year+1;

until Year := 50;



{for Year := 0 to 50 do
  begin
    Ammount := (Ammount * 108) / 100;
    writeln(Year,Ammount:2:2);
    Year := Year+1;
  end;}
readln;
end.
