/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThuyVT
 */
public class KhoaNganh {
    private String maKn;
    private String tenKn;

    public KhoaNganh(String maKn, String tenKn) {
        this.maKn = maKn;
        this.tenKn = tenKn;
    }

    public KhoaNganh() {
    }

    public String getMaKn() {
        return maKn;
    }

    public void setMaKn(String maKn) {
        this.maKn = maKn;
    }

    public String getTenKn() {
        return tenKn;
    }

    public void setTenKn(String tenKn) {
        this.tenKn = tenKn;
    }

    @Override
    public String toString() {
        return tenKn;
    }
    
}
