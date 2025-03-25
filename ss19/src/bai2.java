import java.util.function.Function;

public class bai2 {
    public static void main(String[] args) {
        // Khai báo Function để biểu diễn hàm số f(x) = x^2 + 3x + 2
        Function<Integer, Integer> f = x -> (x * x) + (3 * x) + 2;

        // In kết quả của f(1), f(2), f(3)
        System.out.println("f(1) = " + f.apply(1));
        System.out.println("f(2) = " + f.apply(2));
        System.out.println("f(3) = " + f.apply(3));
    }
}
