package com.springsoappractice.springsoappractice.Usuario;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.webspring.gs_prod.GetUsuariosRequest;
import io.webspring.gs_prod.GetUsuariosResponse;
import io.webspring.gs_prod.Usuario;

@Endpoint
public class UsuarioController {
    public static final String NAMESPACE="http://webspring.io/gs-prod";
    @PayloadRoot(namespace = NAMESPACE,localPart = "getUsuariosRequest")
    @ResponsePayload
	public GetUsuariosResponse getUsuarios(@RequestPayload GetUsuariosRequest req){
		GetUsuariosResponse res=new GetUsuariosResponse();
		Usuario c1=new Usuario();
		c1.setNombreCompleto("moisexio");
		res.getUsuariosLista().add(c1);
		return res;
	}

}
