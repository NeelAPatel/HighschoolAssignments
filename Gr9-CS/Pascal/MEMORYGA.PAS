program memory (input, output);
 uses crt;
  type
  Pieces_Type = array ['a'..'h'] of string[2];
  Board_Type =  array [1..8, 'a'..'h'] of string[2];
var
  MenOnBoard : Board_Type; Ccardnum1 : integer; Ccardnum2 : integer;   choose : integer;
   procedure maketitlepage; {creates the title page for this game}
    begin
      clrscr;
      textbackground(blue);
      textcolor(white);
      writeln ('           Created By: Sajay & Danny          ');
      writeln ('                                              ');
      writeln ('                                              ');
      writeln ('                                              ');
      writeln ('                                              ');
      writeln ('             ---------------------            ');
      writeln ('            |                     |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M M       M M    |           ');
      writeln ('            |    M  M     M  M    |           ');
      writeln ('            |    M   M   M   M    |           ');
      writeln ('            |    M    M M    M    |           ');
      writeln ('            |    M     M     M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |    M           M    |           ');
      writeln ('            |                     |           ');
      writeln ('             ---------------------            ');
      writeln ('                                              ');
      writeln ('                                              ');
      writeln ('          The Awesome Game of Memory          ');
      writeln ('                                              ');
      writeln ('                                              ');
      writeln ('                                              ');
      textbackground(black);
      readln;
    end;
      procedure pointofprogram; {tells player point of game}
    begin
      clrscr;
      textcolor(white);
      writeln ('Hello, welcome to our memory game. In this game, you must choose 2');
      writeln ('cards to see if they match. To win, you must match all 20 cards');
      writeln ('you get 25 chances to pick cards, after that, the program will terminate');
      readln;
    end;
      Procedure PrintBoard(Board : Board_Type);
var
  col : char;
  row : integer;
  i : integer;

begin
  ClrScr;
  write(chr(201));
  for i := 1 to 4 do
    write(chr(205), chr(205), chr(203));
  writeln(chr(205), chr(205), chr(187));
  for row := 4 downto 1 do
    begin
      write(chr(186));
      for col := 'a' to 'e' do
        begin
          write(Board[row, col]:2);
          write(chr(186))
        end;
      writeln;
      if row > 1 then
        begin

          write(chr(204));
          for i := 1 to 4 do
            write(chr(205), chr(205), chr(206));
          writeln(chr(205), chr(205), chr(185))
        end
    end;
  write(chr(200));
  for i := 1 to 4 do
    write(chr(205), chr(205), chr(202));
  writeln(chr(205), chr(205), chr(188));
  readln;
