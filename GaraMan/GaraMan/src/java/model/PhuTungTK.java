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
public class PhuTungTK {
    private PhuTung phuTung;
    private int soPT;
    private Double doanhThuTuPT;
    private String danhGia;

    public PhuTungTK() {
    }

    public PhuTungTK(PhuTung phuTung, int soPT, Double doanhThuTuPT, String danhGia) {
        this.phuTung = phuTung;
        this.soPT = soPT;
        this.doanhThuTuPT = doanhThuTuPT;
        this.danhGia = danhGia;
    }

    public PhuTung getPhuTung() {
        return phuTung;
    }

    public void setPhuTung(PhuTung phuTung) {
        this.phuTung = phuTung;
    }

    public int getSoPT() {
        return soPT;
    }

    public void setSoPT(int soPT) {
        this.soPT = soPT;
    }

    public Double getDoanhThuTuPT() {
        return doanhThuTuPT;
    }

    public void setDoanhThuTuPT(Double doanhThuTuPT) {
        this.doanhThuTuPT = doanhThuTuPT;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    
    
}
