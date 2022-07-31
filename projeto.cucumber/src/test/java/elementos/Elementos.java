package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By menuElements = By.xpath("//div[@class='card-body']//h5[text()='Elements']");
	public By userName = By.xpath("//*[@id='userName']");
	public By userEmail = By.xpath("//*[@id='userEmail']");
	public By currentAddress = By.xpath("//textarea[@id='currentAddress']");
	public By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");
	public By btnSubmit = By.xpath("//button[@id='submit']");
	public By outputName = By.xpath("//p[@id='name']");
}
