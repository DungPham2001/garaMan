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
public class NhaCungCap {
    private int idNhaCungCap;
    private String tenNCC,soDT,diaChi;
    private List<HoaDonNhap> listHoaDonNhap;

    public NhaCungCap() {
    }

    public NhaCungCap(int idNhaCungCap, String tenNCC, String soDT, String diaChi, List<HoaDonNhap> listHoaDonNhap) {
        this.idNhaCungCap = idNhaCungCap;
        this.tenNCC = tenNCC;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.listHoaDonNhap = listHoaDonNhap;
    }

    public int getIdNhaCungCap() {
        return idNhaCungCap;
    }

    public void setIdNhaCungCap(int idNhaCungCap) {
        this.idNhaCungCap = idNhaCungCap;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
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

    public List<HoaDonNhap> getListHoaDonNhap() {
        return listHoaDonNhap;
    }

    public void setListHoaDonNhap(List<HoaDonNhap> listHoaDonNhap) {
        this.listHoaDonNhap = listHoaDonNhap;
    }
    
    
}
