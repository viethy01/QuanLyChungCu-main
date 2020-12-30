package com.company.Entities;

public class KhachHang {
    private String makh,hoten,gioitinh,maphong,ngaysinh,diachi;

    @Override
    public String toString(){
        return  makh+"#"+hoten+"#"+gioitinh+"#"+maphong+"#"+ngaysinh+"#"+diachi;
    }
    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public KhachHang(String makh, String hoten, String gioitinh, String maphong, String ngaysinh, String diachi) {
        this.makh = makh;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.maphong = maphong;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
}
