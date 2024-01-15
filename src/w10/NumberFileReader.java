package w10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class NumberFileReader {
    public void readListIntegers(String fileName) {
        try {
            // Kiểm tra xâu tên file là xâu rỗng
            if (fileName.isEmpty()) {
                throw new IllegalArgumentException("Xâu tên file là xâu rỗng");
            }

            // Mở file để đọc
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Đọc số lượng các số từ dòng đầu tiên của file
            String firstLine = reader.readLine();
            int count = Integer.parseInt(firstLine.trim());

            // Đọc dãy số từ file và xử lý ngoại lệ khi cần
            for (int i = 0; i < count; i++) {
                String line = reader.readLine();

                try {
                    int number = Integer.parseInt(line.trim());
                    System.out.println("Số nguyên: " + number);
                } catch (Exception e) {
                    System.out.println("Dòng " + (i + 2) + " không phải là số nguyên.");
                }
            }

            // Đóng file
            reader.close();
        } catch (NoSuchFileException e) {
            // Xử lý khi không tìm thấy file
            System.out.println("Không tìm thấy file: " + fileName);
        } catch (IOException e) {
            // Xử lý khi không mở được file hoặc các vấn đề khác liên quan đến file
            System.out.println("Không mở được file: " + fileName);
        } catch (IllegalArgumentException e) {
            // Xử lý khi xâu tên file là xâu rỗng
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        NumberFileReader fileReader = new NumberFileReader();

        // Thử nghiệm với tên file thực tế hoặc tên file không tồn tại
        fileReader.readListIntegers("src/w10/test.txt");
    }
}

