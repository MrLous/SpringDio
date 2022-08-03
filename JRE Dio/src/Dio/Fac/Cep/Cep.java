package Dio.Fac.Cep;

public class Cep {

	
	private static Cep instancia = new Cep();
	
	private Cep() {
		super();
	}
	
	public static Cep getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "São Carlos";
	}
	public String recuperarEstado(String cep) {
		return "SP";
	}
}

