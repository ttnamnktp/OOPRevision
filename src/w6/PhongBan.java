package w6;

public class PhongBan {
    private String tenPhongBan;
    private int soNhanVien = 0;
    private NhanVien dsnv[] ;
    public final byte SO_NHAN_VIEN_MAX = 100;

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.dsnv = new NhanVien[getSO_NHAN_VIEN_MAX()];
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public byte getSO_NHAN_VIEN_MAX() {
        return SO_NHAN_VIEN_MAX;
    }

    public boolean themNV(NhanVien nhanVien) {
        if (soNhanVien >= getSO_NHAN_VIEN_MAX()) return false;
        dsnv[soNhanVien] = nhanVien;
        soNhanVien++;
        return true;
    }

    public NhanVien xoaNV() {
        if(soNhanVien == 0) return null;
        NhanVien nhanVien = dsnv[soNhanVien - 1];
        dsnv[soNhanVien] = null;
        soNhanVien--;
        return nhanVien;
    }

    public double tongLuong(){
        return NhanVien.tinhTongLuong(this.dsnv, this.soNhanVien);
    }

    public void inTTin() {
        System.out.println("-------------------------------");
        System.out.println("Ten phong " + tenPhongBan);
        System.out.println("So Nhan vien " + soNhanVien );
        System.out.println("Tong luong " + tongLuong());
        System.out.println("----- Thong tin NV ---------");
        for (int i = 0; i < soNhanVien; i++) {
            dsnv[i].inTTin();
        }

    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Hoa", 2000_000, 1.5);
        NhanVien nv2 = new NhanVien("Mai", 3000_000, 1.3);
        NhanVien nv3 = new NhanVien("Minh", 4000_000, 1);
        PhongBan pb1 = new PhongBan("Phòng kỹ thuật");
        pb1.themNV(nv1);
        pb1.themNV(nv2);
        pb1.themNV(nv3);
        pb1.inTTin();
    }
}
