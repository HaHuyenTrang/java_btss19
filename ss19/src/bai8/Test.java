package bai8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Thêm phần tử vào danh sách
        numbers.add(-5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(1);
        numbers.add(5);

        // Tạo đối tượng của ListProcessorImpl
        ListProcessor processor = new ListProcessorImpl();

        // Kiểm tra danh sách có chứa số lẻ không
        boolean bl = processor.checkOdd(numbers);
        if (bl==false) {
            System.out.println("không chứa số lẻ");
        }else {
            System.out.println("chứa số lẻ");
        }

        // Tính tổng các số lẻ
        int sum = processor.sumOddNumbers(numbers);
        System.out.println("Tổng các số lẻ trong danh sách: " + sum);

        // In danh sách số nguyên bằng phương thức static
        System.out.println("Danh sách số nguyên:");
        ListProcessor.printList(numbers);
    }
}
