package decuong.quiz8;

public abstract class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected int soXe;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public double tinhTongDoanhThu(ChuyenXe []chuyenXes){
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : chuyenXes){
            tongDoanhThu += chuyenXe.doanhThu;
        }
        return tongDoanhThu;
    }
}
