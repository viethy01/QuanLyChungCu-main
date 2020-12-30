package com.company.GUI;

import com.company.DAL.Day_DAL;
import com.company.DAL.DichVu_DAL;
import com.company.DAL.KhachHang_DAL;
import com.company.Entities.Day;
import com.company.Entities.DichVu;
import com.company.Entities.KhachHang;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private static void Menu() {
        System.out.println(".----------------------------------------------------.");
        System.out.println("|                  QUẢN LÝ CHUNG CƯ                  |");
        System.out.println("+----------------------------------------------------+");
        System.out.println("|               1.QUẢN LÝ KHÁCH HÀNG                  |");
        System.out.println("|               2.QUẢN LÝ DỊCH VỤ                    |");
        System.out.println("|               3.QUẢN LÝ DÃY NHÀ                    |");
        System.out.println("|               0.Thoát                              |");
        System.out.println(".----------------------------------------------------.");
    }
    static ArrayList<Day> days = new ArrayList<>();
    static ArrayList<KhachHang> khachHangs = new ArrayList<>();
    static ArrayList<DichVu> dichVus = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void Run() throws IOException {
        Day_DAL.DocFile(days);
        DichVu_DAL.DocFile(dichVus);
        KhachHang_DAL.DocFile(khachHangs);

        int chon;
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 0) break;
            switch (chon) {
                case 1:
                    KhachHang_GUI.run();
                    break;
                case 2:
                    DichVu_GUI.run();
                    break;
                case 3:
                    Day_GUI.run();
                    break;
                default:break;
            }
        }
    }
}
