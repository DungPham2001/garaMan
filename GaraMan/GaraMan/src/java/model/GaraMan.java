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
public class GaraMan {
    private int idGaraMan;
    private String ten,diaChi;
    private List<NhanVien> listNhanVien;
    private String soDT;

    public GaraMan() {
    }

    public GaraMan(int idGaraMan, String ten, String diaChi, List<NhanVien> listNhanVien, String soDT) {
        this.idGaraMan = idGaraMan;
        this.ten = ten;
        this.diaChi = diaChi;
        this.listNhanVien = listNhanVien;
        this.soDT = soDT;
    }

    public int getIdGaraMan() {
        return idGaraMan;
    }

    public void setIdGaraMan(int idGaraMan) {
        this.idGaraMan = idGaraMan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
    
}
