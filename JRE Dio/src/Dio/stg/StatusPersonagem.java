package Dio.stg;

/**
 * 
 * @author Juh
 *
 */


public class StatusPersonagem {

	public static void main(String[] args) {
		Comportamento Normal = new CompNormal();
		Comportamento Ataque = new CompAtk();
		Comportamento Defesa = new CompDef();
		
		
		Personagem juh = new Personagem();
		juh.setStratagy(Normal);
		juh.mover();
		juh.setStratagy(Defesa);
		juh.mover();
		juh.setStratagy(Ataque);
		juh.mover();
		juh.mover();
		juh.mover();
		juh.setStratagy(Defesa);
		juh.mover();

	}

}
