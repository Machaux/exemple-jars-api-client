package dta;


public class RestServerInfo {
	
	private String protocol;
	private String host;
	private String port;
	private String appServer;
	
	public RestServerInfo(String protocol, String host, String port, String appServer) {
		super();
		this.protocol = protocol;
		this.host = host;
		this.port = port;
		this.appServer = appServer;
	}
	
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
	
	public String getAppServer() {
		return appServer;
	}

	public void setAppServer(String appServer) {
		this.appServer = appServer;
	}

	public String getBaseUrl() {
		return new StringBuilder(protocol)
			.append("://")
			.append(host)
			.append(":")
			.append(port)
			.append("/")
			.append(appServer)
			.toString();
	}

	@Override
	public String toString() {
		return String.format("RestServerInfo [protocol=%s, host=%s, port=%s]",
				protocol, host, port);
	}
	
	
}
