package com.uniminuto.ws.rest.vo;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class clientr {
	String dirorigen;
	String dirdestino;
	String monto;
	
	public String client_register(String dir_origen, String dir_destino, String mont)
	{
		dirorigen=dir_origen;
		dirdestino=dir_destino;
		monto=mont;
			
		Client client=Client.create();
		WebResource webResource= client.resource("http://192.168.0.18:8080/RestU/rest/pc/pcm");
	    String input="{\n\""+"dirorigen"+"\":\""+dirorigen+"\",\n"
	   			     +"\""+"dirdestino"+"\":\""+dirdestino+"\",\n"
	   			     +"\""+"monto"+"\":\""+monto+"\"\n}";	    		
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, input);
		String output = response.getEntity(String.class);
		return output;
		
		
		
	}
	
	 

}
