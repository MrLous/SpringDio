package Dio.gof;

/**
 * 
 * @author Juh
 *
 */

public class SingletonlazyHolder {
	
	private static class InstanciaHolder{
		public static SingletonlazyHolder instancia = new SingletonlazyHolder();
	}
	
	private SingletonlazyHolder() {
		super();
	}
	
	public static SingletonlazyHolder getInstancia() {
		return InstanciaHolder.instancia;
	}
}
