package wellsfargo;

import java.io.IOException;

import org.eclipse.jetty.server.QuietServletException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Close;

public class AutomationScript {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		driver = new FirefoxDriver();
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		// to check weather displayed
		WebElement personalTab = driver.findElement(By.xpath(".//*[@id='tabNav']/ul/li[1]"));
		boolean a = personalTab.isDisplayed();
		System.out.println("perdonaltab = " + a);
		// click on about wellsfargo
		WebElement aboutwellsfargo = driver.findElement(By.xpath(".//*[@id='headerTools']/nav/ul/li[2]/a"));
		aboutwellsfargo.click();
		// current url of aboutwellsfargo
		String url = driver.getCurrentUrl();
		System.out.println("Current url = " + url);
		// conforming the heading
		String conformation = driver.findElement(By.xpath(".//*[@id='shell']/div[1]/h1")).getText();
		System.out.println("Conforming the heading = " + conformation);
		// navigate back to home page
		driver.navigate().back();
		String url1 = driver.getCurrentUrl();
		System.out.println("Home url = " + url1);
		// check on personaltab
		WebElement personalTab1 = driver.findElement(By.xpath(".//*[@id='tabNav']/ul/li[1]"));
		boolean c = personalTab1.isDisplayed();
		System.out.println("personaltab = " + c);
		// click on insurance tab
		driver.findElement(By.xpath(".//*[@id='insuranceTab']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='insurance']/div[1]/div[2]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='zipCode']")).sendKeys("94555");

		driver.close();
	}

}
