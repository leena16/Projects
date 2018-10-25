import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotdemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/SeleniumAllPractise/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 Robot robot = new Robot();
		 driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		 driver.findElement(By.xpath("//input[contains(@name,'upfile')]")).click();
		 robot.setAutoDelay(2000);
		 StringSelection ss= new StringSelection("C:\\Users\\IBM_ADMIN\\Desktop\\sample.txt");
		 Clipboard cp= Toolkit.getDefaultToolkit().getSystemClipboard();
		 cp.setContents(ss, null);
		 
	}

}
