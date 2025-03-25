package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Trang", "Quỳnh", "Phanh", "Lan Anh");

        // 1. Tham chiếu đến 1 static method - Class::staticMethod
        // Lambda
        names.forEach(name -> Person.sayHello(name));

        // Lamdba + Method reference
        names.forEach(Person::sayHello);

        // 2. Tham chiếu đến 1 instance method của đối tượng cụ thể - object::instanceMethod
        // Lambda
        Person person = new Person();
        names.forEach(name -> person.sayHello(name));

        // Lambda + MethodReference
        names.forEach(person::hello);

        // 3. Tham chiếu tới 1 instance method của 1 kiểu dữ liệu cụ thể
        // Lambda
        names.forEach(name -> System.out.println(name));

        // Lambda + Method references
        names.forEach(System.out::println);

        // 4. Tham chiếu tới 1 constructor
        Person person1 = new Person(); // Khởi tạo đối tượng khi chua sử dụng
        System.out.println("Thông tin của person1: " + person1);

        // Supplier và method reference
        Supplier<Person> supplierPerson = Person::new; // Chưa khởi tạo đối tuợng và cấp phát bộ nhớ
        System.out.println("Thông tin của person 2: " + supplierPerson.get()); // Khởi tạo đô tượng để su dụng
    }
}
