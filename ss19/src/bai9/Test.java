package bai9;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("áo len", 1200));
        products.add(new Product("quần jean", 510));
        products.add(new Product("iphone", 200));
        products.add(new Product("samsung", 200));
        products.add(new Product("gấu bông", 250));


        ProductProcessor processor = new ProductProcessorImpl();

        if (processor.hasExpensiveProduct(products)) {
            System.out.println("Danh sách sản phẩm đắt tiền (>100):");
            products.stream().filter(p -> p.getPrice() > 100).forEach(System.out::println);
        } else {
            System.out.println("Không có sản phẩm đắt tiền");
        }

        double totalValue = processor.calculateTotalValue(products);
        System.out.println("Tổng giá trị sản phẩm: " + totalValue);

        System.out.println("Danh sách sản phẩm:");
        ProductProcessor.printProductList(products);
    }
}
