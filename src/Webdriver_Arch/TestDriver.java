package Webdriver_Arch;

public class TestDriver {

	public static void main(String[] args) {
		
		String browser="Firefox";
		WebDriver driver=null;
		
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Safari")){
			driver=new SafariDriver();
		}
		else {
			System.out.println("No browser found");
		}
		
		driver.findElement();
		driver.findElements();
		driver.get("https://www.xyz.com");
		System.out.println(driver.getTitle());
		

	}

}
