package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropVal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ej2.syncfusion.com/demos/?_ga=2.95870748.127662876.1570774268-1036667550.1570774268#/material/multi-select/chip-customization.html");
		
		driver.findElement(By.className("e-dropdownbase")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[text()='HotPink']/../..")).getAttribute("innerHTML"));
		
		Thread.sleep(3000);
		
		//System.out.println(driver.getPageSource());
	
//	List<WebElement> listweb = driver.findElements(By.xpath("//ul[@id='chip-customization_options']/li"));
//	System.out.println(listweb.size());
//	
//	for(int i=0; i<listweb.size(); i++){
//		System.out.println(listweb.get(i).getText() + " "+ listweb.get(i).getAttribute("class") );
//		if(listweb.get(i).getText().equals("HotPink")){
//			listweb.get(i).click();
//			break;
//		}
//	}
	
	
	}

}
