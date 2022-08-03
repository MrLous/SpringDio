package Dio.stg;

/**
 * 
 * @author Juh
 *
 */


public class Personagem {
	
	private Comportamento modo;

	public void setStratagy(Comportamento modo) {
		this.modo = modo;
	}
	
	public void mover() {
		modo.mover();
	}

}
