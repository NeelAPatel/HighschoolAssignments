program UseImages;
{s key 'S'tops the program}
uses graph, crt;
{Logo}
{$I D:\bin\plus.inc}
{$I D:\bin\minus.inc}
{$I D:\bin\divide.inc}
{$I D:\bin\multiply.inc}

{$I D:\bin\f1.inc}
{$I D:\bin\f2.inc}
{$I D:\bin\f3.inc}
{$I D:\bin\f4.inc}
{$I D:\bin\broccoli.inc}

var
 {graphics Setup integers}
   device,mode: integer;
   count: integer;

 {Game Board variables}
  x,y,Mcount:integer;
 {Question variables}
  {Var for each integer}
	a,b,c:integer;
	ph:string;
   {Answer Comments}
	ans, MainAns,UserAns:integer;
   {sign determiners}
	mdsign, sasign:integer;

{Game Piece var}
	PieceChoice:integer;
	Px,Py:integer;
	LowPX,LowPY,MaxPX,MaxPY:integer;
  {Logo variables}
	Logo:text;
	LineL:array[1..36] of string;
	Lx,Ly:integer;
        User:string;
{----------------------------SETUP------------------------------------}
procedure Setup;
 begin
  detectgraph(device, mode);
  InitGraph(device, mode, 'd:\bgi');
  setbkcolor(0);
 end;
{-----------------ClrScr------------}
procedure ClearScr;
begin
 setfillstyle(solidfill,0);{Black Box}
 bar(0,0,640,480);
end;
{-----------------------------LOGO------------------------------------}
procedure MainLogo;
 begin
 assign(logo,'Logo.txt');
  reset(logo);
  Ly:=100;
  for Lx:=1 to 36 do
  begin
    readln(logo,LineL[Lx]);
    outtextXY(30,Ly,LineL[Lx]);
    Ly:=Ly+8;
  end;

   memgetplusimage;
    begin
   x := 15;
   y := 40;
   putimage (x, y, plus^, NormalPut);
    end;
 memgetminusimage;
 begin
  x := 200;
  y := 5;
  putimage (x, y, minus^, NormalPut);
  end;

  memgetmultiplyimage;
  begin
  x:=320;
  y:=5;
  putimage(x,y, multiply^,NormalPut);
  end;
  memgetdivideimage;
  begin
  x := 540;
  y := 40;
  putimage (x, y, divide^, NormalPut);
end;
outtextXY(150,400,'PRESS ENTER TO CHOOSE YOUR PLAYING PIECE');
outtextXY(1,472,'Terry Zeng');
outtextXY(560,472,'Neel Patel');
 close(Logo);
 readln;
 end;


{-------------------------CHOOSE PIECE----------------------------------}
procedure ChoosePiece;
  var
   x,y:integer;
{This program lets the user choose a playing piece from 5 given pieces
using numbers 1 to 5}
  begin

  outtextXY(1,1,'Choose your gaming piece by pressing a number from 1-5,');
  outtextXY(1,10,'then pressing the Enter Key to Start!');
   memgetf1image;
   begin
    x:= 20;
    y:= 40;
    putimage (x,y,f1^,NormalPut);
   end;
   memgetf2image;
   begin
    x:= 70;
    y:= 40;
    putimage (x,y,f2^,NormalPut);
   end;
   memgetf3image;
   begin
    x:= 120;
    y:= 40;
    putimage (x,y,f3^,NormalPut);
   end;
   memgetf4image;
   begin
    x:= 170;
    y:= 40;
    putimage (x,y,f4^,NormalPut);
   end;
   memgetbroccoliimage;
   begin
    x:= 220;
    y:= 40;
    putimage (x,y,broccoli^,NormalPut);
   end;

  gotoxy(5,6);
   readln(PieceChoice);
if (PieceChoice>=1) and (PieceChoice<=5) THEN
 begin
   outtextxy(5,110,'Continue');
 end
ELSE
 begin
   repeat
   outtextXY(5,110,'Please enter a valid value: (1 to 5)');

   readln(PieceChoice);
   until (PieceChoice>=1) and (PieceChoice<=5);
   setfillstyle(solidfill,0);
   bar(5,110,640,13);
   outtextXY(5,110,'Continue');
 end;

  outtextXY(5,280,'Enter Your Name, Player');
  gotoxy(5,20);
  readln(User);
  outtextxy(5,320,'Hit Enter again to start the game.');
  readln;
end;


