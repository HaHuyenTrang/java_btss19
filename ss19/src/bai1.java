import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class bai1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "", "Lambda", "Stream", "", "Functional");
        List<String> filterString = new ArrayList<>();

        Predicate<String> notString = s -> !s.isEmpty();
        //chuỗi rỗng trả về false

        for (String s : strings) {
            if (notString.test(s)) {
                filterString.add(s);
            }
        }
        //Nếu s không rỗng, nó trả về true, và chuỗi đó sẽ được thêm vào filterString

        System.out.println("sau khi lọc: "+filterString);
    }
}