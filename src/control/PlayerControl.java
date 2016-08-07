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
	 * 键盘按下事件
	 */
	@Override
	public void keyPressed(KeyEvent e) {
	    //TODO 
	    switch (e.getKeyCode()) {
        case KeyEvent.VK_W:
            this.gameControl.keyUp();
            break;
        case KeyEvent.VK_S:
            this.gameControl.keyDown();
            break;
        case KeyEvent.VK_A:
            this.gameControl.keyLeft();
            break;
        case KeyEvent.VK_D:
            this.gameControl.keyRight();
            break;
        default:
            break;
        }
	}
	
}
