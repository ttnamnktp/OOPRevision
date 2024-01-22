public class Test {
    public static void main(String[] args) {
        String s = "ab" + 12;
        String y = "ab" + 1 + 2;
        String u = new String("ab12");
        System.out.println((s==y) + " " + (y==u));
    }
}
