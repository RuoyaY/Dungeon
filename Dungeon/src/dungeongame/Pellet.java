package dungeongame;

public class Pellet extends Enemy
{
	public Pellet(Paint paint, int x, int y, int width, int length, int angle)
	{
		super(paint, x, y, width, length, angle);
		move = true;
	}
	
	public void move(){
		super.move();
		angle++;
	}
}
