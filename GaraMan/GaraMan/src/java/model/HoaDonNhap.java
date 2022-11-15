/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author Chuong
 */
public class HoaDonNhap {
    private int idHoaDonNhap;
    private Date ngayNhap;
    private int soLuong;
    private Double tongTien;
    private List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet;

    public HoaDonNhap() {
    }

    public HoaDonNhap(int idHoaDonNhap, Date ngayNhap, int soLuong, Double tongTien, List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet) {
        this.idHoaDonNhap = idHoaDonNhap;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.listHoaDonNhapChiTiet = listHoaDonNhapChiTiet;
    }

    public int getIdHoaDonNhap() {
        return idHoaDonNhap;
    }

    public void setIdHoaDonNhap(int idHoaDonNhap) {
        this.idHoaDonNhap = idHoaDonNhap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public List<HoaDonNhapChiTiet> getListHoaDonNhapChiTiet() {
        return listHoaDonNhapChiTiet;
    }

    public void setListHoaDonNhapChiTiet(List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet) {
        this.listHoaDonNhapChiTiet = listHoaDonNhapChiTiet;
    }
    
    
    
}
