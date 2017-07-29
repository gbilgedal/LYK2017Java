package tr.org.kamp.linux.ui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WhiteLabel extends JLabel {
	public WhiteLabel(String t) {
		super(t, null, SwingConstants.CENTER);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createDashedBorder(Color.ORANGE));
		//////// (:////////setHorizontalTextPosition(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);

	}

}
