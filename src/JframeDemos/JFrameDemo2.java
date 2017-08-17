package JframeDemos;

import javax.swing.JFrame;
public class JFrameDemo2 extends JFrame
{
		public JFrameDemo2()
		{
			super("Behold, our new Frame");
		}
	public static void main(String[] args) 
	{
		JFrameDemo2 frame = new JFrameDemo2();
		frame.setSize(300,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
