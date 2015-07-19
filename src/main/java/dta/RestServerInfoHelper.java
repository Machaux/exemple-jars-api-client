package dta;

import java.util.ResourceBundle;

public class RestServerInfoHelper {

	public RestServerInfo getRestServerInfo() {
		ResourceBundle serverProps = ResourceBundle.getBundle("server");
		return new RestServerInfo(serverProps.getString("protocol"),
				serverProps.getString("host"),
				serverProps.getString("port"),
				serverProps.getString("appserver"));
		
	}
	
}
