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
public class GioHang {

    public IThanhToan hinhthucTT;
    public ArrayList<HangHoa> dsHH = new ArrayList<>();

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    public double thanhToan() {
        int tong = 0;
        for (int i = 0; i < dsHH.size(); i++) {
            tong += dsHH.get(i).getGia();
        }
        return hinhthucTT.thanhToan(tong);
    }

    public void them(HangHoa hh) {
        dsHH.add(hh);
    }

    public void inDS() {
        dsHH.forEach(hh -> System.out.println(hh.getThongTin()));
    }
}
