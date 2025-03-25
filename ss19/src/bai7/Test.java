package bai7;

import java.util.ArrayList;
import java.util.List;

public class Test {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            // Thêm phần tử vào danh sách
//            numbers.add(-5);
            numbers.add(12);
            numbers.add(3);
            numbers.add(2);
            // Tạo đối tượng của ListProcessorImpl
            ListProcessor processor = new ListProcessorImpl();

            // Kiểm tra danh sách có chứa số âm không
            boolean bl = processor.containsNegative(numbers);
            //containsNegative() duyệt qua danh sách numbers,
            if(bl==false) {
                System.out.println("danh sách không chứa số ấm");
            }else {
                System.out.println("danh sách chứa số âm");
            }


            // In danh sách số nguyên bằng phương thức static
            System.out.println("Danh sách số nguyên:");
            ListProcessor.printList(numbers);
        }
    }
