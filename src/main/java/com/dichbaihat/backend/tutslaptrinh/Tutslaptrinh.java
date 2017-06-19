package com.dichbaihat.backend.tutslaptrinh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Tutslaptrinh {
	private String title;
	private String content;
	private String tags;
	private String excerpt;
	private String metaTile;
	private String metaDesc;
	private String keyword;
	private WebDriver driver;
	
	public Tutslaptrinh(String title, String content,WebDriver driver ){
		this.title = title;
		this.content = content;
//		this.tags = gettags(title);
		this.excerpt = title;
		this.metaTile = title;
		this.metaDesc = title;
		this.keyword = title;
		this.driver = driver;
			
		
	}
	
	public String gettags(String title){
		String result="";
		String[] tag = title.split("-");
		result = tag[1].toString();
		return result;
	}
	
	public void importData(){
//		dang nhap xong 
		driver.get("http://tutslaptrinh.localhost/backend/rainlab/blog/posts/create");
//		title
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[1]/div/div[1]/div/input[1]")).sendKeys(title);
//		content
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/span[1]/span[2]/span[1]/span[3]/a[1]")).click();

		
		StringSelection selec = new StringSelection(content);
		Clipboard clipboad = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboad.setContents(selec, selec);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/textarea")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/span[1]/span[2]/span[1]/span[3]/a[1]")).click();
		//		category
		

		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[1]/ul/li[2]/a")).click();
//		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div[1]/label")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div/div[6]/label")).click();
		
//		manager
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[3]/div[1]/div/label")).click();
		

		
		
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[3]/div[2]/div/div/input")).sendKeys("2016-01-16");
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[1]/ul/li[4]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[3]/div[3]/div/textarea")).sendKeys(excerpt);

		//		seo
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[1]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[4]/div[1]/input")).sendKeys(metaTile);
		
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[4]/div[2]/textarea")).sendKeys(metaDesc);
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[4]/div[3]/textarea")).sendKeys(keyword);
		
//		save
		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[2]/div/div[2]/div[4]/div[3]/textarea")).sendKeys(Keys.CONTROL+"s");
//		driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div[2]/div/div/div/div/form/div/div[1]/div/div[3]/div/a[1]")).click();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		driver.close();
        // Simulate a key press
		
	}

}
