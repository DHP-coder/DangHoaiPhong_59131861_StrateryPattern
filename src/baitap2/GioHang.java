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
    public ArrayList<HangHoa> hh;

    public void setHinhthucTT(IThanhToan hinhthucTT) {
        this.hinhthucTT = hinhthucTT;
    }

    public void setHh(ArrayList<HangHoa> hh) {
        this.hh = hh;
    }
    
    public double thanhToan(){
        int tong =0;
        for(int i=0;i<hh.size();i++){
            tong += hh.get(i).getGia();
        }
        return hinhthucTT.thanhToan(tong);
    }
}
