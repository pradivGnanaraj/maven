package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintroductions {
    public static void main(String[] args) {
    	
        // Chrome 
    	System.setProperty("webdriver.chrome.driver", "/Users/pradivgnanaraj/Downloads/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        // Firefox
        System.setProperty("webdriver.gecko.driver", "/Users/pradivgnanaraj/Downloads/chromedriver_mac_arm64/firefoxdriver");
        WebDriver driver = new FireFoxDriver();
        
        // Edge
        System.setProperty("webdriver.edge.driver", "/Users/pradivgnanaraj/Downloads/chromedriver_mac_arm64/msedgedriver");
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close(); // close current tab
        driver.quit(); // close all associated windows
        
    }
}
