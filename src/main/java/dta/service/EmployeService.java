package dta.service;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import dta.RestServerInfoHelper;
import dta.model.Employe;

public class EmployeService {
	
	public List<Employe> findAllEmployes() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		Invocation.Builder builder = target.path("api").path("employes").request();	
		return builder.get(new GenericType<List<Employe>>(){});
	}

	public Employe findEmployeById(int idEmploye) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		Invocation.Builder builder = target.path("api").path("employes").path(String.valueOf(idEmploye)).request();	
		return builder.get(new GenericType<Employe>(){});
	}

	public Response createEmploye(String nomEmploye, String prenomEmploye, String fonctionEmploye) {
		MultivaluedMap<String, String> formData = new MultivaluedHashMap<String, String>();
	    formData.add("nom", nomEmploye);
	    formData.add("prenom", prenomEmploye);
	    formData.add("fonction", fonctionEmploye);
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		Invocation.Builder builder = target.path("api").path("employes").request();	
		return builder.post(Entity.form(formData));
	}

}
