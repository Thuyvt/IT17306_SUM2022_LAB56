/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Sinhvien;
import Repository.SinhvienRepository;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class SinhvienService {
    SinhvienRepository repo = new SinhvienRepository();

    public SinhvienService() {
    }
    
    public List<Sinhvien> getListSinhVienDb() {
        return repo.getListSinhVien();
    }
    
    public  List<Sinhvien> getListSinhVienByKnDb(String makn) {
        return repo.getListSinhVienByKn(makn);
    }
    
    public  String saveSinhvienToDb(Sinhvien sv) {
        return repo.saveSinhvienToDb(sv);
    }
    
}
