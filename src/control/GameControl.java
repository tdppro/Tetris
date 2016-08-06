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
    public void test() {
        // TODO Auto-generated method stub
        this.gameService.gameTest();
        this.panelGame.repaint();
    }
}
