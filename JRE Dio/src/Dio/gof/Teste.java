package Dio.gof;

/**
 * 
 * @author Juh
 *
 */

public class Teste {

	public static void main(String[] args) {
		
		// testes Patter Singleton:
		Singletonlazy lazy = Singletonlazy.getInstancia();
		System.out.println(lazy);
		lazy = Singletonlazy.getInstancia();
		System.out.println(lazy);
		
		Singletoneager eager= Singletoneager.getInstancia();
		System.out.println(eager);
		eager = Singletoneager.getInstancia();
		System.out.println(eager);
		
		SingletonlazyHolder Holder = SingletonlazyHolder.getInstancia();
		System.out.println(Holder);
		Holder = SingletonlazyHolder.getInstancia();
		System.out.println(Holder);
		
		
		

	}

}
