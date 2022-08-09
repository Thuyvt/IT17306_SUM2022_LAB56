/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.KhoaNganh;
import Model.Sinhvien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThuyVT
 */
public class KhoaNganhRepository {
    DBConnection dbConnection;
    ResultSet rs = null;
    Statement st = null;
    List<KhoaNganh> listKn = null;

    public KhoaNganhRepository() {
    }
    
    public List<KhoaNganh> getListKhoaNganh() {
        String select = "SELECT * FROM KHOANGANH";
        listKn = new ArrayList<>();
        try {
            st = dbConnection.openDbConnection().createStatement();
            rs = st.executeQuery(select);
            while (rs.next()) {
                listKn.add(new KhoaNganh(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SinhvienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listKn;
         
    }
}
