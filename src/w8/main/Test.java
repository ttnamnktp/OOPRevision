package w8.main;

import w8.*;

public class Test {

    public static void main(String[] args) {
        NhanVienCoHuu nv1 = new NhanVienCoHuu("Hoa", 2000_000, 1.5);
        nv1.inTTin();
        nv1.tangLuong(2000_000);
        nv1.inTTin();
        NhanVienCoHuu nv2 = new NhanVienCoHuu("Mai", 3000_000, 1.3);
        System.out.println(NhanVienCoHuu.tinhTongLuong(nv1));
        System.out.println(NhanVienCoHuu.tinhTongLuong(nv1, nv2));
        NhanVienCoHuu[] nhanViens = {nv1, nv2};
        System.out.println(NhanVienCoHuu.tinhTongLuong(nhanViens));
        NhanVienHopDong nv3 = new NhanVienHopDong("Hoa", 8000_000);
        TruongPhong tp1 = new TruongPhong("Tuấn", 5000_000, 1.5, 3000_000, 4);
        PhongBan pb1 = new PhongBan("Phòng kế tuấn");
        pb1.themNV(nv1);
        pb1.themNV(nv2);
        pb1.themNV(nv3);
        pb1.themNV(tp1);
        pb1.inTTin();
    }
}
