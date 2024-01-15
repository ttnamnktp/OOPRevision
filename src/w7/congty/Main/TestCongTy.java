package w7.congty.Main;

import w7.congty.*;

public class TestCongTy {
    public static void main(String[] args) {

        final int lOI_NHUAN_CONG_TY = 1000_000_000;

        NhanVien nv1 = new NhanVien("Hoa", 5000_000, 1.5);
        NhanVien nv2 = new NhanVien("Mai", 6000_000, 1.5);
        GiamDoc gd1 = new GiamDoc("Tuấn", 10_000_000, 2, 3000_000, lOI_NHUAN_CONG_TY);
        TruongPhong tp1 = new TruongPhong("Minh", 8000_000, 1.5, 3000_000, 4);
        CanBoQuanLy cb1 = new CanBoQuanLy("Rong", 8000_000, 1.5, 3000_000);
        nv1.inTTin();
        nv2.inTTin();
        gd1.inTTin();
        tp1.inTTin();
        cb1.inTTin();
    }
}
