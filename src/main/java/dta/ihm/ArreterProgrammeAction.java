package dta.ihm;

import dta.ihm.util.ScannerUtil;

public class ArreterProgrammeAction implements Action {

	public Integer getId() {
		return 0;
	}

	public String getMenu() {
		return "Arrêter le programme";
	}

	public void execute() {
		System.out.println("Aurevoir !");
		ScannerUtil.getInstance().close();
		System.exit(0);
	}
	
}
