package control;

import service.GameService;
import ui.JPanelGame;

/**
 * @author tdp
 *������Ҽ��̿���
 *���ƻ���
 *������Ϸ�߼�
 */
public class GameControl {
	private JPanelGame panelGame;
	private GameService gameService;
	public GameControl(JPanelGame panelGame,GameService gameService) {
		this.panelGame = panelGame;
		this.gameService  = gameService;
	}
}
