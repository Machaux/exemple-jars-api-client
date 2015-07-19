package dta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RestServerInfoHelperTest {
	
	private RestServerInfoHelper helper;
	
	@Before
	public void setUp(){
		helper = new RestServerInfoHelper();
	}
	
	@Test
	public void testProtocol() {
		String protocol = helper.getRestServerInfo().getProtocol();
		assertEquals("http", protocol);
	}
	
	@Test
	public void testHost() {
		String host = helper.getRestServerInfo().getHost();
		assertEquals("localhost", host);
	}
	
	@Test
	public void testPort() {
		String port = helper.getRestServerInfo().getPort();
		assertEquals("8080", port);
	}

}
