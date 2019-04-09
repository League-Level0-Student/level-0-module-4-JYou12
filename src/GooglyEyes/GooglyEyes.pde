PImage eyes;
void setup() {   


  eyes = loadImage("Eyes.jpg");
  size(800, 600);
  eyes.resize(width, height);

  background(eyes);
}

void draw() {
  int x1 = mouseX - 200;
  int x2 = mouseX + 200;

background(eyes);

  if (mouseX <= 400){
   x1 += 1; 
  }
  fill(#FFFFFF);
  ellipse(200, 300, 400, 600);
  ellipse(600, 300, 400, 600);

  fill(#000000);
  ellipse(x1, mouseY, 100, 100);
  ellipse(x2, mouseY, 100, 100);

}