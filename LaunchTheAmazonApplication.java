
import java.io.IOException;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.eclipse.jdt.internal.compiler.ast.TryStatement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.unix.X11.Screen;

public class LaunchTheAmazonApplication extends ReusableMethods {

	static WebDriver driver;

	 //Test Case 01>>>>Login Error Message - 1
	public static void LaunchAmazon() throws IOException, Exception {
		String expecteMsg = "login amazon.";
		startReport("Launch Amazon", "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Update_Report("Pass", "Launch amazon Application", "amazon Application is launched");
		driver.quit();
		bw.close();
	}

	//Test Case 02 >>> Verify Drop Down Option after Iphone is Typed in Search
	public static void IphoneTypedSearch() throws IOException, Exception {

		String expecteMsg = "Iphone is typed in search";
		 startReport("Iphone Typed Search",
		 "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Update_Report("Pass", "iphone typed and clicked tabs", "typed and selected");

		WebElement a = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		a.sendKeys("Iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='issDiv0']")).click();
		// a.clear();
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		b.sendKeys(" ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='issDiv1']")).click();
		b.clear();
		Thread.sleep(5000);

		WebElement c = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		c.sendKeys("Iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='issDiv2']")).click();
		c.clear();

		driver.quit();
		bw.close();
	}

	// Test Case 03 >>> Click on Search Button after "Ipone " is entered
	public static void clicksearch() throws IOException, Exception {

		String expecteMsg = "clicked";
		startReport("click search", "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Update_Report("Pass", "click search button", "clicked");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.quit();
		bw.close();
	}

	// Test Case 04 >>> Verify Show results for Column on the left -"Cell Phones
	// & Accessories "Header
	public static void CellPhonesAccessories() throws IOException, Exception {

		String expecteMsg = "clicked";
		startReport("Cell Phones Accessories", "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get(
				"https://www.amazon.com/s/ref=nb_sb_ss_c_3_4?url=search-alias%3Dmobile&field-keywords=iphone+6s+case&sprefix=ipho%2Caps%2C235");
		Update_Report("Pass", "display and option", "displayed and shown");
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='a-page']/div[3]/div/div[2]/div/div[2]/div[2]/ul[2]/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ref_2407749011']/li[1]/a/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='a-page']/div[3]/div/div[2]/div/div[2]/div[2]/ul[3]/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ref_2528832011']/li[8]/a/span")).click();
		driver.quit();
		bw.close();
	}

	// Test Case 05>>> Verify Show results for Column on the left -" Computers &
	// Accessories "Header
	public static void computerComponents() throws IOException, Exception {

		String expecteMsg = "clicked";
		startReport("computer Components",
		 "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get(
				"https://www.amazon.com/s/ref=nb_sb_ss_i_1_15?url=search-alias%3Daps&field-keywords=computers+and+accessories&sprefix=computers+and+a%2Caps%2C391");
		 Update_Report("Pass", "display and option", "displayed and shown");
		Thread.sleep(5000);

		WebElement computer = driver
				.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[1]/ul/li[2]/a/span"));
		boolean c = computer.isDisplayed();
		System.out.println("computer = " + c);

		driver.quit();
		bw.close();

	}

	// Test Case 06>>> To Verify Display " Electronics " and Options Below it
	public static void electronics() throws IOException, Exception {

		String expecteMsg = "clicked";
		 startReport("electronics", "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get(
				"https://www.amazon.com/s/ref=nb_sb_ss_i_2_4?url=search-alias%3Delectronics&field-keywords=smart+watch&sprefix=smar%2Celectronics%2C296");
		 Update_Report("Pass", "display and option", "displayed and shown");
		Thread.sleep(5000);
		WebElement smartwatch = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[3]/a/span[1]"));
		smartwatch.click();
		Thread.sleep(5000);
		String s = driver.getTitle();
		System.out.print(s);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ref_493964']/li[2]/a/span[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[1]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='a-page']/div[3]/div/div[2]/div/div[2]/div[2]/p[7]/a")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath(".//*[@id='acsux-hsb-ns_3BHP4AFZ0R426DW1C7MR_1747__hsb_1209']/div/div/ul/li[3]/div/div")).click();

		driver.quit();
		bw.close();
	}

	// Test Case 08>>> TC01 (Check MainTab)
	public static void maintab() throws IOException, Exception {

		String expecteMsg = "clicked";
		 startReport("maintab", "C:/Users/LenMathew/Documents/amazon/");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		 Update_Report("Pass", "display and option", "displayed and shown");
		Thread.sleep(5000);
		// department
		WebElement element = driver.findElement(By.linkText("Departments"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		// todays deal
		WebElement element1 = driver.findElement(By.linkText("Today's Deals"));

		Actions action1 = new Actions(driver);

		action.moveToElement(element1).build().perform();
		Thread.sleep(3000);
		// gift card
		WebElement element2 = driver.findElement(By.linkText("Gift Cards & Registry"));

		Actions action2 = new Actions(driver);

		action.moveToElement(element2).build().perform();
		Thread.sleep(3000);
		// sell
		WebElement element3 = driver.findElement(By.linkText("Sell"));

		Actions action3 = new Actions(driver);

		action.moveToElement(element3).build().perform();
		Thread.sleep(3000);
		// help
		WebElement element4 = driver.findElement(By.linkText("Help"));

		Actions action4 = new Actions(driver);

		action.moveToElement(element4).build().perform();
		Thread.sleep(3000);
		// sign in yahoo
		WebElement element5 = driver.findElement(By.linkText("Your Account"));

		Actions action5 = new Actions(driver);

		action.moveToElement(element5).build().perform();
		Thread.sleep(3000);
		// try prime
		WebElement element6 = driver.findElement(By.linkText("Try Prime"));

		Actions action6 = new Actions(driver);

		action.moveToElement(element6).build().perform();
		Thread.sleep(3000);
		// your list
		WebElement element7 = driver.findElement(By.linkText("Lists"));

		Actions action7 = new Actions(driver);

		action.moveToElement(element7).build().perform();
		Thread.sleep(3000);
		// cart
		WebElement element8 = driver.findElement(By.id("nav-cart"));

		Actions action8 = new Actions(driver);

		action.moveToElement(element8).build().perform();
		
driver.quit();
bw.close();
	}

	// Test Case 09>>>Validate the Dropdown list in <Department> Tab
		public static void dropdown() throws IOException, Exception {

			String expecteMsg = "clicked";
			 startReport("dropdown", "C:/Users/LenMathew/Documents/amazon/");

			driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			 Update_Report("Pass", "display and option", "displayed and shown");
			Thread.sleep(5000);
			// department
			WebElement element = driver.findElement(By.linkText("Departments"));

			Actions action = new Actions(driver);

			action.moveToElement(element).build().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='nav-link-shopall']/span[2]")).click();
			driver.quit();
			bw.close();
		}
		// Test Case 10>>>Validate the Dropdown list in <Your Account> Tab
				public static void youraccount() throws IOException, Exception {

					String expecteMsg = "clicked";
					 startReport("your account", "C:/Users/LenMathew/Documents/amazon/");

					driver = new FirefoxDriver();
					driver.get("https://www.amazon.com/");
					 Update_Report("Pass", "display and option", "displayed and shown");
					Thread.sleep(5000);
					WebElement element5 = driver.findElement(By.id("nav-link-yourAccount"));

					Actions action5 = new Actions(driver);

					action5.moveToElement(element5).build().perform();
					Thread.sleep(3000);
					driver.quit();
					bw.close();
				}
				// Test Case 11>Validate the Dropdown list in <Your Account> Tab
				public static void droplist() throws IOException, Exception {

					String expecteMsg = "clicked";
					 startReport("droplist", "C:/Users/LenMathew/Documents/amazon/");

					driver = new FirefoxDriver();
					driver.get("https://www.amazon.com/");
					 Update_Report("Pass", "display and option", "displayed and shown");
					Thread.sleep(5000);
					WebElement element = driver.findElement(By.linkText("Lists"));

					Actions action = new Actions(driver);

					action.moveToElement(element).build().perform();
				
					driver.quit();
					bw.close();
				}
}