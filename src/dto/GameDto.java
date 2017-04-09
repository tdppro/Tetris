package dto;

import java.util.List;

import entity.GameAct;

public class GameDto {
	/**
	 * ���ݿ��¼
	 */
	private List<Player> dbRecode;
	/**
	 * ���ؼ�¼
	 */
	private List <Player> diskRecode;
	
	/**
	 *��Ϸ��ͼ 
	 */
	private boolean[][] gameMap;
	
	/**
	 * ���䷽��
	 */
	private GameAct gameAct;
	
	/**
	 * ��ǰ����
	 */
	private int nowLevel;
	
	/**
	 * ��һ����������
	 */
	private int next;
	
	/**
	 * ��ǰ����
	 */
	private int nowPoint;
	
	/**
	 * ��ǰ����
	 */
	private int nowRemoveLine;
	public GameDto() {
		// TODO Auto-generated constructor stub
		dtoInit();
	}
	
	public void dtoInit(){
		//TODO
		this.gameMap = new boolean[10][18];
		//TODO
	}

	public List<Player> getDbRecode() {
		return dbRecode;
	}

	public void setDbRecode(List<Player> dbRecode) {
		this.dbRecode = dbRecode;
	}

	public List<Player> getDiskRecode() {
		return diskRecode;
	}

	public void setDiskRecode(List<Player> diskRecode) {
		this.diskRecode = diskRecode;
	}

	public boolean[][] getGameMap() {
		return gameMap;
	}

	public void setGameMap(boolean[][] gameMap) {
		this.gameMap = gameMap;
	}

	public GameAct getGameAct() {
		return gameAct;
	}

	public void setGameAct(GameAct gameAct) {
		this.gameAct = gameAct;
	}

	public int getLevel() {
		return nowLevel;
	}

	public void setLevel(int level) {
		this.nowLevel = level;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getNowPoint() {
		return nowPoint;
	}

	public void setNowPoint(int nowPoint) {
		this.nowPoint = nowPoint;
	}

	public int getNowRemoveLine() {
		return nowRemoveLine;
	}

	public void setNowRemoveLine(int nowRemoveLine) {
		this.nowRemoveLine = nowRemoveLine;
	}
}

