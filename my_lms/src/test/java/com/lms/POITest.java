package com.lms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2020/5/10/010.
 */
public class POITest {
    public static void main(String[] args) throws IOException {
        //1.创建workbook工作簿
        Workbook wb = new XSSFWorkbook();
             //2.创建表单Sheet
            Sheet sheet = wb.createSheet("test");
             //3.创建行对象，从0开始
            Row row = sheet.createRow(3);
            //4.创建单元格，从0开始
            Cell cell = row.createCell(0);
            //5.单元格写入数据
            cell.setCellValue("传智播客");
             //6.文件流
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\study_common\\test.xlsx");
            wb.write(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            fos.close();
        }
        //7.写入文件


    }
}
