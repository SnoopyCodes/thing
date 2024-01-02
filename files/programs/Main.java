import javax.swing.*;
import java.awt.*;
//call everything
//this is the runner file
//

public class Main {
	public static void main(String[] args) {
		JFrame FakeFrame = new JFrame("Game");  //the top bar is counted in the pixel size, so we do not use JFrame size

		JPanel RealFrame = new JPanel();
		RealFrame.setPreferredSize(new Dimension(1280, 720));  //standard 720p

		FakeFrame.add(RealFrame);
		FakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//FakeFrame.setLocationRelativeTo(null);
		FakeFrame.setResizable(false);
		FakeFrame.pack();
		FakeFrame.setVisible(true);
	}
}
