package com.company.BLL;

import com.company.Entities.DichVu;

import java.util.ArrayList;
import java.util.Scanner;

public class DichVu_BLL {
    static Scanner scanner= new Scanner(System.in);
//    String madv, String maphong, int songuoi, int chisokwh, int chiso1m3
    public static void Nhap(ArrayList<DichVu>dichVus){
        //hàm nhập thông tin dịch vụ
        System.out.println("Nhập mã dịch vụ");
        String madv = scanner.nextLine();
        System.out.println("Nhập mã phòng");
        String maphong = scanner.nextLine();
        System.out.println("Nhập số người");
        int songuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số kwh");
        int chisokw= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số mét khổi nước");
       int chiso1m3 = Integer.parseInt(scanner.nextLine());
        //thêm đối tượng dịch vụ vừa nhập vào danh sách mảng
        dichVus.add(new DichVu(madv,maphong,songuoi,chisokw,chiso1m3));
    }
    public static void display(DichVu dichVu){
        //hiện thông tin dịch vụ
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n",dichVu.getMadv(),dichVu.getMaphong(),dichVu.getSonguoi(),dichVu.getChisokwh(),dichVu.getChiso1m3());
    }
    public static void Hien(ArrayList<DichVu>dichVus){
        //hiện danh sách dịch vụ
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã dịch vụ","Mã phòng","Số người","Chỉ số kwh","Chỉ số nước");
        for (DichVu dichVu:dichVus
        ) {
            display(dichVu);
        }
    }
    public static DichVu find(ArrayList<DichVu>dichVus,String keyword){
        DichVu ketqua = null;
        for (DichVu dichVu:
                dichVus) {
            if(dichVu.getMadv().equalsIgnoreCase(keyword)||dichVu.getMaphong().equalsIgnoreCase(keyword)){
                ketqua = dichVu;
            }
        }
        return ketqua;
    }
    public static void timKiem(ArrayList<DichVu>dichVus){
        System.out.println("Nhập mã hoặc họ tên dịch vụ");
        String keyword = scanner.nextLine();
        DichVu dichVu = find(dichVus,keyword);
        if(dichVu == null){
            System.out.println("Không tìm thấy");
        }
        else{
            display(dichVu);
        }
    }
    public static void Xoa(ArrayList<DichVu>dichVus){
        System.out.println("Nhập mã hoặc họ tên dịch vụ");
        String keyword = scanner.nextLine();
        DichVu dichVu = find(dichVus,keyword);
        if(dichVu == null){
            System.out.println("Không tìm thấy");
        }
        else{
            dichVus.remove(dichVu);
        }
    }
    public static void Sua(ArrayList<DichVu>dichVus){
        System.out.println("Nhập mã hoặc họ tên dịch vụ");
        String keyword = scanner.nextLine();
        DichVu dichVu = find(dichVus,keyword);
        if(dichVu == null){
            System.out.println("Không tìm thấy");
        }
        else{
            System.out.println("Nhập mã dịch vụ");
            dichVu.setMadv(scanner.nextLine());
            System.out.println("Nhập mã phòng");
            dichVu.setMaphong(scanner.nextLine());
            System.out.println("Nhập số người");
            dichVu.setSonguoi(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập số kwh");
            dichVu.setChisokwh(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập số mét khổi nước");
            dichVu.setChiso1m3(Integer.parseInt(scanner.nextLine()));
        }
    }
}
