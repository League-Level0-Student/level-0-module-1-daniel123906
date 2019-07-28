
void setup() {
    size(600,600);
}
void draw() {
  fill(255,255,0);
  ellipse(250,250,250,250);
  PImage pepperoni = loadImage("pep.jpeg");
  pepperoni.resize(50,50);
  image(pepperoni,250,250);
  PImage mushroom = loadImage("mush.jpeg");
  mushroom.resize(50,50);
  image(mushroom,250,150);
    
}
