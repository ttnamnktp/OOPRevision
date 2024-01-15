package w8;

public class NhanVienCoHuu extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienCoHuu(String tenNhanVien) {
        super(tenNhanVien);
    }

    public NhanVienCoHuu(double luongCoBan, double heSoLuong) {
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public NhanVienCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
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

    public boolean tangLuong(double tang) {
        if (tang + luongCoBan > LUONG_MAX) return false;
        luongCoBan += tang;
        return true;
    }

    public boolean tangHeSoLuong(double tang) {
        if ((tang + heSoLuong) * luongCoBan > LUONG_MAX) return false;
        heSoLuong += tang;
        return true;
    }

    @Override
    public double tinhLuong() {
        return heSoLuong * luongCoBan;
    }

    @Override
    public void inTTin(){
        System.out.println("------------------------------------");
        super.inTTin();
        System.out.println("Lương cơ bản " + luongCoBan);
        System.out.println("Hệ số lương " + heSoLuong);
    }

}
