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
public class NhaCungCapTK {
    private NhaCungCap nhaCungCap;
    private Double tongTien;
    private int soLanNhap;

    public NhaCungCapTK() {
    }

    public NhaCungCapTK(NhaCungCap nhaCungCap, Double tongTien, int soLanNhap) {
        this.nhaCungCap = nhaCungCap;
        this.tongTien = tongTien;
        this.soLanNhap = soLanNhap;
    }

    public NhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLanNhap() {
        return soLanNhap;
    }

    public void setSoLanNhap(int soLanNhap) {
        this.soLanNhap = soLanNhap;
    }
    
    
}
