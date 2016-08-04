package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerControl extends KeyAdapter{
	private GameControl gameControl;
	public PlayerControl(GameControl gameControl) {
		this.gameControl = gameControl;
	}
	/* (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 * 键盘按下时间
	 */
	@Override
	public void keyPressed(KeyEvent e) {
	System.out.println(e.getKeyCode());		
	}

}
