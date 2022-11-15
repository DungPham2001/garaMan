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
public class PhuTung {
    private int idPhuTung;
    private String tenPT;
    private Double gia;
    private int soLuong;
    private String moTa;
    private List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet;
    private List<DonDatPhuTung> listDonDatPhuTung;

    public PhuTung() {
    }

    public PhuTung(int idPhuTung, String tenPT, Double gia, int soLuong, String moTa, List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet, List<DonDatPhuTung> listDonDatPhuTung) {
        this.idPhuTung = idPhuTung;
        this.tenPT = tenPT;
        this.gia = gia;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.listHoaDonNhapChiTiet = listHoaDonNhapChiTiet;
        this.listDonDatPhuTung = listDonDatPhuTung;
    }

    public int getIdPhuTung() {
        return idPhuTung;
    }

    public void setIdPhuTung(int idPhuTung) {
        this.idPhuTung = idPhuTung;
    }

    public String getTenPT() {
        return tenPT;
    }

    public void setTenPT(String tenPT) {
        this.tenPT = tenPT;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public List<HoaDonNhapChiTiet> getListHoaDonNhapChiTiet() {
        return listHoaDonNhapChiTiet;
    }

    public void setListHoaDonNhapChiTiet(List<HoaDonNhapChiTiet> listHoaDonNhapChiTiet) {
        this.listHoaDonNhapChiTiet = listHoaDonNhapChiTiet;
    }

    public List<DonDatPhuTung> getListDonDatPhuTung() {
        return listDonDatPhuTung;
    }

    public void setListDonDatPhuTung(List<DonDatPhuTung> listDonDatPhuTung) {
        this.listDonDatPhuTung = listDonDatPhuTung;
    }
    
    
}
