package com.viettel.autotest.selenium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.viettel.autotest.exel.WriteExcelDemo;
import com.viettel.autotest.tutorialpoint.Mkyong;
 
public class ReadTxtToRequest {
    public static void main(String[] args) {
 
        BufferedReader br = null;
        try {
            String sCurrentLine;
 
            br = new BufferedReader(new FileReader("crawler.txt"));
            Map<String, Object[]> data = new TreeMap<String, Object[]>();
    		
    		int i =1;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            Thread.sleep(5000);
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
