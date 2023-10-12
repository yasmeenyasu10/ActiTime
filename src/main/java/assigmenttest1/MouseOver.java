package assigmenttest1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class MouseOver {

 

public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();	

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");

		WebElement act = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		Actions a = new Actions(driver);

		a.moveToElement(act).perform();

		System.out.println("Hello");

		driver.close();

 

	}

 

 

 

}