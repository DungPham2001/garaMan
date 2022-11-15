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
public class KyThuat {
    private NhanVien nhanVien;
    private List<ViecGiao> listViecGiao;

    public KyThuat() {
    }

    public KyThuat(NhanVien nhanVien, List<ViecGiao> listViecGiao) {
        this.nhanVien = nhanVien;
        this.listViecGiao = listViecGiao;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public List<ViecGiao> getListViecGiao() {
        return listViecGiao;
    }

    public void setListViecGiao(List<ViecGiao> listViecGiao) {
        this.listViecGiao = listViecGiao;
    }
    
    
}
