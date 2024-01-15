package w7.congty;

public class GiamDoc extends NhanVien implements QuanLy {
    public double loiNhuanCongTy;
    private double phuCap;

    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    public double tinhHoaHong() {
        return 0.05 * loiNhuanCongTy;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + tinhHoaHong() + phuCap;
    }

    @Override
    public void inTTin(){
        System.out.println("------------------------------------");
        System.out.println("Tên giám đốc: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println("Lương: " + this.tinhLuong());
    }
}