end;
   procedure makecard1; {card 1}
      begin
         textcolor (white);
         writeln ('*');
      end;
   procedure makecard2; {card 2}
      begin
         textcolor (yellow);
         writeln ('@');
      end;
   procedure makecard3; {card 3}
      begin
         textcolor (red);
         writeln ('!');
      end;
   procedure makecard4; {card 4}
      begin
         textcolor (green);
         writeln ('#');
      end;
   procedure makecard5; {card 5}
      begin
         textcolor (brown);
         writeln ('$');
      end;
   procedure makecard6; {card 6}
      begin
         textcolor (red);
         writeln ('!');
      end;
   procedure makecard7; {card 7}
      begin
         textcolor (white);
         writeln ('*');
      end;
   procedure makecard8; {card 8}
      begin
         textcolor (green);
         writeln ('#');
      end;
   procedure makecard9; {card 9}
      begin
         textcolor (brown);
         writeln ('$');
      end;
   procedure makecard10; {card 10}
      begin
         textcolor (yellow);
         writeln ('@');
      end;
   procedure makecard11; {card 11}
      begin
         textcolor (white);
         writeln ('@');
      end;
   procedure makecard12; {card 12}
      begin
         textcolor (yellow);
         writeln ('!');
      end;
   procedure makecard13; {card 13}
      begin
         textcolor (red);
         writeln ('#');
      end;
   procedure makecard14; {card 14}
      begin
         textcolor (green);
         writeln ('$');
      end;
   procedure makecard15; {card 15}
      begin
         textcolor (brown);
         writeln ('!');
      end;
   procedure makecard16; {card 16}
      begin
         textcolor (red);
         writeln ('*');
      end;
   procedure makecard17; {card 17}
      begin
         textcolor (white);
         writeln ('#');
      end;
   procedure makecard18; {card 18}
      begin
         textcolor (green);
         writeln ('$')
      end;
   procedure makecard19; {card 19}
      begin
         textcolor (brown);
         writeln ('@');
      end;
   procedure makecard20; {card 20}
      begin
         textcolor (yellow);
         writeln ('*');
      end;
   procedure makecards1;
      begin
        writeln ('There are 4 symbols and 5 colors for the symbols, to play, you must ');
        writeln ('type in the number of the card that you want to choose');
        writeln ('please type in the number of the first card that you want to choose.');
        readln(Ccardnum1);
        if Ccardnum1= 1 then
        makecard1;
        if Ccardnum1= 2 then
        makecard2;
        if Ccardnum1= 3 then
        makecard3;
        if Ccardnum1= 4 then
        makecard4;
        if Ccardnum1= 5 then
        makecard5;
        if Ccardnum1= 6 then
        makecard6;
        if Ccardnum1= 7 then
        makecard7;
        if Ccardnum1= 8 then
        makecard8;
        if Ccardnum1= 9 then
        makecard9;
        if Ccardnum1= 10 then
        makecard10;
        if Ccardnum1= 11 then
        makecard11;
        if Ccardnum1= 12 then
        makecard12;
        if Ccardnum1= 13 then
        makecard13;
        if Ccardnum1= 14 then
        makecard14;
        if Ccardnum1= 15 then
        makecard15;
        if Ccardnum1= 16 then
        makecard16;
        if Ccardnum1= 17 then
        makecard17;
        if Ccardnum1= 18 then
        makecard18;
        if Ccardnum1= 19 then
        makecard19;
        if Ccardnum1= 20 then
        makecard20;
        readln;
      end;
   procedure makecards2;
      begin
        writeln ('please type the number of the second card you want to choose.');
        readln(Ccardnum2);
        if Ccardnum2= 1 then
        makecard1;
        if Ccardnum2= 2 then
        makecard2;
        if Ccardnum2= 3 then
        makecard3;
        if Ccardnum2= 4 then
        makecard4;
        if Ccardnum2= 5 then
        makecard5;
        if Ccardnum2= 6 then
        makecard6;
        if Ccardnum2= 7 then
        makecard7;
        if Ccardnum2= 8 then
        makecard8;
        if Ccardnum2= 9 then
        makecard9;
        if Ccardnum2= 10 then
        makecard10;
        if Ccardnum2= 11 then
        makecard11;
        if Ccardnum2= 12 then
        makecard12;
        if Ccardnum2= 13 then
        makecard13;
        if Ccardnum2= 14 then
        makecard14;
        if Ccardnum2= 15 then
        makecard15;
        if Ccardnum2= 16 then
        makecard16;
        if Ccardnum2= 17 then
        makecard17;
        if Ccardnum2= 18 then
        makecard18;
        if Ccardnum2= 19 then
        makecard19;
        if Ccardnum2= 20 then
        makecard20;
        readln;
      end;
   procedure checkifsame;
      begin
        if Ccardnum1= 1 then
        if Ccardnum2= 7 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        readln;
        if Ccardnum1= 2 then
        if Ccardnum2= 10 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 3 then
        if Ccardnum2= 6 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 4 then
        if Ccardnum2= 8 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 5 then
        if Ccardnum2= 9 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 11 then
        if Ccardnum2= 19 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 12 then
        if Ccardnum2= 15 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 13 then
        if Ccardnum2= 17 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 14 then
        if Ccardnum2= 18 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum1= 16 then
        if Ccardnum2= 20 then
        writeln ('good job, you found one matching pair! please press enter to continue.');

        if Ccardnum2= 1 then
        if Ccardnum1= 7 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 2 then
        if Ccardnum1= 10 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 3 then
        if Ccardnum1= 6 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 4 then
        if Ccardnum1= 8 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 5 then
        if Ccardnum1= 9 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 11 then
        if Ccardnum1= 19 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 12 then
        if Ccardnum1= 15 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 13 then
        if Ccardnum1= 17 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 14 then
        if Ccardnum1= 18 then
        writeln ('good job, you found one matching pair! please press enter to continue.');
        if Ccardnum2= 16 then
        if Ccardnum1= 20 then
        writeln ('good job, you found one matching pair! please press enter to continue.')
       end;
        procedure thankyou;
        begin
        writeln ('thank you for playing');
        readln
      end;
      begin
      clrscr;
       maketitlepage;
       pointofprogram;
       printboard(MenOnBoard);
       for choose:= 1 to 25 do makecards1;makecards2; checkifsame;
       thankyou;
     end.
