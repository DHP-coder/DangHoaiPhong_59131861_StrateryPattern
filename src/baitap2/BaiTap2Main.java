/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author DangHoaiPhong
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThanhToanOnline thanhToanOnline = new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        HangHoa hh1 = new HangHoa("Dien thoai ViVo", 2100000, "Version Y91C");
        HangHoa hh2 = new HangHoa("Chuot Gaming", 200000, "T-Wolf");

        System.out.println("Danh sach mat hang thanh toan online:\n");
        GioHang gh1 = new GioHang();
        gh1.setHinhthucTT(thanhToanOnline);
        gh1.them(hh1);
        gh1.them(hh2);
        gh1.inDS();
        System.out.println("Thanh toan online:" + gh1.thanhToan());

        System.out.println("\nDanh sach mat hang thanh toan COD:\n");
        GioHang gh2 = new GioHang();
        gh2.setHinhthucTT(thanhToanCOD);
        gh2.them(hh1);
        gh2.them(hh2);
        gh2.inDS();
        System.out.println("Thanh toan COD:" + gh2.thanhToan());
    }

}
