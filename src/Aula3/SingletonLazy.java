package Aula3;

public class SingletonLazy {
	private static SingletonLazy sc = null;
	private SingletonLazy() {}
	
	public static synchronized SingletonLazy getInstance() {
		if (sc == null) {
			sc = new SingletonLazy();
		}
		return sc;
		}
}
