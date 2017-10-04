  /* Variables */
  int xcor = 300;
  int ycor = 520;
  int xminion = 200;
  int yminion = 520;
  
  int xcarrot = 10;
  int ycarrot = -100;
  int xbanana = 10;
  int ybanana = -100;
  
  PImage usagi, minion;
  PImage carrot, banana;
  int ScoreVal = 0;
  int ScoreMinionVal = 0;
  boolean CarrotOn = true;
  boolean BananaOn = true;
  
  boolean usagiflip = false;
  boolean minionflip = false;
  int newxcor = 0;
  int newxminion = 0;
  
  
void setup()
{
  
  size(600,600);
  background(255,255,255);
  fill(0,0,255);
  
  usagi = loadImage("Bunny.png");
  minion = loadImage("Minion Flipped.png");
  
  carrot = loadImage("Carrot.png");
  banana = loadImage("banana.png");
  
  minion.resize(56,80);
  usagi.resize(80,80);
  
  textSize(32);
  
  
  
  
}

void draw()
{
  //background(255,204,0);
  /*xcor-=2;*/
  background(255,255,255);
  
  //display char
  if (usagiflip == true)
  {
      usagi = loadImage("Bunny flipped.png");
  }
  else
  {
      usagi = loadImage("Bunny.png");
  }
  usagi.resize(80,80);
 
 
  if (minionflip == true)
  {
      minion = loadImage("Minion.png");
  }
  else
  {
      minion = loadImage("Minion Flipped.png");
  }
 
 
  image(usagi, xcor+ newxcor,ycor);
  image(minion,xminion + newxminion,yminion);
  
  if (CarrotOn == true)
  {
    CarrotDraw();
  }
  if (BananaOn == true)
  {
    BananaDraw();
  }
//  fill(0, 102, 153, 204);
  getScore();
  getMinionScore();
  
  scoreOutput();
  handleKeyPresses();
  
}


void scoreOutput()
{
  String Score = str(ScoreVal);
  String MinionScore = str(ScoreMinionVal);
  textSize(32);
  text("Rabbit:"+ Score , 450,32);
  text("Minion:"+ MinionScore, 5,32);
  
  textSize(16);
  
  text(" <-- and -->", 450,64);
  text("  [A] and [D] ", 5, 64);
}


 void handleKeyPresses()
 {
   int bunnyX = xcor+newxcor;
   int minionX = xminion + newxminion;
  if (keyPressed == true) 
  {
    // ============================== Rabbit
      if (keyCode == LEFT) 
      {
          if (bunnyX >= 0)
            {
              //xcor-=7;
              newxcor -=7;
            }
          usagiflip = false;
      }
      else if (keyCode == RIGHT) 
      {
          if (bunnyX <=520)
              newxcor +=7;
          usagiflip = true;
      }
      else
          bunnyX = bunnyX;
       
       // =========================== minion
      if (key=='a') 
      {
          if (minionX >= 0)
              newxminion-=7;
          minionflip = false;
      }
      else if (key == 'd') 
      {
          if (minionX <=544)
              newxminion+=7;
          minionflip = true;
      }  
      else
          minionX = minionX;
  
  }//keypressed 
 }



// ==================================== Score Keeper ==================================== 
void getScore()
{
  if (((ycarrot+30) >= ycor) && ((xcarrot >= (xcor+newxcor)) && (xcarrot+26 <= (xcor+newxcor)+80)))
   {
     ScoreVal+=1;
     xcarrot = (int) random(0,550);
     
    ycarrot = -100;
   } 
  
}
void getMinionScore()
{
  if (((ybanana+30) >= yminion) && ((xbanana >= (xminion+newxminion)) && (xbanana+26 <= (xminion+newxminion)+80)))
   {
     ScoreMinionVal+=1;
     xbanana = (int) random(0,550);
     ybanana = -100;
   } 
  
}




//==================================== Fruit Drawing ==================================== 
// DRAWS THE CARROTS 
void CarrotDraw()
{
  if (ycarrot > 600)
  {
    xcarrot = (int) random(0,550);
    ycarrot = -100;
  }
  
  ycarrot = ycarrot +4;
  image(carrot,xcarrot, ycarrot);
}


//DRAWS THE BANANAS
void BananaDraw()
{
  if (ybanana > 600)
  {
    xbanana = (int) random(0,550);
    ybanana = -100;
  }
  
  ybanana = ybanana +4;
  image(banana,xbanana, ybanana);
}

