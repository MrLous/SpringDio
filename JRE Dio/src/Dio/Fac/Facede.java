package Dio.Fac;

import Dio.Fac.Cep.Cep;
import Dio.Fac.Cliente.CrmService;

@SuppressWarnings("unused")
public class Facede {
	public void migrarCliente(String nome, String cep) {
		String cidade = Cep.getInstancia().recuperarCidade(cep);
		String estado = Cep.getInstancia().recuperarEstado(cep);
		
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
				
	}
	

}
