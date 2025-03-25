package bai8;

import java.util.List;
import java.util.function.Predicate;

interface ListProcessor {
    // Phương thức abstract tính tổng các số lẻ
    int sumOddNumbers(List<Integer> list);

    // Phương thức static để in danh sách số nguyên
    static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }

    // Phương thức default kiểm tra danh sách có số lẻ không
    default boolean checkOdd(List<Integer> list) {
        //Predicate<Integer> là một functional interface dùng để kiểm tra một điều kiện trên một đối tượng kiểu Integer.
        Predicate<Integer> number = num -> num % 2 != 0;
        return list.stream().anyMatch(number);
    }
}