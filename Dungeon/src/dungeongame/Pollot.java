package dungeongame;

public class Pollot extends Enemy
{
	public Pollot(Paint paint, int x, int y, int width, int length, int angle)
	{
		super(paint, x, y, width, length, angle);
		move = true;
	}
	
	public void move(){
		super.move();
		angle--;
	}
}
