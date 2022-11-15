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
public class ViecGiao {
    private int soLuongNV;
    private String trangThai;

    public ViecGiao() {
    }

    public ViecGiao(int soLuongNV, String trangThai) {
        this.soLuongNV = soLuongNV;
        this.trangThai = trangThai;
    }

    public int getSoLuongNV() {
        return soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
