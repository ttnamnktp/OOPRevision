package w8;

public abstract class NhanVien {
    private String tenNhanVien;
    public final double LUONG_MAX = 100_000_000;
    public static int soNhanVien = 0;

    public NhanVien(){

    }

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
        soNhanVien++;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public static int getSoNhanVien() {
        return soNhanVien;
    }

    public static void setSoNhanVien(int soNhanVien) {
        NhanVien.soNhanVien = soNhanVien;
    }

    public abstract double tinhLuong();

    public void inTTin() {
        System.out.println("Tên nhân viên: " + this.tenNhanVien);
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
}
