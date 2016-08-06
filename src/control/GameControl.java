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
	/**
	 * ��Ϸ�����
	 */
	private JPanelGame panelGame;
	/**
	 * ��Ϸ�߼���
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
