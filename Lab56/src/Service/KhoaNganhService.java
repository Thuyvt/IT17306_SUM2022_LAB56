/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhoaNganh;
import Model.Sinhvien;
import Repository.KhoaNganhRepository;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class KhoaNganhService {
    KhoaNganhRepository repo = new KhoaNganhRepository();

    public KhoaNganhService() {
    }
    
    public List<KhoaNganh> getAllKhoaNganh() {
        return repo.getListKhoaNganh();
    }
}
