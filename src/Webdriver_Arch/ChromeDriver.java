package Webdriver_Arch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
	System.out.println("Launch Chrome");	
	}

	@Override
	public void findElement() {
		System.out.println("Find the Element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Find the Elements");
		
	}

	@Override
	public void get(String url) {
		System.out.println("Launch URL "+url);
		
	}

	@Override
	public String getTitle() {
		return "XYZ Application";
	}

	@Override
	public String getUrl() {
        return "https://www.xyz.com";
	}

	@Override
	public void click() {
		System.out.println("Clicked");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Pass this value "+value);
		
	}

	@Override
	public void quit() {
		System.out.println("Close the browser");
		
	}

}
