package com.company.GUI;

import com.company.BLL.KhachHang_BLL;
import com.company.DAL.KhachHang_DAL;
import com.company.Entities.KhachHang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang_GUI {
    private static void Menu(){
        System.out.println("==========================================================");
        System.out.println("|                     QUẢN LÝ KHÁCH HÀNG                  |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|              1. Nhập thông khách hàng                   |");
        System.out.println("|              2. Hiện thông tin                          |");
        System.out.println("|              3. Cập nhật thông tin                      |");
        System.out.println("|              4. Xóa thông tin                           |");
        System.out.println("|              5. Tìm kiếm                                |");
        System.out.println("|              0. Thoát                                   |");
        System.out.println("-----------------------------------------------------------");
    }
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<KhachHang>khachHangs = new ArrayList<>();
    public static void run() throws IOException {
        KhachHang_DAL.DocFile(khachHangs);
        int chon;
        while(true){
            Menu();
            chon = Integer.parseInt(scanner. nextLine());
            if(chon == 0)break;
            switch (chon){
                case 1:
                    KhachHang_BLL.Nhap(khachHangs);
                    KhachHang_DAL.GhiFile(khachHangs);
                    break;
                case 2:
                    KhachHang_BLL.Hien(khachHangs);
                    break;
                case 3:
                    KhachHang_BLL.Sua(khachHangs);
                    KhachHang_DAL.GhiFile(khachHangs);
                    break;
                case 4:
                    KhachHang_BLL.Xoa(khachHangs);
                    KhachHang_DAL.GhiFile(khachHangs);
                    break;
                case 5:
                    KhachHang_BLL.timKiem(khachHangs);
                    break;
                default:break;
            }
        }
    }
}
