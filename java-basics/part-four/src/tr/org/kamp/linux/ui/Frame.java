package tr.org.kamp.linux.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Panel panel = new Panel();


		frame.setContentPane(panel);
		frame.setTitle("Java <3");
		frame.setLocation(500, 150);
		frame.setSize(300, 500);
		frame.setVisible(true);
		JButton button1 = new JButton();
		button1.setSize(55, 55);
		button1.setText("Hallo");
		button1.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setResizable(false);
		panel.repaint();

	}

}
