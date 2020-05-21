package tr.org.kamp.linux.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	public PaintPanel() {
		startMovement();

	}

	Box b = new Box();

	@Override
	protected void paintComponent(Graphics arg0) {
		super.paintComponent(arg0);
		Graphics2D g2d = (Graphics2D) arg0;
		g2d.fillRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
		// g2d.drawString("Writing", 400, 200);
	}

	private void startMovement() {
		new Thread(new Runnable() {
			// Threads are work particles
			public void run() {
				while (b.getX()-b.getWidth()<1000 && b.getY()- b.getHeight()<700) {
					b.setX(b.getX() + 5);
					b.setY(b.getY() + 3);
					repaint();
					try {
						Thread.sleep(65);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
