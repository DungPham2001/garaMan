/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Chuong
 */
public class KhachHangTK {

    private KhachHang khachHang;
    private int soDonDat;
    private Double doanhThu;
    
    public KhachHangTK() {
    }

    public KhachHangTK(KhachHang khachHang, int soDonDat, Double doanhThu) {
        this.khachHang = khachHang;
        this.soDonDat = soDonDat;
        this.doanhThu = doanhThu;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getSoDonDat() {
        return soDonDat;
    }

    public void setSoDonDat(int soDonDat) {
        this.soDonDat = soDonDat;
    }

    public Double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
