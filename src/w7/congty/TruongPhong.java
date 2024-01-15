package w7.congty;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong() + phuCap;
    }

    @Override
    public void inTTin(){
        System.out.println("------------------------------------");
        System.out.println("Tên trưởng phòng: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println("Lương: " + this.tinhLuong());
        System.out.println("So nam duong chuc: " + this.soNamDuongChuc);
    }
}
