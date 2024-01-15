package w7.congty;

public class NhanVien {
    protected String tenNhanVien;
    protected  double luongCoBan;
    protected  double heSoLuong;
    public final double LUONG_MAX = 100_000_000;

    public static int soNhanVien = 0;

    public NhanVien(){

    }

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
        soNhanVien++;
    }
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soNhanVien++;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public static int getSoNhanVien() {
        return soNhanVien;
    }

    public static void setSoNhanVien(int soNhanVien) {
        NhanVien.soNhanVien = soNhanVien;
    }

    public boolean tangLuong(double tang) {
        if (tang + luongCoBan > LUONG_MAX) return false;
        luongCoBan += tang;
        return true;
    }

    public double tinhLuong() {
        return heSoLuong * luongCoBan;
    }

    public void inTTin() {
        System.out.println("------------------------------------");
        System.out.println("Tên nhân viên: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println("Lương: " + this.tinhLuong());
    }

    public static double tinhTongLuong(NhanVien... nhanViens) {
        double tongLuong = 0;
        for (NhanVien nhanVien : nhanViens) {
            tongLuong += nhanVien.tinhLuong();
        }
        return tongLuong;
    }

    public static double tinhTongLuong(NhanVien []nhanViens, int length) {
        double tongLuong = 0;
        for (int i = 0; i < length; i++) {
            tongLuong += nhanViens[i].tinhLuong();
        }
        return tongLuong;
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Hoa", 2000_000, 1.5);
        nv1.inTTin();
        nv1.tangLuong(2000_000);
        nv1.inTTin();
        NhanVien nv2 = new NhanVien("Mai", 3000_000, 1.3);
        System.out.println(NhanVien.tinhTongLuong(nv1));
        System.out.println(NhanVien.tinhTongLuong(nv1, nv2));
        NhanVien[] nhanViens = {nv1, nv2};
        System.out.println(NhanVien.tinhTongLuong(nhanViens));
    }
}
