import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách chuỗi
        System.out.println(" số chuỗi: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới

        List<String> strings = new ArrayList<>();
        System.out.println("nhập chuỗi:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

//         Đếm số lượng chuỗi bắt đầu bằng 'A' và có độ dài >= 5
        long count = strings.stream()
                .filter(s -> s.startsWith("A") && s.length() >= 5)
                .count();
        System.out.println("số lượng chuỗi bắt đầu bằng chữ cái 'A' và có độ dài lớn hơn hoặc bằng 5 ký tự: "+count);


        strings.stream()
                .filter(s -> s.startsWith("A") && s.length() >= 5)
                .forEach(System.out::println);





    }
}
