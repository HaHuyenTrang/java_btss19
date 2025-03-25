package bai4;

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    // Ghi đè phương thức area để tính diện tích hình tròn
    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

