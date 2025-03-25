package bai7;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor  {
        @Override
        public boolean containsNegative(List<Integer> list) {
            // Sử dụng Predicate để kiểm tra số âm
            Predicate<Integer> number = num -> num < 0;
            return list.stream().anyMatch(number);
            //dữ liệu sẽ được xử lý dưới dạng Stream.
        }
    }