program UserInputSum;
uses crt;

var

D1, D2, D3, DAL :real;
DM, count :integer;
name:string;
begin
ClrScr;

textcolor(white);
writeln('Today I shall take a POSITIVE Three-Digit Integer given by you and add up its    digits! :)');

writeln('Are   YOU   READY???');

writeln('First I would like to know your first name.');
textcolor(yellow);read(name);
textcolor(white);
writeln('Processing. Please wait... ');
    delay(2000);
    writeln('Lets get started in');
    writeln('     3...');
    delay(500);
    writeln('     2...');
    delay(500);
    writeln('     1...');
    delay(500);

    writeln('Lets go!');
    delay(500);

    writeln;
    writeln('First enter your 3 digit number, just make sure it is positive please.');
    textcolor(yellow);read(DM);

    D1:=DM/100;
    D1:=TRUNC(D1);

    D2:=DM/10;
    D2:=D2-(D1*10);
    D2:=TRUNC(D2);

    D3:=DM/1;
    D3:=D3-(D1*100);
    D3:=D3-(D2*10);
    D3:=TRUNC(D3);
    textcolor(green);
    writeln('Therefore the first digit is: ',D1:1:0);
    writeln('             second digit is: ',D2:1:0);
    writeln('              third digit is: ',D3:1:0);

    textcolor(white);
        writeln;
    writeln('See I am quite the powerful one.');
    writeln('I shall now calculate the sum of the digits. Please be patient.');
    repeat
     writeln('Processing...');
     delay(750);
     count:=count+1;
    until count=4;
    DAL:= (D1)+(D2)+(D3);
    delay(500);

    write('Thank you for your patience, ');
    textcolor(yellow);write(name);
    textcolor(white);writeln('. Here is your answer.');
    writeln;
    write(' THE  ANSWER  IS ');textcolor(red);writeln(DAL:1:0);
    writeln;

    textcolor(white);write('You will be returned back to the syntax screen in ');
    textcolor(yellow);write('7 seconds. ');
    textcolor(white);writeln('Thank you for       playing. Bye!');

    writeln('Counting down: ');
    count:=7;

    repeat
    delay(1000);
    writeln(count,'...');
    count:=count-1;
    until count=0;

readln;
end.