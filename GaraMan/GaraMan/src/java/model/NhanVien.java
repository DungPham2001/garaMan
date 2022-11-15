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
public class NhanVien {
    private int ID;
    private String soDT,diaChi,chucVu,tenNV,cccd;

    public NhanVien() {
    }

    public NhanVien(int ID, String soDT, String diaChi, String chucVu, String tenNV, String cccd) {
        this.ID = ID;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.tenNV = tenNV;
        this.cccd = cccd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    
    
}
