package com.company.Entities;

public class Day {
    //tạo thuộc tính
    private String tenday;
    private String maday;

    //ghi đề phương thức toString
    @Override
    public String toString(){
        return tenday+"#"+maday;
    }
    public String getTenday() {
        return tenday;
    }

    public void setTenday(String tenday) {
        this.tenday = tenday;
    }

    public String getMaday() {
        return maday;
    }

    public void setMaday(String maday) {
        this.maday = maday;
    }

    //phương thức khởi tạo
    public Day(String tenday, String maday) {
        this.tenday = tenday;
        this.maday = maday;
    }
}
