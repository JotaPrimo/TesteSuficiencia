package com.jotasantos.TesteSuficiencia;



import com.jotasantos.TesteSuficiencia.servico.CertidaoNacimentoImpl;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {       
        CertidaoNacimentoImpl certidaoDeNascimento = new CertidaoNacimentoImpl();
    	Endpoint.publish("http://localhost:8085/servico/certidao", certidaoDeNascimento);
    	System.out.println("Serviço publicado com sucesso");
    }
}
