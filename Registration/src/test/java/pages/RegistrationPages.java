package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPages {
	
	static WebDriver driver;
	
	public RegistrationPages(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void setField() {
		
		WebElement objName = driver.findElement(By.id("firstName"));
		objName.sendKeys("Jarbas");
		
		WebElement objSurname = driver.findElement(By.name("lastName"));
		objSurname.sendKeys("Andrade");
		
		WebElement objEmail = driver.findElement(By.id("username"));
		objEmail.sendKeys("ajarbas98");
		
		WebElement objPswd = driver.findElement(By.xpath("//*[@id=\'passwd\']/div[1]/div/div[1]/input"));
		objPswd.sendKeys("andrja12");
		
		WebElement objPswdConfirm = driver.findElement(By.xpath("//*[@id=\'confirm-passwd\']/div[1]/div/div[1]/input"));
		objPswdConfirm.sendKeys("andrja12");
		
		WebElement objNextButton = driver.findElement(By.xpath("//*[@id=\'accountDetailsNext\']/span/span"));
		objNextButton.click();
		
	}
	
	/*public String validateMessage() {
		
		return driver.findElement(By.xpath("//*[@id=\'view_container\']/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div")).getText();
		
	}*/
	
	// eu sou foda
	

}
