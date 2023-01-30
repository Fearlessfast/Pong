import java.awt.Rectangle;
import java.util.Random;


public class Ball{
	
	
	public int x,y,width,height, xspeed, yspeed;
	
	
	
	int Low = 100;
	int High = 400;
	Random rand = new Random();
	int r = rand.nextInt(High-Low) + Low;
	
	public Ball(){
		this.x = 390;
		this.y = r;
		this.width = 15;
		this.height = 15;
        this.xspeed = 4; //xAngle
        this.yspeed = 3; // yAngle
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,width,height);
	}
	
	

	public int getXspeed() {
		return xspeed;
	}



	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}



	public int getYspeed() {
		return yspeed;
	}



	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
