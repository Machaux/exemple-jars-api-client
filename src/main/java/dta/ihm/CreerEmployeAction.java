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
		return "Cr�er un employ�";
	}

	public void execute() {		
		String nomEmploye = ScannerUtil.getInstance().askUserString("Nom de l'employ� : ");
		String prenomEmploye = ScannerUtil.getInstance().askUserString("Pr�nom de l'employ� : ");
		String fonction = ScannerUtil.getInstance().askUserString("Fonction de l'employ� : ");
		
		System.out.println("R�sultat : ");
		
		try {
			
			Response resp = new EmployeService().createEmploye(nomEmploye, prenomEmploye, fonction);
			if(resp.getStatus() == 201) System.out.println("Cr�ation de l'employ� r�ussie");
			else System.out.println("Erreur pendant la cr�ation de l'employ�");
		} catch (WebApplicationException e) {
			System.out.println("Impossible de r�cup�rer les employ�s");
		}
	}

}
