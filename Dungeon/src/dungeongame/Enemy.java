package dungeongame;

public class Enemy extends Character
{
	private int i = 0;

	public Enemy(Paint paint, int x, int y, int width, int length, int angle)
	{
		super(paint, x, y, width, length, angle);
		move = true;
	}

	public void move()
	{
		i++;
		if (i == 50)
		{
			angle = (int) (Math.toDegrees(Math.atan2(getPlayerY() - y,getPlayerX() - x)));
			i = 0;
		}
		super.move();
	}
}
