package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class MainMethod {

	public static String projectPath;
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
	}
public static void browsers(String browser)
{
	projectPath=System.getProperty("user.dir");
	switch(browser) {
	case "chrome":		
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/chromedriver.exe");		
		System.out.println(projectPath);
		driver=new ChromeDriver();
		break;
	case "edge":
		System.setProperty("webdriver.edge.driver", projectPath+"/Driver/msedgedriver.exe");		
		System.out.println(projectPath);
		driver=new EdgeDriver();
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/geckodriver.exe");
		System.out.println(projectPath);
		driver=new FirefoxDriver();
	    break;    
	case "internetExplorer":
		System.setProperty("webdriver.ie.driver", projectPath+"/Driver/IEDriverServer.exe");		
		System.out.println(projectPath);
		driver=new InternetExplorerDriver(); 
		break;
	case "opera":
		System.setProperty("webdriver.opera.driver", projectPath+"/Driver/operadriver.exe");		
		System.out.println(projectPath);
		driver=new OperaDriver(); 
		break;	
	}
}
}
