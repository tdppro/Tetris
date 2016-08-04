package main;

import javax.swing.JPanel;

import control.GameControl;
import control.PlayerControl;
import dto.GameDto;
import service.GameService;
import ui.JFrameGame;
import ui.JPanelGame;

public class Main {
	public static void main(String[] args) {
		//������Ϸ����Դ
		GameDto dto = new GameDto();
		//������Ϸ���
		JPanelGame panel = new JPanelGame();
		//������Ϸ�߼���
		GameService service = new  GameService(dto);
		//������Ϸ������(������Ϸ�������Ϸ�߼���)
		GameControl game = new  GameControl(panel, service);
		//������ҿ�����
		PlayerControl control = new PlayerControl(game);
		//������Ϸ����
		JFrameGame frame = new JFrameGame(panel);
	}
}
