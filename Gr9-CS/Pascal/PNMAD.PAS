program Madlib1(input, output);
uses crt;
 var
  uname, sname, aname, occupation, danger, defeat, weapon, monster: string;

 begin
 ClrScr;
  { GREET THE USER }
  textcolor(white);
  writeln('Hello, what is your name? ');
  textcolor(yellow);readln(uname);

  writeln;
  textcolor(white);
  write('I hope you enjoy madlibs, ');
  textcolor(yellow);writeln(uname:0,'.');

  { USER MAKES CHOICES }
      textcolor(white);
      writeln('Please choose your words.');
      write('Try to pick funny words, ');
      textcolor(yellow);writeln(uname:0,'.');
      writeln;

      textcolor(white);writeln('Type a name.');
      textcolor(yellow);readln(sname);

      textcolor(white);writeln('Type a god like being.');
      textcolor(yellow);readln(aname);

      textcolor(white);writeln('Type a name for a villan.');
      textcolor(yellow);readln(monster);

      textcolor(white);writeln('Type a BAD occupation.');
      textcolor(yellow);readln(occupation);

      textcolor(white);writeln('Type a BAD weapon. (Ex: feather)');
      textcolor(yellow);readln(weapon);

      textcolor(white);writeln('Type something which is NOT dangerous. ');
      textcolor(yellow);readln(danger);

      textcolor(white);writeln('Type a method of defeat in PAST TENSE.');
      writeln('(EX: Choked, crushed, etc)');
      textcolor(yellow);readln(defeat);



  { PRINT THE Mad Lib }
      writeln;
      textcolor(white);write('Once upon a time, there was a person named ');
      textcolor(yellow);write(sname:0);
      textcolor(white);writeln('.');

      textcolor(white);write(sname:0);
      write(' was short mortal who spared with the best weapon available, ');
      textcolor(yellow);write(weapon:0);
      textcolor(white);writeln('. ');

      textcolor(white);write('This person was strange because he was the child of a great greek god of ');
      textcolor(yellow);write(occupation:0);
      textcolor(white);write(' named ');
      textcolor(yellow);write(aname:0);
      textcolor(white);writeln('. ');

      textcolor(white);write('Being quite weak but courageous, ');
      textcolor(yellow);write(sname:0);
      textcolor(white);write(' set out to defeat the ferocious');
      textcolor(white);writeln(' monster of ');
      textcolor(yellow);write(danger:0);
      textcolor(white);write(' called, ');
      textcolor(yellow);write(monster:0);
      textcolor(white);writeln('. ');

      textcolor(white);write('However he got defeated by getting ');
      textcolor(yellow);write(defeat:0);
      textcolor(white);writeln(' and died.');

      textcolor(white);write('R.I.P ');
      textcolor(yellow);write(sname:0);
      textcolor(white);writeln('.');

  { THANK THE USER }
      writeln;
      textcolor(white);write('I hope you liked your new madlib, ');
      textcolor(yellow); writeln(uname:0, '.');
      writeln;
      textcolor(white);writeln('Thank you for using my madlib.');

      textcolor(red);writeln('Credited to: Dr. Stermole.');
      writeln('http://www.dfstermole.net/Pascal/progproblems/pmadlibno.html');
      writeln('Altered by: Neel Patel 9B');

 textcolor(red);readln;
end.
