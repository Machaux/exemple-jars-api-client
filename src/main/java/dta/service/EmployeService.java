package dta.service;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import dta.RestServerInfoHelper;
import dta.model.Employe;

public class EmployeService {
	
	public List<Employe> findAllEmployes() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(new RestServerInfoHelper().getRestServerInfo().getBaseUrl());
		Invocation.Builder builder = target.path("api").path("employes").request();	
		return builder.get(new GenericType<List<Employe>>(){});
	}

}
