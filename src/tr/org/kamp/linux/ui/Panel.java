package tr.org.kamp.linux.ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private WhiteLabel label;
	private WhiteLabel northLabel;
	private WhiteLabel southLabel;
	private WhiteLabel eastLabel;
	private WhiteLabel westLabel;

	public Panel() {
		setBackground(Color.DARK_GRAY);
		setLayout(new BorderLayout());
		label = new WhiteLabel("Merhaba");
		northLabel = new WhiteLabel("Konnichiwa");
		southLabel = new WhiteLabel("Privet");
		eastLabel = new WhiteLabel("Bonjour");
		westLabel = new WhiteLabel("Hallo");
		add(label, BorderLayout.CENTER);
		add(northLabel, BorderLayout.NORTH);
		add(southLabel, BorderLayout.SOUTH);
		add(eastLabel, BorderLayout.EAST);
		add(westLabel, BorderLayout.WEST);

		label.setForeground(Color.ORANGE);
		label.setForeground(Color.LIGHT_GRAY);

	}

}
