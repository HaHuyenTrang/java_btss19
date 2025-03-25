package bai6;

import java.util.ArrayList;
import java.util.List;

public class Test {

        public static void main(String[] args) {
            // Danh sách chuỗi ban đầu
            List<String> strings = new ArrayList<>();
            strings.add("java");
            strings.add("lambda");
            strings.add("stream");
            strings.add("interface");

            // Sử dụng Lambda Expression để cài đặt processString()
            StringProcessor processor = input -> (input.toUpperCase() + " - TECHNICAL");

            // Xử lý danh sách chuỗi
            List<String> processedStrings = new ArrayList<>();
            for (String str : strings) {
                processedStrings.add(processor.processString(str));
            }

            // Gọi phương thức mặc định để in danh sách chuỗi đã xử lý
            processor.printList(processedStrings);
        }
    }

