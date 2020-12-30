package com.company.DAL;
import com.company.Entities.KhachHang;

import java.io.*;
import java.util.ArrayList;

public class KhachHang_DAL {
    static File file = new File("khachhang.txt");
    public static void DocFile(ArrayList<KhachHang>khachHangs) throws IOException {
        if(file.exists()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
//                makh+"#"+hoten+"#"+gioitinh+"#"+maphong+"#"+ngaysinh+"#"+diachi;
                String makh = line.split("#")[0];
                String hoten = line.split("#")[1];
                String gioitinh = line.split("#")[2];
                String maphong = line.split("#")[3];
                String ngaysinh = line.split("#")[4];
                String diachi = line.split("#")[5];
                khachHangs.add(new KhachHang(makh,hoten,gioitinh,maphong,ngaysinh,diachi));
            }
            fileReader.close();
            bufferedReader.close();
        }
    }
    public static void GhiFile(ArrayList<KhachHang>khachHangs) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (KhachHang khachHang:khachHangs
             ) {
            fileWriter.write(khachHang.toString()+"\n");
        }
        fileWriter.close();
    }
}
