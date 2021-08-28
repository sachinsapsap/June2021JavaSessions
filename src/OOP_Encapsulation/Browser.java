package OOP_Encapsulation;

public class Browser {
	
	
	
	public void launchBrowser() {
		System.out.println("Trying to launch browser");
		isChromePresent();
		checkRamSpace();
		browserIsUpgraded();
		checkOSCompatible();
		checkBrowserVersion();
		System.out.println("Browser is launched");
		
	}
	
	private void isChromePresent() {
		System.out.println("isChromePresent");
	}
	
	private void checkRamSpace() {
		System.out.println("checkRamSpace");
	}

	private void browserIsUpgraded() {
		System.out.println("browserIsUpgraded");
	}
	
	private void checkOSCompatible() {
		System.out.println("checkOSCompatible");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}
	
}
