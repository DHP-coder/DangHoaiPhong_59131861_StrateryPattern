/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.ArrayList;

/**
 *
 * @author DangHoaiPhong
 */
public class QLSV {

    public ArrayList<SinhVien> dsSV = new ArrayList<>();
    public ISoSanh soSanh;

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    public void them(SinhVien sv) {
        dsSV.add(sv);
    }

    public void sapXep() {
        dsSV.sort((a, b) -> soSanh.soSanh((SinhVien) a, (SinhVien) b));
    }

    public void inDS() {
        dsSV.forEach(sv -> System.out.println(sv.getThongTin()));
    }
}
