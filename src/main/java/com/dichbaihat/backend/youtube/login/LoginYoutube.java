package com.dichbaihat.backend.youtube.login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.viettel.autotest.crawlerSele.Tabaolan;

public class LoginYoutube {

	private static WebDriver driver = null;
	static String sCurrentLine;
    public static void main(String[] args) {
    	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();  
	        LoginYoutube you = new LoginYoutube();
	        you.getData("https://www.youtube.com/");
	        
    }
    
    public void getData(String url){

		driver.get(url);
		driver.findElement(By.className("signin-container")).click();
		driver.findElement(By.id("identifierId")).sendKeys("docaohuynh4@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		/*String title = driver.findElement(
				By.xpath("//html/body/div[1]/div/div/article/h2")).getText();
		String contentTemp = driver.findElement(
				By.xpath("//html/body/div[1]/div/div/article/div[1]")).getAttribute("innerHTML");
		System.out.println(title);
		System.out.println(contentTemp);
		driver.quit();*/
	}

}
