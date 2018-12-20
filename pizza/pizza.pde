
 PImage pepperoni;


void setup(){
  size(1000, 1000);
  pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(50, 100);
  
  
    fill(#dba24a);
ellipse(500,500, 700, 700);
  
  
  fill(#e1d800);
ellipse(500,500, 500, 500);
























}


void draw(){
  
 

if(mousePressed){
image(pepperoni,mouseX, mouseY);

}
}