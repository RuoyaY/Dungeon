package dungeongame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Paint extends Canvas implements KeyListener
{
	Player player;// Enemy thing = new Enemy(60, 40, 20, 10);
	ArrayList<Character> asd = new ArrayList<Character>();

	public Paint()
	{
		player = new Player(this, 0, 0, 40, 40, 0);
		asd.add(player);
		for (int i = 0; i < 6; i++)
		{
			asd.add(new Pellet(this, 600, 400, 20, 10, i * 60));
			asd.add(new Pollot(this, 400, 600, 10, 20, i * 60));
		}
	}

	public void paint(Graphics g)
	{
		for (int i = asd.size() - 1; i > -1; i--)
		{
			asd.get(i).paintCharacter(g);
		}

	}

	public int getPlayerX()
	{
		return player.x;
	}

	public int getPlayerY()
	{
		return player.y;
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		((Player) asd.get(0)).keyPressed(e);

	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		((Player) asd.get(0)).keyReleased(e);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}
}
