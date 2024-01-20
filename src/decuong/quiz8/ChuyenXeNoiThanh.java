package decuong.quiz8;

public class ChuyenXeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKm;
    public ChuyenXeNoiThanh(){
        super();
    }
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe,int soXe, double doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    }

    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe,int soXe, double doanhThu, int soTuyen, double soKm) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

}
