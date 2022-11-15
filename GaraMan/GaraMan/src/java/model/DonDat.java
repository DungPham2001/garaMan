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
public class DonDat {
    private int idDonDat;
    private Date ngayDat;
    private int soLuong;
    private List<DonDatDichVu> listDonDatDichVu;
    private List<DonDatPhuTung> listDonDatPhuTung;
    private List<ViecGiao> listViecGiao;

    public DonDat() {
    }

    public DonDat(int idDonDat, Date ngayDat, int soLuong, List<DonDatDichVu> listDonDatDichVu, List<DonDatPhuTung> listDonDatPhuTung, List<ViecGiao> listViecGiao) {
        this.idDonDat = idDonDat;
        this.ngayDat = ngayDat;
        this.soLuong = soLuong;
        this.listDonDatDichVu = listDonDatDichVu;
        this.listDonDatPhuTung = listDonDatPhuTung;
        this.listViecGiao = listViecGiao;
    }

    public int getIdDonDat() {
        return idDonDat;
    }

    public void setIdDonDat(int idDonDat) {
        this.idDonDat = idDonDat;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public List<DonDatDichVu> getListDonDatDichVu() {
        return listDonDatDichVu;
    }

    public void setListDonDatDichVu(List<DonDatDichVu> listDonDatDichVu) {
        this.listDonDatDichVu = listDonDatDichVu;
    }

    public List<DonDatPhuTung> getListDonDatPhuTung() {
        return listDonDatPhuTung;
    }

    public void setListDonDatPhuTung(List<DonDatPhuTung> listDonDatPhuTung) {
        this.listDonDatPhuTung = listDonDatPhuTung;
    }

    public List<ViecGiao> getListViecGiao() {
        return listViecGiao;
    }

    public void setListViecGiao(List<ViecGiao> listViecGiao) {
        this.listViecGiao = listViecGiao;
    }
    
    
}
