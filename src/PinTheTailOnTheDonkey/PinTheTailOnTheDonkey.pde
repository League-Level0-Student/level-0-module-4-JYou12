PImage donkey;
PImage tail;
/*import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
*/
void setup() {
/*
  Minim minim = new Minim(this);     //In the setup method
  woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
*/
  size(750, 750);
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  tail.resize(100, 100);
  donkey.resize(width, height);
}

void draw() {
  background(donkey);
  image(tail, mouseX, mouseY);

  rect(0, 0, 40, 40);
  rect(630, 170, 40, 40);

  if (dist(0, 0, mouseX, mouseY) >= 30) {

    background(#036554);
  } else {

    background(donkey);
  }

  if (dist(630, 170, mouseX, mouseY) <= 30) {
   /* if (playSound) {
      woohooSound.trigger();
      playSound = false;
    }*/
      println("You WON!");
    
  }
}
