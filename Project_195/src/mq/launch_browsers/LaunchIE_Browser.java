package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		System.out.println(ie.getTitle());
		
		ie.close();
	}

}
