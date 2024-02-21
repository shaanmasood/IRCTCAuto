package FrugalPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCNew {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search"); 
		String loginname="";
		String password="";
		String from="";
		String to="";
		String date="";
		String xpathforcategory="";
		int choice=1;
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).click();//click on from
		driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys(from);
		driver.findElement(By.xpath("//*[@id=\"pr_id_1_list\"]/li[2]")).click();//click on first option
		
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).click();//click on to
		driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(to);
		driver.findElement(By.xpath("//*[@id=\"p-highlighted-option\"]")).click();//click on first option
		
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();//click on date
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).sendKeys(date);
		
		driver.findElement(By.xpath("//*[@id=\"journeyClass\"]/div")).click();//click on category
		switch(choice) {
		case 1:
			xpathforcategory="//*[@id=\"journeyClass\"]/div/div[4]/div/ul/p-dropdownitem[8]/li";//3A
		break;
		case 2:
			xpathforcategory="";
	    break;
		case 3:
			xpathforcategory="";
		break;
		}
		driver.findElement(By.xpath(xpathforcategory)).click();
		driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div[1]/button")).click();
		
		WebElement x1=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[1]/div[1]/strong"));
		System.out.println(x1+" is a choice");
		WebElement x2=driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[2]/div[1]/app-train-avl-enq/div[1]/div[1]/div[1]/strong"));
		System.out.println(x2+" is a choice");
		
		
	}
}