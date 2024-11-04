package DockerDeploy.DockerDeploy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {

	@Test
public void test1() throws MalformedURLException{
        
        WebDriver driver;
        
        String host_url = "http://localhost:4444/wd/hub";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        driver = new RemoteWebDriver(new URL(host_url), options);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    	
    }

}
