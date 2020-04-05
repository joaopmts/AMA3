package Aula3;

public class SingletonTeste {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		// TODO Auto-generated method stub
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing.equals(sing2));
		
		SingletonLazy sl = SingletonLazy.getInstance();
	}

}
