package JframeDemos;

import javax.swing.JFrame;

public class CreatingAWindow 
{
	public static void main(String[] args) 
	{
		JFrame frame= new JFrame("Window");
		int windowWidth = 400;
		int windowHeight= 500;
		frame.setBounds(100, 100, windowWidth, windowHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
