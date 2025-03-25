package bai7;

import java.util.List;

interface ListProcessor {
    // Phương thức abstract kiểm tra danh sách có số âm hay không
    boolean containsNegative(List<Integer> list);

    // Phương thức static để in danh sách số nguyên
    static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }
}