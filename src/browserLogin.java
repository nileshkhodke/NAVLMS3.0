import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class browserLogin
{
 
	
	  WebDriver w;
	 
	  
	  // Firefox browser driver
	
@Test
	public void firefox() 
	  
	{
		w=new FirefoxDriver();
		w.get("http://elms-dv01.cloudapp.net");
	}
	  
	  
	  
	  // Chrome browser driver
	  
    @Test
	  public void chrome()
	  {
		  System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver.exe");

		     w= new ChromeDriver();
		  
		    
		   /*  w.findElement(By.id("email")).sendKeys("nileshkhodke678");
			 w.findElement(By.id("password")).sendKeys("123@abc1234");
			 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
			 w.findElement(By.linkText("Log out")).click();
			 w.quit();*/
			 
	 }
	  
	  // IE browser driver
	  
	  
	  
	  public void ie()
	  {
		  System.setProperty("webdriver.ie.driver", "/Users/admin/Downloads/IEDriverServer.exe");
		  w = new InternetExplorerDriver();
		 
			   /*     w.get("http://elms-dv01.cloudapp.net");
				     w.findElement(By.id("email")).sendKeys("nileshkhodke678");
					 w.findElement(By.id("password")).sendKeys("123@abc1234");
					 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
					 w.findElement(By.linkText("Log out")).click();
					 w.quit(); */
		 }
	  
	  
	
	  //To login to system

	
	  public void Login()
	  
	  {
		 w.get("http://elms-dv01.cloudapp.net");
		 w.findElement(By.id("email")).sendKeys("nileshkhodke678");
		 w.findElement(By.id("password")).sendKeys("123@abc1234");
		 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
		
	  }
	  
	  
	  public void logout()
	  {
		  w.findElement(By.linkText("Log out")).click();
		  w.quit();
		  
	  }
	  
	  public void Register()
	  {
		  w.get("http://elms-dv01.cloudapp.net");
		  
		  String n=w.getTitle();
		  System.out.println("Title is :"+n);
		  w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/a[2]")).click();
		  
		  w.findElement(By.id("fname")).sendKeys("db");
		  
		  w.findElement(By.id("lname")).sendKeys("db");
		  
		  w.findElement(By.id("username")).sendKeys("db2");
		  
		  
		  w.findElement(By.id("email")).sendKeys("Nileshkhodke5+112@navituseducation.com");
		  
		  w.findElement(By.id("password")).sendKeys("db");
		  
		  w.findElement(By.id("password_confirmation")).sendKeys("db");
		  
		  w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/form/div[7]/div[1]/button")).click();
		  
		  String s=w.getTitle();
		  
		  System.out.println("Title is :"+s);
		  if(s.equals(n))
		  {
			  System.out.println("Pass");
		  }
		 
		  else 
		  {
			  System.out.println("Fail");
		  }
		  
		  
		  }
	  
}
	 
	  
	 /*public void safari()
	  {
		    
		    //Run program on Safari browser 5.3
		    
		     w = new SafariDriver();
		     w.get("http://elms-dv01.cloudapp.net");
		     w.findElement(By.id("email")).sendKeys("nileshkhodke678");
			 w.findElement(By.id("password")).sendKeys("123@abc1234");
			 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
			 w.findElement(By.linkText("Log out")).click();
			 w.quit();

	}*/
	  
	 /* public void opera()
	  {
		  System.setProperty("webdriver.chrome.driver", "/Users/admin/Downloads/chromedriver.exe");

		     w= new OperaDriver();
		  
		     w.get("http://elms-dv01.cloudapp.net");
		     w.findElement(By.id("email")).sendKeys("nileshkhodke678");
			 w.findElement(By.id("password")).sendKeys("123@abc1234");
			 w.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div[2]/form/button")).click();
			 w.findElement(By.linkText("Log out")).click();
			 w.quit();
			 
			
				  
}*/
	  

	  
	  

	
	
	
	

