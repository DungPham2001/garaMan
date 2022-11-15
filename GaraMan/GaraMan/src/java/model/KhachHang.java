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
public class KhachHang {
    private int idKhachHang;
    private String tenKH,soDT,diaChi;
    private NguoiDung nguoiDung;
    private List<LichHen> listLichHen;
    private List<DonDat> listDonDat;

    public KhachHang() {
    }

    public KhachHang(int idKhachHang, String tenKH, String soDT, String diaChi, NguoiDung nguoiDung, List<LichHen> listLichHen, List<DonDat> listDonDat) {
        this.idKhachHang = idKhachHang;
        this.tenKH = tenKH;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.nguoiDung = nguoiDung;
        this.listLichHen = listLichHen;
        this.listDonDat = listDonDat;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public List<LichHen> getListLichHen() {
        return listLichHen;
    }

    public void setListLichHen(List<LichHen> listLichHen) {
        this.listLichHen = listLichHen;
    }

    public List<DonDat> getListDonDat() {
        return listDonDat;
    }

    public void setListDonDat(List<DonDat> listDonDat) {
        this.listDonDat = listDonDat;
    }

   
}
