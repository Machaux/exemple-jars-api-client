package dta.ihm;

import java.util.List;

import javax.ws.rs.WebApplicationException;

import dta.model.Employe;
import dta.service.EmployeService;

public class ListerEmployesAction implements Action {
	

	public Integer getId() {
		return 1;
	}

	public String getMenu() {
		return "Lister les employés";
	}

	public void execute() {
		System.out.println("Liste des employés");
		
		try {
			
			List<Employe> employes = new EmployeService().findAllEmployes();
			
			employes.stream().forEach(employe -> {
				System.out.println(employe);
			});
		} catch (WebApplicationException e) {
			System.out.println("Impossible de récupérer les employes");
		}
		
		

	}
	
}
