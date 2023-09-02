package w2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akhilesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Saravanan");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9952645467");
		WebElement dd=driver.findElement(By.xpath("//select[@id='day']"));
		Select sec= new Select(dd);
		sec.selectByVisibleText("13");
		WebElement dd1=driver.findElement(By.xpath("//select[@id='month']"));
		Select sec1= new Select(dd1);
		sec1.selectByVisibleText("07");
		WebElement dd2=driver.findElement(By.xpath("//select[@id='year']"));
		Select sec2= new Select(dd2);
		sec2.selectByVisibleText("1988");
		WebElement radio=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radio.click();
		
	}

}
