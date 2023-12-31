package com.jotasantos.TesteSuficiencia.servico;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface ICertidaoNascimento {
	
	@WebMethod
	public int calcularIdade(String idade);
	
	@WebMethod
	public String diaDaSemanaNascimento(String idade);
}
