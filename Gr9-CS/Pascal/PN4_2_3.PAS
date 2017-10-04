program Convert (input, output);
uses crt;

  const
    Width = 5;


  var
    Number    : integer;
    Divisor   : integer;
    Quotient  : integer;
    Remainder : integer;
    Position  : integer;

  begin
  ClrScr;
    Divisor := 1;
    for Position := 1 to Width - 1 do
      Divisor := Divisor * 10;
    read(Number);
    Remainder := Number;
    for Position := Width downto 1 do
      begin
        Quotient := Remainder div Divisor;
        write(Quotient:1);
        Remainder := Remainder mod Divisor;
        Divisor := Divisor div 10
      end;
    writeln;
    readln;
  end.
