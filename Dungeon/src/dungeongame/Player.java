package dungeongame;

import java.awt.event.KeyEvent;

public class Player extends Character
{

	private boolean keyPressedW;
	private boolean keyPressedS;
	private boolean keyPressedA;
	private boolean keyPressedD;

	public Player(Paint paint, int x, int y, int width, int length, int angle)
	{
		super(paint, x, y, width, length, angle);
	}

	public void move()
	{
		if (keyPressedW)
		{
			angle = 270;
		}
		if (keyPressedS)
		{
			angle = 90;
		}
		if (keyPressedA)
		{
			angle = 180;
		}
		if (keyPressedD)
		{
			angle = 0;
		} if (keyPressedW && keyPressedA)
		{
			angle = 225;
		} if (keyPressedW && keyPressedD)
		{
			angle = 315;
		} if (keyPressedS && keyPressedD)
		{
			angle = 45;
		} if (keyPressedS && keyPressedA)
		{
			angle = 135;
		}


		super.move();

	}

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyChar() == 'w')
		{
			keyPressedW = true;
			move = true;
		}
		if (e.getKeyChar() == 's')
		{
			keyPressedS = true;
			move = true;
		}
		if (e.getKeyChar() == 'a')
		{
			keyPressedA = true;
			move = true;
		}
		if (e.getKeyChar() == 'd')
		{
			keyPressedD = true;
			move = true;
		}
		
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyChar() == 'w')
		{
			keyPressedW = false;

		}
		if (e.getKeyChar() == 's')
		{
			keyPressedS = false;

		}
		if (e.getKeyChar() == 'a')
		{
			keyPressedA = false;

		}
		if (e.getKeyChar() == 'd')
		{
			keyPressedD = false;

		}
		if (!(keyPressedW && keyPressedS && keyPressedA && keyPressedD)){
			move = false;
		}

	}

}
