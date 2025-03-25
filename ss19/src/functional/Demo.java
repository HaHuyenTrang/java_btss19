package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // Cách 1: Không sử dụng biểu thuc Lambda
        IMath imath1 = new IMath() {

            @Override
            public int addTwoNumbers(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Tong 2 so là: " + imath1.addTwoNumbers(5, 10));

        // Cách 2: Sd biểu thức lambda
        IMath math2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Tong 2 so là: " + math2.addTwoNumbers(10, 20));

        // Sử dụng biểu thức Lambda khi khối lệnh chỉ có 1 câu lệnh
        IMath imath3 = (int a, int b) -> a + b;
        System.out.println("Tong 2 so là: " + imath3.addTwoNumbers(10, 20));

        // Cách 4: Sử dụng Lambda + Method Reference
        IMath imath4 = Integer::sum;
        System.out.println("Tổng 2 so la: " + imath4.addTwoNumbers(50, 100));

        // Sử dụng biểu thức lambda trong vòng lặp
        List<String> listString = Arrays.asList("A", "B", "C");

        for(String str : listString) {
            System.out.println(str);
        }

        // Lambda
        listString.forEach(str -> System.out.println(str));

        // Biểu thức lambda trong sắp xếp
        Collections.sort(listString, (a, b) -> a.compareTo(b));
    }

}
