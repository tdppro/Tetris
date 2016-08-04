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
	private JPanelGame panelGame;
	private GameService gameService;
	public GameControl(JPanelGame panelGame,GameService gameService) {
		this.panelGame = panelGame;
		this.gameService  = gameService;
	}
}
