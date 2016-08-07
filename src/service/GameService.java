package service;

import java.awt.Point;

import dto.GameDto;
import entity.GameAct;

public class GameService {
	private GameDto dto;
	public GameService(GameDto dto) {
		this.dto = dto;
		GameAct act = new GameAct();
		dto.setGameAct(act);
	}
	
    /**
     * �������������
     */
    public void keyUp() {
        //Todo ��ת
        this.dto.getGameAct().move(0, -1);
    }
    /**
     * �������������
     */
    public void keyDown() {
        this.dto.getGameAct().move(0, 1);
    }
    /**
     * �������������
     */
    public void keyLeft() {
        this.dto.getGameAct().move(-1, 0);
    }
    /**
     * �������������
     */
    public void keyRight() {
        this.dto.getGameAct().move(1, 0);
    }
    
    /**
     * @param moveX
     * @param moveY
     * @return
     */
    private boolean canMove(int moveX, int moveY){
        Point[] nowPoints = this.dto.getGameAct().getActPoints();
        for (int i = 0; i < nowPoints.length; i++) {
          int newX = nowPoints[i].x+moveX;
          int newY = nowPoints[i].y +moveY;
            
        }
        return true;
    }
}
