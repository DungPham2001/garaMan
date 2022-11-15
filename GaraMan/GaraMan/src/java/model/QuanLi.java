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
public class QuanLi {
    private NguoiDung nguoiDung;
    private NhanVien nhanVien;

    public QuanLi() {
    }

    public QuanLi(NguoiDung nguoiDung, NhanVien nhanVien) {
        this.nguoiDung = nguoiDung;
        this.nhanVien = nhanVien;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    
}
