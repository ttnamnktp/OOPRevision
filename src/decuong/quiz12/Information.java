package decuong.quiz12;

public class Information<T> {
    private T value;

    public Information (T value) {
        this.value = value;
        System.out.println(this.value);
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Information<String> information = new Information<>("Hello");
    }
}
