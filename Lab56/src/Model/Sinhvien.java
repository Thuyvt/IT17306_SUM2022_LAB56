/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThuyVT
 */
public class Sinhvien {
    private String maSv;
    private String tenSv;
    private String maKn;
    private String sdt;
    private String email;

    public Sinhvien() {
    }

    public Sinhvien(String maSv, String tenSv, String maKn, String sdt, String email) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.maKn = maKn;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getMaKn() {
        return maKn;
    }

    public void setMaKn(String maKn) {
        this.maKn = maKn;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
