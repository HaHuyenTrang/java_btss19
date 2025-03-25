package bai4;

interface Shape {
    // Phương thức mặc định trả về diện tích mặc định là 0
    default double area() {
        return 0;
    }

    // Phương thức tĩnh in ra mô tả chung
    static void description() {
        System.out.println("This is a shape");
    }
}