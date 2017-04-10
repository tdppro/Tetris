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
        // Todo 旋转
    	this.dto.getGameAct().round();
    }

    /**
     * 方向键控制向下
     */
    public void keyDown() {
            if(this.dto.getGameAct().move(0, 1)){
            	return ;
            }

        	//获得游戏地图对象
        	boolean[][] map = this.dto.getGameMap();
        	//获得方块对象
        	Point[] act = this.dto.getGameAct().getActPoints();
        	//将方块堆积到地图数组
        	for (int i = 0; i < act.length; i++) {
				map[act[i].x][act[i].y] = true;
			}
        	//TODO判读是否可以消行
        	//TODO 消行操作
        	//			   算分操作
        	//             判断是否升级
        	//						升级
        	//				刷新新的方块
        	this.dto.getGameAct().init(0);
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
     * @return 判断是否可以移动
     * 
     */
}
