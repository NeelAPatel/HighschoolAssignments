program Babble(input,output);
uses crt;

const
Pi= 3.14159;
Width=4;
Precision=1;

var
FirstLetter,SecondLetter:char;

begin


read(FirstLetter,SecondLetter);
writeln('Hi, mom, it''s me ',FirstLetter,' ',SecondLetter);
writeln('Are we having', Pi:Width:Precision,' for dessert tonight?');

end.