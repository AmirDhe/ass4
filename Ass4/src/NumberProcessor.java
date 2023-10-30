import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberProcessor {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(16);
        numbers.add(9);
        numbers.add(25);
        numbers.add(36);


        Collections.sort(numbers);


        for (int number : numbers) {
            double sqrt = Math.sqrt(number);
            if (number % 2 == 0) {
                System.out.println("Number: " + number + ", Square Root: " + sqrt);
            }
        }
    }
}
