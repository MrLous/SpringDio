package Dio.Fac.Cliente;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado ) {
		System.out.println("Clinte Salvo no Sistema");
		System.out.println(String.format("Cliente: %s",nome));
		System.out.println(String.format("CEP: %s",cep));
		System.out.println(String.format("Cidade: %s",cidade));
		System.out.println(String.format("Estado: %s",estado));
	}

}
