package com.company.Entities;

public class DichVu {
    private String madv,maphong;
    private int songuoi;
    private int chisokwh;

    public DichVu(String madv, String maphong, int songuoi, int chisokwh, int chiso1m3) {
        this.madv = madv;
        this.maphong = maphong;
        this.songuoi = songuoi;
        this.chisokwh = chisokwh;
        this.chiso1m3 = chiso1m3;
    }

    private int chiso1m3;

    @Override
    public String toString(){
        return madv+"#"+maphong+"#"+songuoi+"#"+chisokwh+"#"+chiso1m3;
    }
    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public int getChisokwh() {
        return chisokwh;
    }

    public void setChisokwh(int chisokwh) {
        this.chisokwh = chisokwh;
    }

    public int getChiso1m3() {
        return chiso1m3;
    }

    public void setChiso1m3(int chiso1m3) {
        this.chiso1m3 = chiso1m3;
    }
}
