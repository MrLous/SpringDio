package Dio.gof;

/**
 * 
 * @author Juh
 *
 */

public class Singletonlazy {
	
	private static Singletonlazy instancia;
	
	private Singletonlazy() {
		super();
	}

	public static Singletonlazy getInstancia() {
		if (instancia == null) {
			instancia = new Singletonlazy();
		}
		return instancia;
	}
}