procedure MainGame;

        {--------------------gameBORDER----------------}
     procedure GBorder;
	{Draws a pink border around the 640 x 480 screen}
	begin


  setfillstyle(solidfill,lightred);
   bar(0,0,640,8);{Top}
   bar(0,0,8,480);{bottom}
   bar(0,472,640,480); {left}
   bar(631,0,640,480); {right}
 end;{GameBorder Procedure}

        {--------------------gameBOARD-----------------}
	procedure GameBoard;
	{Draws the game board circles using green}
	begin
  setcolor(green);
  count:=1;
  y:=45;                {Left column  7 cirles}
   for count:=1 to 7 do
    begin
     circle(56,y,29);
     y:=y+65;
    end;

  y:=45;
   for count:=1 to 7 do {Right Column  7 circles}
    begin
     circle(584,y,29);
     y:=y+65;
    end;

  x:=122;                {Top row middle 7}
   for count:=1 to 7 do
    begin
     circle(x,45,29);
     x:=x+66;
    end;

  x:=122;                {bottom row middle 7}
   for count:=1 to 7 do
    begin
     circle(x,435,29);
     x:=x+66;
    end;

{ Line(320,0,320,480);   { x axis :320 px mark}
 {Line(0,240,640,240);   { y axis :240 px mark}
 setfillstyle(solidfill,1);{Blue Box}
 bar(98,90,542,390);
 setcolor(White);
 outtextXY(36,41,'START');
 outtextXY(308,41,'END');
end; {GameBoard Procedure}

        {------------------DISPLAY PIECE----------------}
	procedure DisplayPiece;
     {Uses case statement to determine what piece the user has chosen}
     {and place the right one on the game board itself}
	begin
  x:=36;
  y:=25;
    case PieceChoice of
     1:begin
        putimage (x,y,f1^,NormalPut);
       end;
     2:begin
        putimage (x,y,f2^,NormalPut);
       end;
     3:begin
        putimage (x,y,f3^,NormalPut);
       end;
     4:begin
        putimage (x,y,f4^,NormalPut);
       end;
     5:begin
        putimage (x,y,broccoli^,NormalPut);
       end;
    end;{Case}
end; {PieceOnGBoard Procedure}

begin
  GBorder;
  GameBoard;
  DisplayPiece;
end;


{-------------------------QUESTIONS-----------------------------------}
procedure Questions;
{Determines the question to be asked}
 begin
 randomize;
 setcolor(white);
 {--Multiply or divide--}
   mdsign:= random(6)+42;
     if (mdsign>42) and (mdsign<47) then
      begin
      repeat
        mdsign:=random(6)+42;
      until (mdsign=42) or (mdsign=47);
      end;
  {--Three variables for the three integer in the question--}
     a:=random(20)+1;
     b:=random(20)+1;
     c:=random(20)+1;

   {--Addition or Substraction--}
    sasign:=random(3)+43;
    if sasign=44 then
	  begin
	   repeat
	    sasign:=random(3)+43;
	   until sasign<>44;
	  end;

 {-- Finding answer to: A with B (* or div)--}
	if mdsign=42 then
     begin
      ans:=a*b
     end
    ELSE
     if mdsign=47 then
      begin
      	ans:=a div b;
      end
     ELSE
       begin
       	writeln('Error');
       end;
 {-- Finding answer to: Previous answer of A and B with C (+ or -)--}
	if sasign=43 then
	  begin
	   MainAns:=ans+c;
	  end
	 ELSE
	  if sasign = 45 then
	   begin
	    MainAns:=ans-c;
	   end
	  ELSE
	   begin
	   	outtextXY(318,240,'Error');
	   end;
end;{Questions Procedure}

{----------------------DISPLAY QUESTIONS------------------------------}
procedure DisplayQuestions;
{Displays the question on the screen with proper grammar}
 begin
{str = string}
{ph = stringholder}
{str(integer variable, stringholder);}
outtextXY(100,100,'What is the answer to ');
str(a,ph);
outtextXY(276,100,ph); {a value}
outtextXY(300,100,chr(mdsign));
str(b,ph);
outtextXY(316,100,ph);
outtextxy(340,100,chr(sasign));
str(c,ph);
outtextXY(356,100,ph);
outtextXY(372,100,'?');

{Uncomment for Answer Key}
outtextXY(288,120,'Ans:');
str(MainAns,ph);
outtextXY(320,120,ph);

str(MCount,ph);
outtextXY(526,112,ph);
outtextXY(518,120,'---');
outtextXY(526,128,'33');
end;{Display Questions}

{---------------------------ANSWER------------------------------------}
procedure Answer;
{Reads answer from the user}
begin
{outtextXY(400,100,MainAns);{Displays the answer to the question}
	gotoxy(14,8);
           readln(UserAns);
	   if UserAns=MainAns then
		 begin
		  outtextXY(100,113,'Your Answer is Correct!');
		 end
		ELSE
		 begin
		  outtextXY(100,113,'-Gasp! O_O Your Answer is Incorrect!');
		 end;

 end;{Answer Procedure}

{-------------------------CLEAR BOX-----------------------------------}
procedure ClrBox;
begin
 setfillstyle(solidfill,1);
 bar(98,90,542,390);
   count:=1;

 {Left Column 7 circles}
   setfillstyle(solidfill,0);
   setcolor(0);
   y:=45;
    for count:=1 to 7 do
     begin
       circle(56,y,28);
       fillellipse(56,y,28,28);
      y:=y+65;
     end;

{Right Column  7 circles}
   setfillstyle(solidfill,0);
   setcolor(0);
    y:=45;
   for count:=1 to 7 do
    begin
     circle(584,y,28);
     fillellipse(584,y,28,28);
     y:=y+65;
    end;

{Top Row Middle 7 Circles}
   setfillstyle(solidfill,0);
   setcolor(0);
	 x:=122;
    for count:=1 to 7 do
     begin
      circle(x,45,28);
      fillellipse(x,45,28,28);
	  x:=x+66;
     end;

{Bottom Row Middle 7 Cirlces}
   setfillstyle(solidfill,0);
   setcolor(0);
   x:=122;
    for count:=1 to 7 do
     begin
      circle(x,435,28);
      fillellipse(x,435,28,28);
	  x:=x+66;
     end;
	  setcolor(White);
 outtextXY(36,41,'START');
 outtextXY(308,41,'END');
end;


{-------------------------MOVE PIECE----------------------------------}
procedure MovePiece;
{Moves the Piece around the board according to the answer}
begin
	 LowPX:=36;
	 LowPY:=25;
	 MaxPX:=564;
	 MaxPY:=415;

{--------------------MOVING FORWARD--------------------}
IF (UserAns=MainAns) and (Py=LowPY) and (Px<MaxPX) then
		  begin
			Px:=Px+66 ;
			Py:=LowPy;
			case PieceChoice of
			 1:begin
				putimage (Px,Py,f1^,NormalPut);
			   end;
			 2:begin
				putimage (Px,Py,f2^,NormalPut);
			   end;
			 3:begin
				putimage (Px,Py,f3^,NormalPut);
			   end;
			 4:begin
				putimage (Px,Py,f4^,NormalPut);
			   end;
			 5:begin
				putimage (Px,Py,broccoli^,NormalPut);
			   end;
			end;
			exit;
		  end;

IF (UserAns=MainAns) and (Py<MaxPY) and(Px=MaxPX) then
		 begin
		   Px:=MaxPX;
		   Py:=Py+65;
		   case PieceChoice of
			 1:begin
				putimage (Px,Py,f1^,NormalPut);
			   end;
			 2:begin
				putimage (Px,Py,f2^,NormalPut);
			   end;
			 3:begin
				putimage (Px,Py,f3^,NormalPut);
			   end;
			 4:begin
				putimage (Px,Py,f4^,NormalPut);
			   end;
			 5:begin
				putimage (Px,Py,broccoli^,NormalPut);
			   end;
			end;{case}
			exit;
		  end;

IF (UserAns=MainAns) and (Py=MaxPY) and (Px>LowPx) then
		 begin
		  Px:=Px-66; {to go left and continue}
		  Py:=MaxPY;
		  case PieceChoice of
			1:begin
			   putimage (Px,Py,f1^,NormalPut);
			  end;
			2:begin
			   putimage (Px,Py,f2^,NormalPut);
			  end;
			3:begin
			   putimage (Px,Py,f3^,NormalPut);
			  end;
			4:begin
			   putimage (Px,Py,f4^,NormalPut);
			  end;
			5:begin
			   putimage (Px,Py,broccoli^,NormalPut);
			  end;
			end;{Case}
			exit;
		  end;{if statement}

IF (UserAns=MainAns) and (Px=LowPX) and (Py>LowPy) then
		  begin
			Px:=LowPX; {to go left and continue}
			Py:=Py-65;
			case PieceChoice of
			 1:begin
				putimage (Px,Py,f1^,NormalPut);
			   end;
			 2:begin
				putimage (Px,Py,f2^,NormalPut);
			   end;
			 3:begin
				putimage (Px,Py,f3^,NormalPut);
			   end;
			 4:begin
				putimage (Px,Py,f4^,NormalPut);
			   end;
			 5:begin
				putimage (Px,Py,broccoli^,NormalPut);
			   end;
			end;{Case}
			exit;
		  end;

{Answer wrong, at corners}
IF  (UserAns<>MainAns) and (Px=LowPX) and (Py=LowPY) THEN {TOP LEFT:Mistake}
	begin
	    Px:=LowPX;
		Py:=LowPY;
	    case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
		exit;
	  end;

IF  (UserAns<>MainAns) and (Px=MaxPX) and (Py=LowPY) THEN {TOP RIGHT:Mistake}
	begin
	    Px:=MaxPx-66;
		Py:=LowPy;
	    case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
	exit;
	end;

IF  (UserAns<>MainAns) and (Px=MaxPX) and (Py=MaxPY) THEN {BOTTOM RIGHT:Mistake}
	begin
	    Px:=MaxPX;
		Py:=MaxPY-65;
	    case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
		exit;
	end;

IF  (UserAns<>MainAns) and (Px=LowPX) and (Py=MaxPY) THEN {BOTTOM LEFT:Mistake}
	begin
	    Px:=LowPX;
		Py:=MaxPY-65;
	    case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
		exit;
	end;


{Answer Wrong, Not at Corners}
IF (UserAns<>MainAns) and (Px<MaxPX) and (Py=LowPY) THEN { Mistake in Top Row}
      begin
	   Px:=Px-66 ;
	   Py:=LowPY;
	   case PieceChoice of
	    1:begin
		   putimage (Px,Py,f1^,NormalPut);
	      end;
	    2:begin
		   putimage (Px,Py,f2^,NormalPut);
	      end;
	    3:begin
		   putimage (Px,Py,f3^,NormalPut);
	      end;
   	    4:begin
		   putimage (Px,Py,f4^,NormalPut);
	      end;
	    5:begin
		   putimage (Px,Py,broccoli^,NormalPut);
	      end;
	    end;{Case}
		exit;
      end;{if statement}

IF (UserAns<>MainAns) and (Px=MaxPX) and (Py<MaxPY) THEN { Mistake in Right Column}
      begin
		Px:=MaxPx ;
		Py:=Py-65;
		case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
		exit;
      end;{if Staement}

IF (UserAns<>MainAns) and (Px>LowPX) and (Py=MaxPY) THEN  { Mistake in Bottom row }
	begin
		Px:=Px+66 ;
		Py:=MaxPy;
		case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
        exit;
	  end;{if statement}

IF (UserAns<>MainAns) and (Px=LowPX) and (Py>LowPY) THEN {Mistake in Left Column}
	  begin
		Px:=LowPx;
		Py:=Py+66;
		case PieceChoice of
		 1:begin
			putimage (Px,Py,f1^,NormalPut);
		   end;
		 2:begin
			putimage (Px,Py,f2^,NormalPut);
		   end;
		 3:begin
			putimage (Px,Py,f3^,NormalPut);
		   end;
		 4:begin
			putimage (Px,Py,f4^,NormalPut);
		   end;
		 5:begin
			putimage (Px,Py,broccoli^,NormalPut);
		   end;
		end;{Case}
		exit;
	  end;{if statement}

end;{MovePiece Procedure}

procedure WinLose;
begin
if (Mcount=33) and (Px=300) and (Py=25) then
  begin
   outtextXY(150,100,User);
   outtextXY(206,100,' YOU WON THE GAME! ');
   outtextXY(150,108,'CONGRATULATIONS!!!!');
  end
 ELSE
  begin
   outtextXY(150,100,' Sorry!');
   outtextXY(214,100,User);
   outtextXY(262,100,', You could''nt reach the END ');
   end;
 exit;
end; {Procedure WinLose}

{-------------MAIN BEGIN------------------MAIN BEGIN------------------}
 begin
  setup;
   ClearScr;
  MainLogo;
   ClearScr;
  ChoosePiece;
   ClearScr;
  MainGame;
    {GBorder;
    GameBoard;
    DisplayPiece;}
  Mcount:=1;
  Px:=36;
  Py:=25;
  repeat
    Questions;
    DisplayQuestions;
    Answer;
    ClrBox;

    MovePiece;
    Mcount:=Mcount+1;
  until Mcount=33;
  WinLose;
  readln;
  closegraph; {clear screen when the first time run the program}
end.
