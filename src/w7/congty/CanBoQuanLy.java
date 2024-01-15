package w7.congty;

public class CanBoQuanLy extends NhanVien implements QuanLy {
    public double loiNhuanCongTy;

    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    public double tinhHoaHong() {
        return 0.002 * loiNhuanCongTy;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong();
    }

    @Override
    public void inTTin(){
        System.out.println("------------------------------------");
        System.out.println("Tên cán bộ: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println("Lương: " + this.tinhLuong());
    }
}

