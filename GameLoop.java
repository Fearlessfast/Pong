/*import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;


public class GameLoop extends JPanel implements KeyListener, Runnable{
	
	
	Bar b1;
	Bar2 b2;
	//BarAi bAi;
	Ball ball;
	Random rand;
	
	char c1[] = { 'L', 'E', 'F', 'T'};

	char c2[] = { 'R', 'I', 'G', 'H', 'T' };
	
	
	int randY;
	int count1 = 0;
	int count2 = 0;
	
	
	boolean turn = false;
	boolean upKey = false;
	boolean downKey = false;
	////////////////////ben kurdum
	boolean upKey2 = false;
	boolean downKey2 = false;
	////////////7//////ben kurdum
	
	
	public GameLoop(){
		b1 = new Bar(5, 225);
		b2 = new Bar2(775 , 225);
		//bAi = new BarAi(775, 225);
		ball = new Ball();
		System.out.println(ball.y);
		addKeyListener(this);
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillRect(b1.x, b1.y, b1.width, b1.height);
		g.fillRect(b2.x, b2.y, b2.width, b2.height);
		//g.fillRect(bAi.x, bAi.y, bAi.width, bAi.height);
		g.setColor(Color.BLUE);
		g.fillOval(ball.x, ball.y, ball.width, ball.height);
		g.drawRect(5, 5, 780, 470);
		g.setColor(Color.BLACK);
		g.drawChars(c1, 0, c1.length, 820, 30);
		g.drawChars(c2, 0, c2.length, 920, 30);
	}
	
	public void control(){
		if(upKey == true && (b1.y >= 5)){
			b1.y -= 4;
		}
		if(downKey == true && (b1.y <= 420) ){
			b1.y += 4;
		}
		
	}
	
	// Benim kurduðum ikinci kullanýcý silinilebilir.Ben kurdum.
	
	public void control2(){
		if(upKey2 == true && (b2.y >= 5)){
			b2.y -= 4;
		}
		if(downKey2 == true && (b2.y <= 420) ){
			b2.y += 4;
		}
			
	}
	//////////////////////////////////////////////////
	
	
	public void speed(){
		if(count1 == 2){
			ball.xspeed = 5;

			//ball.yspeed = 4;
		}
		if(count1 == 8){
			ball.xspeed = 6;
		}
		if(count1 == 10){
			ball.xspeed = 7;
		}
		if(count1 == 14){
			ball.xspeed = 8;
		}
		if(count1 == 16){
			ball.xspeed = 9;
		}
	
	}
	
	
	public void moveBall(){
		
		
		
	 	ball.x = ball.x + ball.xspeed;
	 	ball.y = ball.y + ball.yspeed;
	 	
	 	Rectangle r1 = b1.getBounds();
		Rectangle r4 = b2.getBounds();
	 	//Rectangle r2 = bAi.getBounds();
		Rectangle r3 = ball.getBounds();
		
		
		if(ball.x >= 10 && ball.x <= 765){
			//if(r3.intersects(r1) || r3.intersects(r2))
			  if(r3.intersects(r1) || r3.intersects(r4))                                          {
				ball.setXspeed(-1*ball.getXspeed());
				
				count1++;
				System.out.println("collision" + count1);
			}
		}
 
        if ((ball.y < 6) || (ball.y > 460)) {
            ball.yspeed = -ball.yspeed;
            
            count2++;
			System.out.println("wallCollision" + count2);

        }

	}
	
	

	@Override
	public void run() {
		while(true){
			control();
			control2();
			speed();
			moveBall();
			//aiMovement();
			
			repaint();
		
			try {
				Thread.sleep(15);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			 }
			
		}
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if( (e.getKeyCode() == KeyEvent.VK_W)){
			upKey = true;
		}
		if( (e.getKeyCode() == KeyEvent.VK_S)){
			downKey = true;
		}
		if( (e.getKeyCode() == KeyEvent.VK_UP)){
			upKey2 = true;
		}
		if( (e.getKeyCode() == KeyEvent.VK_DOWN)){
			downKey2 = true;
		}

	}
	public void keyReleased(KeyEvent e) {
		if( (e.getKeyCode() == KeyEvent.VK_W)){
			upKey = false;
		}
		if( (e.getKeyCode() == KeyEvent.VK_S)){
			downKey = false;
		}
		
		if( (e.getKeyCode() == KeyEvent.VK_UP)){
			upKey2 = false;
		}
		if( (e.getKeyCode() == KeyEvent.VK_DOWN)){
			downKey2 = false;
		}
		
	
	}



	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}*/
