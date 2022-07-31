package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;

public class TesteCucumber {
	
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	String name = "First test";

	@Before
	public void runTest() {
		Executa.openBrowser();
		
	}
	
	@After
	public void quit() {
		Executa.quit();
		
	}

	@Given("I am in site")
	public void iAmInSite() {
		metodos.scroll(0, 350);
		metodos.click(el.menuElements);
		metodos.click("span", "Text Box");

	}
	@When("I fill form")
	public void iFillForm() {
		metodos.type(el.userName, this.name);
		metodos.type(el.userEmail, "test@test.com");
		metodos.type(el.currentAddress, "test address");
		metodos.type(el.permanentAddress, "test address 2");
		metodos.scroll(0, 300);
		metodos.click(el.btnSubmit);

	}
	@Then("I send form")
	public void iSendForm() {
		metodos.validateText(el.outputName, this.name);
		metodos.screenShot("CT01 - Fill Form");
	}



}
