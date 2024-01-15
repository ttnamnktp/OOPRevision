package w8;

public class TruongPhong extends NhanVienCoHuu {
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
        super.inTTin();
        System.out.println("So nam duong chuc: " + this.soNamDuongChuc);
    }
}
