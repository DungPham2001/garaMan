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
public class DichVuTK {
    private DichVu dichVu;
    private int soDV;
    private Double doanhThuTuDV;
    private String danhGia;

    public DichVuTK() {
    }

    public DichVuTK(DichVu dichVu, int soDV, Double doanhThuTuDV, String danhGia) {
        this.dichVu = dichVu;
        this.soDV = soDV;
        this.doanhThuTuDV = doanhThuTuDV;
        this.danhGia = danhGia;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public int getSoDV() {
        return soDV;
    }

    public void setSoDV(int soDV) {
        this.soDV = soDV;
    }

    public Double getDoanhThuTuDV() {
        return doanhThuTuDV;
    }

    public void setDoanhThuTuDV(Double doanhThuTuDV) {
        this.doanhThuTuDV = doanhThuTuDV;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }
    
    
}
