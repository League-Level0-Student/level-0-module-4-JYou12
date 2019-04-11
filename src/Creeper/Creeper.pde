PImage minecraft;
PImage creeper;
void setup(){
 
  size(100,100);
  minecraft = loadImage("Grass.png");     //in setup method
minecraft.resize(width, height);          //in setup method
background(minecraft);          //in setup method
creeper = loadImage("creeper.png");
  creeper.resize(10, 10);

}

void draw(){
 
  int x = 50;
  int y = 50;
  background(minecraft);
  image (creeper, x, y);
  
  
  if (mouseX >= x - 10 && mouseX <= x + 10 && mouseY <= x + 10 && mouseY >= y - 10){
   fill(#12DE38);
  }else{
  fill(#DE1212);
  }
    ellipse(mouseX, mouseY, 10, 10);

}
