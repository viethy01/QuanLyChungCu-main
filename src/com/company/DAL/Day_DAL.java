package com.company.DAL;
import com.company.Entities.Day;

import java.io.*;
import java.util.ArrayList;

public class Day_DAL {
    static File file = new File("Day.txt");
    public static void DocFile(ArrayList<Day>Days) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
//                makh+"#"+hoten+"#"+gioitinh+"#"+maphong+"#"+ngaysinh+"#"+diachi;
                String tenday = line.split("#")[0];
                String maday = line.split("#")[1];

                Days.add(new Day(tenday,maday));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<Day>Days) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (Day Day:Days
        ) {
            fileWriter.write(Day.toString()+"\n");
        }
        fileWriter.close();
    }
}
