import java.awt.*;
import java.applet.*;

public class AmericanFlag {

	private Rectangle union;
	private Rectangle[] stripes;
	private Point topLeft;
	private int width = 190, height = 100;
	private double scale;

	public AmericanFlag(int x, int y, double scale) {
		this.topLeft = new Point(x, y);
		this.scale = scale;
		this.width *= scale;
		this.height *= scale;

		int stripeHeight = (int) (this.height / 13.0);
		int unionHeight = 7*stripeHeight;
		int unionWidth = (int) (this.width * 2.0 / 5.0);

		union = new Rectangle(x, y, unionWidth, unionHeight, Color.blue);

		stripes = new Rectangle[13];
		for (int i=0; i<stripes.length; i++) {
			Color color = Color.red;
			if (i % 2 == 1) {
				color = Color.white;
			}
			stripes[i] = new Rectangle(x, y+i*stripeHeight, width, stripeHeight, color);
			
		}

	}

	public void draw(Graphics g) {
		// for (Rectangle stripe : stripes) {
		// 	stripe.draw(g);
		// }
		for (int i=0; i<13; i++) {
			stripes[i].draw(g);
		}
		union.draw(g);
	}

}