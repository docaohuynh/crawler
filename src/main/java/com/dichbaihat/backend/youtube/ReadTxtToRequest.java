package com.dichbaihat.backend.youtube;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.viettel.autotest.exel.WriteExcelDemo;
import com.viettel.autotest.tutorialpoint.Mkyong;
 
public class ReadTxtToRequest {
	private static WebDriver driver = null;
	static String sCurrentLine;
    public static void main(String[] args) {
    	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        driver = new ChromeDriver();  
    	for(int j = 1; j < 10000; j++){
    		BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader("crawler.txt"));
	            Map<String, Object[]> data = new TreeMap<String, Object[]>();
	    		int i =1;
	            while ((sCurrentLine = br.readLine()) != null) {
					driver.get(sCurrentLine);
					Thread.sleep(10000);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null)br.close();
	            } catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
    	}
	        
    }
}
