/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Sinhvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class SinhvienRepository {
    DBConnection dbConnection;
    ResultSet rs = null;
    PreparedStatement pts = null;
    List<Sinhvien> listSv = null; 

    public SinhvienRepository() {
    }
    
    public List<Sinhvien> getListSinhVien() {
        String select = "SELECT masv, hoten,makn, dienthoai,email FROM SINHVIEN";
        listSv = new ArrayList<>();
        try {
            pts = dbConnection.openDbConnection().prepareStatement(select);
            rs = pts.executeQuery();
            while (rs.next()) {
                listSv.add(new Sinhvien(rs.getString(1), rs.getNString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSv;
         
    }
    // TIM SINH VIEN THEO MAKN
    public List<Sinhvien> getListSinhVienByKn(String makn) {
        String select = "SELECT masv, hoten,makn, dienthoai,email FROM SINHVIEN where makn = ?";
        listSv = new ArrayList<>();
        try {
            pts = dbConnection.openDbConnection().prepareStatement(select);
            pts.setString(1, makn);
            rs = pts.executeQuery();
            while (rs.next()) {
                listSv.add(new Sinhvien(rs.getString(1), rs.getNString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listSv;
         
    }
    
    // LUU SINH VIEN
    public String saveSinhvienToDb(Sinhvien sv) {
        String insert = "INSERT INTO SINHVIEN(masv, hoten,makn, dienthoai,email)"
                + " VALUES(?,?,?,?,?)";
        listSv = new ArrayList<>();
        try {
            pts = dbConnection.openDbConnection().prepareStatement(insert);
            pts.setString(1, sv.getMaSv());
            pts.setNString(2, sv.getTenSv());
            pts.setString(3, sv.getMaKn());
            pts.setString(4, sv.getSdt());
            pts.setString(5, sv.getEmail());

            rs = pts.executeQuery();
            while (rs.next()) {
                listSv.add(new Sinhvien(rs.getString(1), rs.getNString(2), 
                        rs.getString(3), rs.getString(4), rs.getString(5)));
            }
            return "Luu thanh cong";
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Luu that bai";
         
    }
    
    
}
