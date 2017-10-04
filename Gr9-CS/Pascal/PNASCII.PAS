program AngryBirds(output);

        {This program is designed to: Display a picture entirely out of
        symbols with correct colors in the places.}
        {         By: Neel Patel - 9B}
        {    Started: 23/11/11}
        {Last Edited: 30/11/11}
uses crt;

begin
textmode(259);
clrScr;

textcolor(red);
writeln('                                  ..,                               ');
writeln('                               ...@@@@..                            ');
writeln('                              ..@@@@@@@@@.                          ');
writeln('                              ..@@@@@@@@@@.                         ');
writeln('                      ..........@@@@@@@@@@@.                        ');
writeln('                    ..@@@@@@@@@@..@@@@@@@@@@.                       ');
writeln('                   ..@@@@@@@@@@@@@@..@@@@@@@@@.                     ');
writeln('                   ..:@@@@@@@@@@@@@@@@..@@@@@@.                     ');
writeln('                          ....,@@@@@@@@@@@@@@@@.                    ');
writeln('                        ..,@@@@@@@@@@@@@@@@@@@@@@...                ');
writeln('                       ..@@@@@@@@@@@@@@@@@@@@@@@@@@@@..             ');
writeln('                   ..::@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..             ');
writeln('                  ...:@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..          ');
writeln('                 ..:::@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..         ');
writeln('                ..:::@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.        ');
writeln('               ..::::@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@..      ');
writeln('              ..::::@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.,     ');



write('             ..:::::@@@@@@@@@@@@@@@@@');
textcolor(white); write('..');
textcolor(red);writeln('@@@@@@@@@@@@@@@@@@@@@@@      ');


write('            ..::::::@@@@@@@@@@@@@@@@');
textcolor(white);write('.....');
textcolor(red);write('@@@@@@@@@@@@@@@@@@@');
textcolor(white);write('..');
textcolor(red);writeln('..    ');


write('            .::::::@@@@@@@@@@@@@@@@');
textcolor(white);write('........');
textcolor(red);write('@@@@@@@@@@@@@@@');
textcolor(white);write('....:');
textcolor(red);writeln('~.   ');


write('           .,::::::@@@@@@@@@@@@@@@@');
textcolor(white);write('..........');
textcolor(red);write(':@@@@@@@@@');
textcolor(white);write('........');
textcolor(red);writeln('~.   ');


write('          ..:::::::@@@@@@@@@@@@@@@@@@');
textcolor(white);write(',..........');
textcolor(red);write('@@@@');
textcolor(white);write('..........:');
textcolor(red);writeln('@@:. ');


write('         ..:::::::@@@@@@@@@@@@@@@@@@::777');
textcolor(white);write('.................');
textcolor(red);writeln(':@@@@@@.   ');



write('         ..::::::::@@@@@@@@@@@@@@@@@:.I');;write('       +');
textcolor(white);write('IIIIIII');
textcolor(red);writeln('7    ::@@@@.  ');


write('        ..::::::::@@@@@@@@::::@@@@::.I   ');
textcolor(white);write(' /I\    I..I  <I>');
textcolor(red);writeln('  ::@@@@.. ');


write('        ..::::::::@@@@@@@@:::::@@:::.II  ');
textcolor(white);write(' \I/');
textcolor(red);writeln('  .,II      ..::::@@..');

write('        ..::::::::@@@@@@@@:::::@@::::.I=.......');
textcolor(yellow);write('=+++..');
textcolor(red);writeln(' .::::::@@..   ');


write('        ..:::::::::::::@@@:::::@@::::,:::::..');
textcolor(yellow);write('++++++++,.');
textcolor(red);writeln(':::::::@@.:  ');


write('          :.:::::::::::::@@:::::@@::::::::');
textcolor(yellow);write(',.+++++++++++++');
textcolor(red);writeln('.:::::@@   ');


write('          .:::::::::,::::@@:::::@@@::::::');
textcolor(yellow);write('.++++++++++++++++..');
textcolor(red);writeln(':@@@..  ');


write('          ..:::::::::,::@@@@@@@@@@@@@+++');
textcolor(yellow);write('.+++++++++++++++++++.');
textcolor(red);writeln('@@@..  ');


write('           .::::::::::::@@@@@@');
textcolor(white);write('?????????,');
textcolor(yellow);write('....+++++++++++++++++.');
textcolor(red);writeln('@..   ');


write('           ..::::::::::::');
textcolor(white);write('~?????????????=');
textcolor(yellow);write('.    +........:++++++.');
textcolor(red);writeln(':.    ');


write('             .::::::::::');
textcolor(white);write('????????????????');
textcolor(yellow);write('....++++++++++++...++');
textcolor(red);writeln('...    ');


write('              ...::::::');
textcolor(white);write('????????????????????');
textcolor(yellow);write('..++++++++++.');
textcolor(red);writeln('@@@@..     ');



write('                ...;::');
textcolor(white);write('????????????????????????');
textcolor(yellow);write('..=++++~');
textcolor(red);writeln('.??@@..      ');


write('                 ...');
textcolor(white);write('???????????????????????????');
textcolor(yellow);write('....');
textcolor(red);writeln('?????:...        ');

write('                  ..');
textcolor(white);write('???????????????????????????????+');
textcolor(red);writeln('.....             ');


write('                     ..,');
textcolor(white);write('????????????????????????');
textcolor(red);writeln(':....               ');


write('                       ......');
textcolor(white);write('????????????~');
textcolor(red);writeln('.......                   ');


writeln(' ANGRY BIRDS!');
writeln('Project by: Neel Patel - 9B');
writeln(' Copyright: Rovio');
writeln(' Ascii art project');
writeln('Note: Many symbols were modified for better viewing Ex: ~ ---> @');

readln
end.

