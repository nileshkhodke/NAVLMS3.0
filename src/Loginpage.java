import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Loginpage 
{
  @Test
  public void login() throws InterruptedException 
  {
	 WebDriver w=new FirefoxDriver();
	 w.get("http:\\192.168.1.109");
	  
	  
	 w.findElement(By.id("email")).sendKeys("nileshkhodke"); //Passing email id
	
	 w.findElement(By.id("password")).sendKeys("11111111"); //Passing password
	 
	 Thread.sleep(2000);
	 
	 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
	 
	 System.out.println("Login sucessfully");
	 

	 String title=w.getTitle();
	 
	 System.out.println("Page title varified");
	 
	 System.out.println("Title is: "+title);
	 
	 if(title.equalsIgnoreCase("Dashboard"))
	 {
		 System.out.println("Testcase Pass");
	 }    
	 else
	 {   
	 	 System.out.println("Testcase fail");
	 }
	
	 w.close();
	 
//	 w.quit();
	 }

}
