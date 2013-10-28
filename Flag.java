import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag;

	public void init() {
		flag = new AmericanFlag(50, 50, 3.0);
	}

	public void paint(Graphics g) {
		flag.draw(g);
	}

}