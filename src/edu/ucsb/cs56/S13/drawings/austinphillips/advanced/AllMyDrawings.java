package edu.ucsb.cs56.S13.drawings.austinphillips.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Austin
 * @version for CS56, S13
 */


public class AllMyDrawings
{
    /** Draw a picture with a few puppies 
     */

    public static void drawPicture1(Graphics2D g2) {
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	Dog d1 = new Dog(200,300,100,125);
	g2.setStroke(thick);
	g2.setColor(Color.RED); 
	g2.draw(d1);

	Dog dog3=new Dog(450,100,20,55);
	g2.setColor(Color.GREEN);
	g2.draw(dog3);

	
	Stroke orig=g2.getStroke();
	//g2.setStroke(thick);
	//g2.setColor(Color.GREEN); 
	//g2.draw(d2); 
	
	// Draw two bodies with tails
	
	Dog dog1 = new Dog(50,100,20,55);
	Dog dog2 = new Dog(250,100,20,55);
	
	g2.draw(dog1);
	g2.setColor(Color.RED); g2.draw(dog2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Christmas puppies, by Austin Phillips", 20,20);
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {

	//How many puppies am i supposed to draw?...
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("Dogs... in space... by Austin Phillips", 20,20);

	
      	Dog d1 = new Dog(400,250,50,75);
	g2.setColor(Color.CYAN);
	g2.rotate(180,400,250);
	g2.draw(d1);
	
	Shape d2 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	g2.rotate(90,300,250);
	g2.setColor(Color.BLACK);
	g2.draw(d2);

	Shape d3 = ShapeTransforms.scaledCopyOfLL(d1,0.5,0.5);
	g2.rotate(90,325,250);
	g2.setColor(Color.MAGENTA);
	g2.draw(d3);

    }
   
    /** Draw a different picture with more freaking dogs
     */

    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Mother and her puppies, by Austin Phillips", 300,425);

       
	
       Dog mama = new Dog(80,250,100,100);
       Dog pup1 = new Dog(310,310,40,30);
       Dog pup2 = new Dog(420,310,40,30);
       Dog pup3 = new Dog(530,310,40,30);
       Dog pup4 = new Dog(750,310,40,30);
       
       g2.setColor(Color.RED);     g2.draw(mama);
       g2.setColor(Color.GREEN);   g2.draw(pup1);
       g2.setColor(Color.BLUE);    g2.draw(pup2);
       g2.setColor(Color.MAGENTA); g2.draw(pup3);
       
    }
    

}
