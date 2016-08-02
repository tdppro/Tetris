package config;

/**
 * @author tdp
 *工厂方法 使得整个程序中只有一个GameConfig对象
 */
public class ConfigFactory {

	private static GameConfig GAME_CONFIG = null;

	public ConfigFactory() {	}

	static {
		try {
			GAME_CONFIG = new GameConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static GameConfig getGameConfig() {
		return GAME_CONFIG;
	}
}
