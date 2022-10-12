package com.springsoappractice.springsoappractice.Usuario;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.springsoappractice.springsoappractice.gs_prod.GetUsuariosRequest;
import com.springsoappractice.springsoappractice.gs_prod.GetUsuariosResponse;
//import com.springsoappractice.springsoappractice.gs_prod.ObjectFactory;
import com.springsoappractice.springsoappractice.gs_prod.SaveUsuariosRequest;
import com.springsoappractice.springsoappractice.gs_prod.Usuario;




/*For a soap enpoint, you dont use RestMapping
 * or requestmapping annotations, you use enpoint annotation
 */
@Endpoint
public class UsuarioController {
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;

    private static final String NAMESPACE="http://webspring.io/gs-prod";
	private static final Logger log=LoggerFactory.getLogger(UsuarioController.class);
	/*Namespace is not important, make sure to code your endpoints
	 * with the payloadroot and response payload
	 * annotations
	 * 
	 * The local part makes reference to the input
	 * method that you've defined in your schema
	 * already, and as a complement you can 
	 * set that payload as a parameter with the pojo 
	 * class in the endpoint
	 */
   	@PayloadRoot(namespace = NAMESPACE,localPart = "getUsuariosRequest")
    @ResponsePayload
	public GetUsuariosResponse getUsuarios(@RequestPayload GetUsuariosRequest req){
		GetUsuariosResponse response=new GetUsuariosResponse();
		response.setUsuariosLista(usuarioServiceImpl.obtenerTodosLosUsuarios());
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE,localPart = "saveUsuariosRequest")
	@ResponsePayload
	public GetUsuariosResponse saveUsuario(@RequestPayload SaveUsuariosRequest req){
		GetUsuariosResponse response=new GetUsuariosResponse();
		log.info(req.getName().getNombreCompleto()+" "+req.getName().getEdad()+" "+req.getName().getId());
		Usuario usuarioNuevo=new Usuario();

		usuarioNuevo.setNombreCompleto(req.getName().getNombreCompleto());
		usuarioNuevo.setEdad(req.getName().getEdad());

		response.getUsuariosLista().add(usuarioServiceImpl.guardarNuevoUsuario(usuarioNuevo));
		return response;
	}


}
