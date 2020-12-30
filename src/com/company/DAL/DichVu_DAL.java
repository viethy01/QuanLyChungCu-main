package com.company.DAL;
import com.company.Entities.DichVu;

import java.io.*;
import java.util.ArrayList;

public class DichVu_DAL {
    static File file = new File("DichVu.txt");
    public static void DocFile(ArrayList<DichVu>DichVus) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
//                String madv, String maphong, int songuoi, int chisokwh, int chiso1m3
                String madv = line.split("#")[0];
                String maphong = line.split("#")[1];
                int songuoi = Integer.parseInt(line.split("#")[2]);
               int chisokwh = Integer.parseInt(line.split("#")[3]);
                int chiso1m3 = Integer.parseInt(line.split("#")[4]);
                DichVus.add(new DichVu(madv,maphong,songuoi,chisokwh,chiso1m3));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<DichVu>DichVus) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (DichVu DichVu:DichVus
        ) {
            fileWriter.write(DichVu.toString()+"\n");
        }
        fileWriter.close();
    }
}
