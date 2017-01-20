import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram{

	//Defining the head width as a constant in pixels
	private static final double HEAD_WIDTH = 100;
	//Defining the head height as a constant in pixels
	private static final double HEAD_HEIGHT = 100;
	//Defining the eye radius as a constant in pixels
	private static final double EYE_RADIUS = 20;
	//Defining the mouth width as a constant in pixels
	private static final double MOUTH_WIDTH = 40;
	//Defining the mouth height as a constant in pixels
	private static final double MOUTH_HEIGHT = 20;
	
	public void run(){
		//Adding the face at the center of the graphics page.
		addFace(getWidth()/2, getHeight()/2);
	}
	
	//Adding the face centered at (cx, cy) with all of its various components.
	private void addFace(double cx, double cy){
		addHead(cx, cy);
		addMouth(cx, cy);
		addEye(cx - HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
		addEye(cx + HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
	}
	
	//Adding a head at the center of (cx, cy)
	private void addHead(double cx, double cy){
		GRect rect1 = new GRect(cx - HEAD_WIDTH/2, cy - HEAD_HEIGHT/2, HEAD_WIDTH, HEAD_HEIGHT);
			rect1.setFilled(true);
			rect1.setColor(Color.black);
			rect1.setFillColor(Color.gray);
			add(rect1);
	}
	
	//Adding a mouth at the center of (cx, cy)
	private void addMouth(double cx, double cy){
		GRect rect2 = new GRect(cx - MOUTH_WIDTH/2, cy + HEAD_HEIGHT/4 - MOUTH_HEIGHT/2, MOUTH_WIDTH, MOUTH_HEIGHT);
			rect2.setFilled(true);
			rect2.setColor(Color.white);
			add(rect2);
	}

	//Adding an eye at the center of (cx, cy)
	private void addEye(double cx, double cy){
		GOval oval1 = new GOval(cx - EYE_RADIUS, cy - EYE_RADIUS, 2*EYE_RADIUS, 2*EYE_RADIUS);
			oval1.setFilled(true);
			oval1.setColor(Color.yellow);
			add(oval1);
	}
			
}
