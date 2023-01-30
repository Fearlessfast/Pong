import javax.swing.JFrame;


public class Source {

	public static void main(String[] args) {
		
		//GameLoop game = new GameLoop();
		GameLoop2 game = new GameLoop2();
		JFrame frame = new JFrame();
		frame.setSize(1000, 520);
		frame.setVisible(true);
		frame.setTitle("Super Duper DxBall");
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		
		frame.add(game);
		frame.addKeyListener(game);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread th = new Thread(game);
		th.start();
	}

}
