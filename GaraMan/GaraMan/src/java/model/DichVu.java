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
public class DichVu {
    private int idDichVu;
    private String tenDV;
    private Double gia;
    private String moTa;
    private List<DonDatDichVu> listDonDatDichVu;

    public DichVu() {
    }

    public DichVu(int idDichVu, String tenDV, Double gia, String moTa, List<DonDatDichVu> listDonDatDichVu) {
        this.idDichVu = idDichVu;
        this.tenDV = tenDV;
        this.gia = gia;
        this.moTa = moTa;
        this.listDonDatDichVu = listDonDatDichVu;
    }

    public int getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(int idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public List<DonDatDichVu> getListDonDatDichVu() {
        return listDonDatDichVu;
    }

    public void setListDonDatDichVu(List<DonDatDichVu> listDonDatDichVu) {
        this.listDonDatDichVu = listDonDatDichVu;
    }
    
    
}
