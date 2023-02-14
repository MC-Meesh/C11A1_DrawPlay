import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Sun {
	private static final int BODY_LENGTH = 50;
	private static final int BODY_HEIGHT = 50;
	public void draw(Graphics g, int sunX, int sunY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.yellow);
		g2.fillOval(sunX, sunY, BODY_LENGTH, BODY_HEIGHT);
		int x = sunX + BODY_LENGTH;
		int y = sunY + BODY_HEIGHT;
		g2.drawString("Yo its the sun!", sunX, sunY+BODY_HEIGHT+10);	
	}
}