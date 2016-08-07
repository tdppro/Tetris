package control;

import service.GameService;
import ui.JPanelGame;

/**
 * @author tdp
 *接受玩家键盘控制
 *控制画面
 *控制游戏逻辑
 */
public class GameControl {
	/**
	 * 游戏界面层
	 */
	private JPanelGame panelGame;
	/**
	 * 游戏逻辑层
	 */
	private GameService gameService;
	public GameControl(JPanelGame panelGame,GameService gameService) {
		this.panelGame = panelGame;
		this.gameService  = gameService;
	}
    /**
     * 方向键控制向上
     */
    public void keyUp() {
        this.gameService.keyUp();
        this.panelGame.repaint();
    }
    /**
     * 方向键控制向下
     */
    public void keyDown() {
        this.gameService.keyDown();
        this.panelGame.repaint();
    }
    /**
     * 方向键控制向左
     */
    public void keyLeft() {
        this.gameService.keyLeft();
        this.panelGame.repaint();
}
    /**
     * 方向键控制向右
     */
    public void keyRight() {
        this.gameService.keyRight();
        this.panelGame.repaint();
}
}
