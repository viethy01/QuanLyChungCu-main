package com.company.BLL;

import com.company.Entities.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang_BLL {
    static Scanner scanner= new Scanner(System.in);
//    makh+"#"+hoten+"#"+gioitinh+"#"+maphong+"#"+ngaysinh+"#"+diachi;
    public static void Nhap(ArrayList<KhachHang>khachHangs){
        //hàm nhập thông tin khách hàng
        System.out.println("Nhập mã khách hàng");
        String makh = scanner.nextLine();
        System.out.println("Nhập họ tên");
        String hoten = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gioitinh = scanner.nextLine();
        System.out.println("Nhập mã phòng");
        String maphong = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String ngaysinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String diachi = scanner.nextLine();
        //thêm đối tượng khách hàng vừa nhập vào danh sách mảng
        khachHangs.add(new KhachHang(makh,hoten,gioitinh,maphong,ngaysinh,diachi));
    }
    public static void display(KhachHang khachHang){
        //hiện thông tin khách hàng
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n",khachHang.getMakh(),khachHang.getHoten(),khachHang.getGioitinh(),khachHang.getMaphong(),khachHang.getNgaysinh(),khachHang.getDiachi());
    }
    public static void Hien(ArrayList<KhachHang>khachHangs){
        //hiện danh sách khách hàng
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n","Mã khách hàng","HỌ tên","Giới tính","Mã phòng","Ngày sinh","Địa chỉ");
        for (KhachHang khachHang:khachHangs
             ) {
            display(khachHang);
        }
    }
    public static KhachHang find(ArrayList<KhachHang>khachHangs,String keyword){
        KhachHang ketqua = null;
        for (KhachHang khachHang:
             khachHangs) {
            if(khachHang.getMakh().equalsIgnoreCase(keyword)||khachHang.getHoten().equalsIgnoreCase(keyword)){
                ketqua = khachHang;
            }
        }
        return ketqua;
    }
    public static void timKiem(ArrayList<KhachHang>khachHangs){
        System.out.println("Nhập mã hoặc họ tên khách hàng");
        String keyword = scanner.nextLine();
        KhachHang khachHang = find(khachHangs,keyword);
        if(khachHang == null){
            System.out.println("Không tìm thấy");
        }
        else{
            display(khachHang);
        }
    }
    public static void Xoa(ArrayList<KhachHang>khachHangs){
        System.out.println("Nhập mã hoặc họ tên khách hàng");
        String keyword = scanner.nextLine();
        KhachHang khachHang = find(khachHangs,keyword);
        if(khachHang == null){
            System.out.println("Không tìm thấy");
        }
        else{
           khachHangs.remove(khachHang);
        }
    }
    public static void Sua(ArrayList<KhachHang>khachHangs){
        System.out.println("Nhập mã hoặc họ tên khách hàng");
        String keyword = scanner.nextLine();
        KhachHang khachHang = find(khachHangs,keyword);
        if(khachHang == null){
            System.out.println("Không tìm thấy");
        }
        else{
            System.out.println("Nhập mã khách hàng");
            khachHang.setMakh(scanner.nextLine());
            System.out.println("Nhập họ tên");
            khachHang.setHoten(scanner.nextLine());
            System.out.println("Nhập giới tính");
            khachHang.setGioitinh(scanner.nextLine());
            System.out.println("Nhập mã phòng");
            khachHang.setMaphong(scanner.nextLine());
            System.out.println("Nhập ngày sinh");
            khachHang.setNgaysinh(scanner.nextLine());
            System.out.println("Nhập địa chỉ");
            khachHang.setDiachi(scanner.nextLine());
        }
    }
}
