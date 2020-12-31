package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class UberHooks {
@Before (order = 1)
	public static void setup_browser() {
		System.out.println("Start Chrome browser");
	}

@Before (order = 2)
	public static void setup_url() {
		System.out.println("lauch url");
}
	
@After (order =2)
	public static void teardown_logout() {
		System.out.println("Logout the application");
}
	
@After (order=1)
 	public static void teardown_quit() {
		System.out.println("Quit Browser");
}
}
