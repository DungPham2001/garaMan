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
public class BanHang {
    private NhanVien nhanVien;
    private NguoiDung nguoiDung;
    private List<HoaDonTrucTiep> listHoaDonTrucTiep;

    public BanHang() {
    }

    public BanHang(NhanVien nhanVien, NguoiDung nguoiDung, List<HoaDonTrucTiep> listHoaDonTrucTiep) {
        this.nhanVien = nhanVien;
        this.nguoiDung = nguoiDung;
        this.listHoaDonTrucTiep = listHoaDonTrucTiep;
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

    public List<HoaDonTrucTiep> getListHoaDonTrucTiep() {
        return listHoaDonTrucTiep;
    }

    public void setListHoaDonTrucTiep(List<HoaDonTrucTiep> listHoaDonTrucTiep) {
        this.listHoaDonTrucTiep = listHoaDonTrucTiep;
    }
    
    
}
