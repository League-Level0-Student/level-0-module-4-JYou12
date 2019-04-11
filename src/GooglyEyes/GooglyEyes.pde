PImage eyes;
void setup() {   


  eyes = loadImage("Eyes.jpg");
  size(800, 600);
  eyes.resize(width, height);

  background(eyes);
}

void draw() {
 background(eyes);
  int x1 = 200;
 int x2 = 200;
 
 if (mouseX <= 250){
 
mouseX = 250;
   
 }
  if (mouseX >= 550){
 
mouseX = 550;
   
 }
  if (mouseY <= 200){
 
mouseY = 200;
   
 }
   if (mouseY >= 400){
 
mouseY = 400;
   
 }
  fill(#FFFFFF);
  ellipse(200, 300, 400, 600);
  ellipse(600, 300, 400, 600);

  fill(#000000);
  ellipse(mouseX - x1, mouseY, 100, 100);
  ellipse(mouseX + x2, mouseY, 100, 100);



}
