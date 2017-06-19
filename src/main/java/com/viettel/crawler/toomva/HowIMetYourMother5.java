package com.viettel.crawler.toomva;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowIMetYourMother5 {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();

		driver.get("http://toomva.com/how-i-met-your-mother-season-8-1-farhampton-v.949");
		driver.manage().window().maximize();
		
		for(int i=1; i <=24; i++){
			String abc = driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[3]/div[2]/div[2]/div[2]/div[2]/div/a["+i+"]")).getAttribute("href");
			driver.get(abc);
			String content = driver.findElement(By.xpath("//html/body/div[1]/div[3]/div[3]/div[3]/div[2]/div/ul"))
					.getText();
	
			File file = new File("E:\\MyProject\\datadichbaihat\\howimetyourmother\\season8\\tap"+i+".txt");
	
			try {
				// if file doesnt exists, then create it
				if (!file.exists()) {
					file.createNewFile();
				}
	
				FileWriter fw;
				fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(content);
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			System.out.println("Done");
		}
			

		// Close the driver

	}

}
