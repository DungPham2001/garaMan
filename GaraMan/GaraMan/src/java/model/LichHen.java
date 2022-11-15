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
public class LichHen {
    private int idLicHen;
    private Date thoiGian;
    
    public LichHen() {
    }

    public LichHen(int idLicHen, Date thoiGian) {
        this.idLicHen = idLicHen;
        this.thoiGian = thoiGian;
    }

    public int getIdLicHen() {
        return idLicHen;
    }

    public void setIdLicHen(int idLicHen) {
        this.idLicHen = idLicHen;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }
    
    
}
