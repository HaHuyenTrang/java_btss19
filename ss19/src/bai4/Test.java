package bai4;


public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("diện tích hình tròn: " + circle.area()); // Gọi phương thức area()

        Shape.description(); // Gọi phương thức tĩnh description()
    }
}
