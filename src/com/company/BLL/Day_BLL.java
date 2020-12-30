package com.company.BLL;

import com.company.Entities.Day;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_BLL {
    static Scanner scanner= new Scanner(System.in);
//    String tenday, String maday
    public static void Nhap(ArrayList<Day>days){
        //hàm nhập thông tin dãy
        System.out.println("Nhập tên dãy");
        String tenday = scanner.nextLine();
        System.out.println("Nhập mã dãy");
        String maday = scanner.nextLine();

        //thêm đối tượng dãy vừa nhập vào danh sách mảng
        days.add(new Day(tenday,maday));
    }
    public static void display(Day day){
        //hiện thông tin dãy
        System.out.printf("|%-20s|%-20s|\n",day.getTenday(),day.getMaday());
    }
    public static void Hien(ArrayList<Day>days){
        //hiện danh sách dãy
        System.out.printf("|%-20s|%-20s|\n","Tên dãy","Mã dãy");
        for (Day day:days
        ) {
            display(day);
        }
    }
    public static Day find(ArrayList<Day>days,String keyword){
        Day ketqua = null;
        for (Day day:
                days) {
            if(day.getMaday().equalsIgnoreCase(keyword)||day.getTenday().equalsIgnoreCase(keyword)){
                ketqua = day;
            }
        }
        return ketqua;
    }
    public static void timKiem(ArrayList<Day>days){
        System.out.println("Nhập mã hoặc  tên dãy");
        String keyword = scanner.nextLine();
        Day day = find(days,keyword);
        if(day == null){
            System.out.println("Không tìm thấy");
        }
        else{
            display(day);
        }
    }
    public static void Xoa(ArrayList<Day>days){
        System.out.println("Nhập mã hoặc  tên dãy");
        String keyword = scanner.nextLine();
        Day day = find(days,keyword);
        if(day == null){
            System.out.println("Không tìm thấy");
        }
        else{
            days.remove(day);
        }
    }
    public static void Sua(ArrayList<Day>days){
        System.out.println("Nhập mã hoặc  tên dãy");
        String keyword = scanner.nextLine();
        Day day = find(days,keyword);
        if(day == null){
            System.out.println("Không tìm thấy");
        }
        else{
            System.out.println("Nhập tên dãy");
            day.setTenday(scanner.nextLine());
            System.out.println("Nhập mã");
            day.setMaday(scanner.nextLine());
        }
    }
}
