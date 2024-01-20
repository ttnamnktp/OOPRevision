package decuong.quiz9;

public class MainClass {
    public static void main(String[] args) {
//        Calculate c;
//        c = new Calculate();
        // KHÔNG THỂ TẠO TRỰC TIẾP MỘT INSTANCE TỪ MỘT TRỪU TƯỢNG
        int r = new Calculate(){
            @Override
            int add(int a, int b){
                return a + b;
            }
        }.add(100,200);
        System.out.println(r);
    }
}
