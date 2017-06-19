package com.dichbaihat.backend.song;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImportSong {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

//		driver = new FirefoxDriver();
//		driver.get("http://dichbaihat.com/backend/backend/auth/signin");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[1]")).sendKeys("admin");
//		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[2]")).sendKeys("123456a@A");
//		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/button")).click();
//		
//		Read file in folder
		for(int k = 5 ; k <=6; k++){
			File folder = new File("D:\\Project\\datacrawler\\seleniumnew\\Walking Dead\\season"+k+"done");
			File[] listOfFiles = folder.listFiles();
	
			for (int i = 0; i < listOfFiles.length; i++) {
	//		for (int i = 0; i < 3; i++) {
			  File file = listOfFiles[i];
			  if (file.isFile() && file.getName().endsWith(".txt")) {
			    try {
			    	System.setProperty("webdriver.chrome.driver", "D:\\Project\\datacrawler\\Selenium\\chromedriver.exe");
	      	        driver = new ChromeDriver();     
//			    	driver = new FirefoxDriver();
					driver.get("http://dichbaihat.com/backend/backend/auth/signin");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[1]")).sendKeys("admin");
					driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[2]")).sendKeys("123456a@A");
					driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/button")).click();
					
					String tile = file.getName();
					String content = FileUtils.readFileToString(file);
					String url = tile.replaceAll(".txt", "");
					System.out.println(file.getName());
					DichbaihatSong dichbaihat = new DichbaihatSong(url, content, driver);
					dichbaihat.importData();
//					Robot robot = new Robot();
		            // Creates the delay of 5 sec so that you can open notepad before
		            // Robot start writting
//					robot.keyPress(KeyEvent.VK_ENTER);
//					robot.delay(1000);
//					robot.keyPress(KeyEvent.VK_ENTER);
//					robot.delay(1000);
					System.out.println("Done");
				} catch (Exception e) {
					e.printStackTrace();
				}
			  } 
			}
	
		}

		// Close the driver

	}

}
