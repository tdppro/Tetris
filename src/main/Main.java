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
		//创建游戏数据源
		GameDto dto = new GameDto();
		//创建游戏面板
		JPanelGame panel = new JPanelGame();
		//创建游戏逻辑块
		GameService service = new  GameService(dto);
		//创建游戏控制器(连接游戏面板与游戏逻辑块)
		GameControl game = new  GameControl(panel, service);
		//创建玩家控制器
		PlayerControl control = new PlayerControl(game);
		//创建游戏窗口
		JFrameGame frame = new JFrameGame(panel);
	}
}
