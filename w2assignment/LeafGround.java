package w2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Saravanan");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Chennai");
		WebElement nn=driver.findElement(By.xpath("//input[@value='Chennai']"));
		if(nn.isEnabled())
		{
			System.out.println("Element is present");
		}
		else
			System.out.println("Element is not present");
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getText();
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("pmsaravanan28@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Automated Tester");
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).click();
		driver. navigate(). back();
		driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
		System.out.println("Lable position changed");
		WebElement dd=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Select sec=new Select(dd);
		sec.selectByValue("3");
		
	}
	
}
