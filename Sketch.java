import processing.core.PApplet;

public class Sketch extends PApplet {
	
  float circleX;
  float circleY;
  float circleDiameter;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    circleX = width;
    circleY = height;
    circleDiameter = 100;
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    background(255, 0, 166);

  if (dist(mouseX, mouseY, circleX, circleY) < circleDiameter/2) {
    //mouse is inside the circle

    if (mousePressed) {
      //mouse is inside the circle and clicked
      //color it bright red and move the circle
      fill(255, 25, 0);
      circleX = mouseX;
      circleY = mouseY;
    } else {
      //mouse is inside the circle but not clicked
      //highlight the circle light green but don't move it
      fill(128, 256, 128);
    }
    } else {
    //mouse is outside the circle, color it black
    fill(0);
  }

  ellipse(circleX, circleY, circleDiameter, circleDiameter);
}
  public void keyPressed() {

    if (keyPressed) {

        if (key == 'r') {
          background(255, 0, 0);
        } 
        else if (key == 'o') {
          background(255, 128, 0);
        } 
        else if (key == 'y') {
          background(246, 255, 0);
        } 
        else if (key == 'g') {
          background(0, 255, 0);
        } 
        else if (key == 'b') {
          background(0, 0, 255);
        }
        else if (key == 'p') {
          background(170, 0, 255);
        } 
      } 
      else {
        background(32);
    }
  }
}