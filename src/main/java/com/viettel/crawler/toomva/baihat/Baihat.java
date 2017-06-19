package com.viettel.crawler.toomva.baihat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baihat {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// Create a new instance of the Firefox driver

		driver = new FirefoxDriver();
		
		for(int j =1; j < 19 ; j++){
			for(int i=1; i <=24; i++){
				driver.get("http://toomva.com/Hoc-tieng-Anh-qua-bai-hat-s.16?&sortby=popular&page="+j+"");
				driver.manage().window().maximize();
				
				String url = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/ul/li["+i+"]/div[1]/a")).getAttribute("href");
				System.out.println(url);
				driver.get(url);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				String title = driver.findElement(By.className("sub-title-en")).getText();
				String singer = driver.findElement(By.className("sub-title-vi")).getText();
				String filename = title +"-"+singer;
				String content = driver.findElement(By.id("lst-bestsub"))
						.getText();
		
				File file = new File("D:\\Project\\datacrawler\\song\\"+filename+".txt");
		
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
		}
		
			

		// Close the driver

	}

}
