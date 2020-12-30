package com.company.GUI;

import com.company.BLL.DichVu_BLL;
import com.company.DAL.DichVu_DAL;
import com.company.Entities.DichVu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DichVu_GUI {
    private static void Menu(){
        System.out.println("==========================================================");
        System.out.println("|                     QUẢN LÝ DỊCH VỤ                     |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|              1. Nhập thông dịch vụ                      |");
        System.out.println("|              2. Hiện thông tin                          |");
        System.out.println("|              3. Cập nhật thông tin                      |");
        System.out.println("|              4. Xóa thông tin                           |");
        System.out.println("|              5. Tìm kiếm                                |");
        System.out.println("|              0. Thoát                                   |");
        System.out.println("-----------------------------------------------------------");
    }
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<DichVu>dichVus = new ArrayList<>();
    public static void run() throws IOException {
        DichVu_DAL.DocFile(dichVus);
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner. nextLine());
            if(chon == 0)break;
            switch (chon){
                case 1:
                    DichVu_BLL.Nhap(dichVus);
                    DichVu_DAL.GhiFile(dichVus);
                    break;
                case 2:
                    DichVu_BLL.Hien(dichVus);
                    break;
                case 3:
                    DichVu_BLL.Sua(dichVus);
                    DichVu_DAL.GhiFile(dichVus);
                    break;
                case 4:
                    DichVu_BLL.Xoa(dichVus);
                    DichVu_DAL.GhiFile(dichVus);
                    break;
                case 5:
                    DichVu_BLL.timKiem(dichVus);
                    break;
                default:break;
            }
        }
    }
}
