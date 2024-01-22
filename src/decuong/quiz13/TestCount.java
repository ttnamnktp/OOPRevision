package decuong.quiz13;

public class TestCount {

    public static void main(String[] args) throws Exception {
        TestCount o = new TestCount();
        o.A();
        o.display();
    }
    int count = 0;

    void A() throws Exception {
        try {
            count++;
            try {
                count++;
                try {
                    count++;
                    throw new Exception();
                } catch (Exception e){
                    count++;
                    throw new Exception();
                }
            } catch (Exception e){
                count++;
                throw new Exception();
            }
        } catch (Exception e) {
            count++;
        }
    }

    void display(){
        System.out.println(count);
    }
}
