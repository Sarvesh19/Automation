import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "D:\\Java_GoWithMe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("LM6RPg")).sendKeys("Dell");;
		driver.findElement(By.className("vh79eN")).click();
	}
}
