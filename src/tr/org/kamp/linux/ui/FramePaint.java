package tr.org.kamp.linux.ui;

import java.awt.Color;

import javax.swing.JFrame;

public class FramePaint {
	public static void main(String[] args) {

		PaintPanel panel = new PaintPanel();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 300);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.DARK_GRAY);
		panel.repaint();
	}

}
