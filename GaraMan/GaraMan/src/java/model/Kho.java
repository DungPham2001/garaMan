/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Chuong
 */
public class Kho {
    private NhanVien nhanVien;
    private NguoiDung nguoiDung;
    private List<HoaDonNhap> listHoaDonNhap;

    public Kho() {
    }

    public Kho(NhanVien nhanVien, NguoiDung nguoiDung, List<HoaDonNhap> listHoaDonNhap) {
        this.nhanVien = nhanVien;
        this.nguoiDung = nguoiDung;
        this.listHoaDonNhap = listHoaDonNhap;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public List<HoaDonNhap> getListHoaDonNhap() {
        return listHoaDonNhap;
    }

    public void setListHoaDonNhap(List<HoaDonNhap> listHoaDonNhap) {
        this.listHoaDonNhap = listHoaDonNhap;
    }
    
    
}
