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
public class HoaDonNhapChiTiet {
    private int soLuong;
    private Double gia;

    public HoaDonNhapChiTiet() {
    }

    public HoaDonNhapChiTiet(int soLuong, Double gia) {
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
    
}
