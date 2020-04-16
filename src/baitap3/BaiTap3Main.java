/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DangHoaiPhong
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
        QLSV qlsv = new QLSV();
        SinhVien sv1 = new SinhVien("Dang Hoai Phong", fd.parse("13/11/1999"), 8);
        SinhVien sv2 = new SinhVien("Nguyen Van A", fd.parse("1/1/1999"), 6);

        //them sinh vien
        qlsv.them(sv1);
        qlsv.them(sv2);

        //sap xep theo ten
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("\n" + "Sap xep theo ten");
        qlsv.inDS();

        //sap xep theo diem
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("\n" + "Sap xep theo diem");
        qlsv.inDS();
    }

}
