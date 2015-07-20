package dta.ihm;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import dta.ihm.util.ScannerUtil;
import dta.service.EmployeService;

public class CreerEmployeAction implements Action{
	
	public Integer getId() {
		return 3;
	}

	public String getMenu() {
		return "Créer un employé";
	}

	public void execute() {		
		String nomEmploye = ScannerUtil.getInstance().askUserString("Nom de l'employé : ");
		String prenomEmploye = ScannerUtil.getInstance().askUserString("Prénom de l'employé : ");
		String fonction = ScannerUtil.getInstance().askUserString("Fonction de l'employé : ");
		
		System.out.println("Résultat : ");
		
		try {
			
			Response resp = new EmployeService().createEmploye(nomEmploye, prenomEmploye, fonction);
			if(resp.getStatus() == 201) System.out.println("Création de l'employé réussie");
			else System.out.println("Erreur pendant la création de l'employé");
		} catch (WebApplicationException e) {
			System.out.println("Impossible de récupérer les employés");
		}
	}

}
