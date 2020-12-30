package com.company.GUI;

import com.company.BLL.Day_BLL;
import com.company.DAL.Day_DAL;
import com.company.Entities.Day;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day_GUI {
    private static void Menu(){
        System.out.println("==========================================================");
        System.out.println("|                     QUẢN LÝ DÃY                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|              1. Nhập thông DÃY                          |");
        System.out.println("|              2. Hiện thông tin                          |");
        System.out.println("|              3. Cập nhật thông tin                      |");
        System.out.println("|              4. Xóa thông tin                           |");
        System.out.println("|              5. Tìm kiếm                                |");
        System.out.println("|              0. Thoát                                   |");
        System.out.println("-----------------------------------------------------------");
    }
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Day>days = new ArrayList<>();
    public static void run() throws IOException {
        Day_DAL.DocFile(days);
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner. nextLine());
            if(chon == 0)break;
            switch (chon){
                case 1:
                    Day_BLL.Nhap(days);
                    Day_DAL.GhiFile(days);
                    break;
                case 2:
                    Day_BLL.Hien(days);
                    break;
                case 3:
                    Day_BLL.Sua(days);
                    Day_DAL.GhiFile(days);
                    break;
                case 4:
                    Day_BLL.Xoa(days);
                    Day_DAL.GhiFile(days);
                    break;
                case 5:
                    Day_BLL.timKiem(days);
                    break;
                default:break;
            }
        }
    }
}
