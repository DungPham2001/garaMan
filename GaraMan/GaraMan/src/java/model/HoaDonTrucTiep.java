/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Chuong
 */
public class HoaDonTrucTiep {
    private int idHoaDonTrucTiep;
    private Date ngay;
    private int tongSL;
    private Double tongGia;
    private DonDat donDat;

    public HoaDonTrucTiep() {
    }

    public HoaDonTrucTiep(int idHoaDonTrucTiep, Date ngay, int tongSL, Double tongGia, DonDat donDat) {
        this.idHoaDonTrucTiep = idHoaDonTrucTiep;
        this.ngay = ngay;
        this.tongSL = tongSL;
        this.tongGia = tongGia;
        this.donDat = donDat;
    }

    public int getIdHoaDonTrucTiep() {
        return idHoaDonTrucTiep;
    }

    public void setIdHoaDonTrucTiep(int idHoaDonTrucTiep) {
        this.idHoaDonTrucTiep = idHoaDonTrucTiep;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getTongSL() {
        return tongSL;
    }

    public void setTongSL(int tongSL) {
        this.tongSL = tongSL;
    }

    public Double getTongGia() {
        return tongGia;
    }

    public void setTongGia(Double tongGia) {
        this.tongGia = tongGia;
    }

    public DonDat getDonDat() {
        return donDat;
    }

    public void setDonDat(DonDat donDat) {
        this.donDat = donDat;
    }
    
    
}
