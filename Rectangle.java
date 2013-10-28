import java.awt.*;
import java.applet.*;

public class Rectangle {

	private Point topLeft;
	private int width, height;
	private Color color;

	public Rectangle(int x, int y, int width, int height, Color color) {
		this.topLeft = new Point(x, y);
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g) {
		//Color originalColor = g.getColor();
		g.setColor(color);
		g.fillRect(topLeft.getX(), topLeft.getY(), width, height);
	}
}

