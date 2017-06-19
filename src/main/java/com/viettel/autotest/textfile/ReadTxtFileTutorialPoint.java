package com.viettel.autotest.textfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import com.viettel.autotest.exel.WriteExcelDemo;
import com.viettel.autotest.tutorialpoint.Angularjs;
 
public class ReadTxtFileTutorialPoint {
    public static void main(String[] args) {
 
        BufferedReader br = null;
        try {
            String sCurrentLine;
 
            br = new BufferedReader(new FileReader("crawler.txt"));
            Map<String, Object[]> data = new TreeMap<String, Object[]>();
    		
    		int i =1;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                Angularjs tabao = new Angularjs();
                Object[] temp = tabao.getData(sCurrentLine);
                if(temp !=  null){
                	 data.put(String.valueOf(i), temp);
                     i++;
                }
            }
            
            WriteExcelDemo excel = new WriteExcelDemo();
            excel.writeExcel(data);
 
        } catch (IOException e) {
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
