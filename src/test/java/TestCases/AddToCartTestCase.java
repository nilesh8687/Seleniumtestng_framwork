package TestCases;

import java.io.IOException;
import java.text.DecimalFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Resources.baseClass;

public class AddToCartTestCase   {
	
	@Test
	public void VerifyProductPriceBeforeAndAfter() throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		
		driver .findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		
		String iphoneCost=driver .findElement(By.xpath("//p[@class='price']")).getText();
		
		//System.out.println(iphoneCost);
		
		String iphoneArray[] =iphoneCost.split(" ");
		
		//System.out.println(Arrays.toString(iphoneArray));
		
		String iphoneArrayFE = iphoneArray[0];
		//System.out.println(iphoneArrayFE);
		
		String iphoneCostWithnumber=iphoneArrayFE.replaceAll("[^\\d.]", "");
		System.out.println(iphoneCostWithnumber);
		
		double finaliphoneCost=Double.parseDouble(iphoneCostWithnumber);
		System.out.println(finaliphoneCost);
		
		DecimalFormat df = new DecimalFormat("0.00"); // Change the pattern as needed
        String formattedValue = df.format(finaliphoneCost);
        System.out.println(formattedValue);
        driver.findElement(By.xpath("//button[@onclick=\"cart.add('40', '1');\"]")).click();
        
        driver.findElement(By.xpath("//input[@name='search']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("samsung");
        Thread.sleep(2000);
        driver .findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        Thread.sleep(2000);
String samsungCost=driver .findElement(By.xpath("(//p[@class='price'])[2]")).getText();
		
		//System.out.println(iphoneCost);
		
		String samsungArray[] =samsungCost.split(" ");
		
		//System.out.println(Arrays.toString(iphoneArray));
		
		String samsungArrayFE = samsungArray[0];
		//System.out.println(iphoneArrayFE);
		
		String samsungCostWithnumber=samsungArrayFE.replaceAll("[^\\d.]", "");
		System.out.println(samsungCostWithnumber);
		
		double finalsamsungCost=Double.parseDouble(samsungCostWithnumber);
		System.out.println(finalsamsungCost);
		
		DecimalFormat dfs = new DecimalFormat("0.00"); // Change the pattern as needed
        String formattedValuesam = dfs.format(finalsamsungCost);
        System.out.println(formattedValuesam);
        
        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
        
        double c= finaliphoneCost+finalsamsungCost;
        System.out.println(c);
        
        String t=("$"+c);
        System.out.println(t);
        driver.findElement(By.xpath("//span[@id=\"cart-total\"]")).click();
        
        WebElement gt= driver.findElement(By.xpath("//td[text()='$365.19']"));
        String d=gt.getText();
        System.out.println(d);
        
        
	}

}
