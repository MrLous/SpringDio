package Dio.gof;

/**
 * 
 * @author Juh
 *
 */

public class Singletoneager {
	
	private static Singletoneager instancia = new Singletoneager();
	
	private Singletoneager() {
		super();
	}
	
	public static Singletoneager getInstancia() {
		return instancia;
	}
}
