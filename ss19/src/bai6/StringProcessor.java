package bai6;

import java.util.List;

interface StringProcessor {
    // Phương thức trừu tượng xử lý chuỗi
    String processString(String input);

    // Phương thức mặc định in danh sách chuỗi
    default void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}