package dungeongame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Character
{
	protected boolean move = false;
	private int speed = 5;
	protected int angle;
	protected int x;
	protected int y;
	private int width;
	private int length;
	protected Paint paint;

	public Character(Paint paint, int x, int y, int width, int length, int angle)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		this.angle = angle;
		this.paint = paint;
	}
	public int getPlayerX(){
		return paint.getPlayerX();
	}
	public int getPlayerY(){
		return paint.getPlayerY();
	}
	public void move()
	{
		if (move)
		{
			x += speed * Math.cos(Math.toRadians(angle));
			y += speed * Math.sin(Math.toRadians(angle));
		}

	}

	public void paintCharacter(Graphics g)
	{
		g.fillOval(x, y, width, length);
		move();
	}

}
