package dta.ihm;

import java.util.List;

import javax.ws.rs.WebApplicationException;

import dta.ihm.util.ScannerUtil;
import dta.model.Employe;
import dta.service.EmployeService;


public class RechercherEmployeParIdAction implements Action {

	public Integer getId() {
		return 2;
	}

	public String getMenu() {
		return "Rechercher un employ� par id";
	}

	public void execute() {		
		int idEmploye = ScannerUtil.getInstance().askUserInt("Identifiant de l'employ� recherch� : ");
		
		System.out.println("R�sultat : ");
		
		try {
			
			Employe employe = new EmployeService().findEmployeById(idEmploye);
			System.out.println(employe);
		} catch (WebApplicationException e) {
			System.out.println("Impossible de r�cup�rer les employ�s");
		}
	}
	
}
