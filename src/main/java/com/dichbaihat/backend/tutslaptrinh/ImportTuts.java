package com.dichbaihat.backend.tutslaptrinh;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImportTuts {
	private static WebDriver driver = null;
    static String tilte = "";
    static String content = "";
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
			
		try
        {
            FileInputStream file = new FileInputStream(new File("tutslaptrinhFileIO.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            int a = 0;
            while (rowIterator.hasNext())
            {
            	a = 0;
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext())
                {
                	
                	Cell cell = cellIterator.next();
                	if(a == 0){
                		tilte  = cell.getStringCellValue();
                	}else{
                		content = cell.getStringCellValue();
                	}
                	a++;
                }

//              driver = new FirefoxDriver();
                System.setProperty("webdriver.chrome.driver", "E:\\huynh\\crawler\\Selenium\\chromedriver.exe");
      	        driver = new ChromeDriver();     
				driver.get("http://tutslaptrinh.localhost/backend/backend/auth/signin");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[1]")).sendKeys("admin");
				driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/input[2]")).sendKeys("123456a@A");
				driver.findElement(By.xpath("//html/body/div[1]/div/div[2]/div/div/form/div/div/button")).click();
				
				Tutslaptrinh dichbaihat = new Tutslaptrinh(tilte, content, driver);
				dichbaihat.importData();
				Robot robot = new Robot();
	            // Creates the delay of 5 sec so that you can open notepad before
	            // Robot start writting
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.delay(1000);
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.delay(1000);
				System.out.println("Done");
                System.out.println("");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
		

	}

}
