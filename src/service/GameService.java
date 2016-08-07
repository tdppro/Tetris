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
     * 方向键控制向上
     */
    public void keyUp() {
        //Todo 旋转
        this.dto.getGameAct().move(0, -1);
    }
    /**
     * 方向键控制向下
     */
    public void keyDown() {
        this.dto.getGameAct().move(0, 1);
    }
    /**
     * 方向键控制向左
     */
    public void keyLeft() {
        this.dto.getGameAct().move(-1, 0);
    }
    /**
     * 方向键控制向右
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
