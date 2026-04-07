package JavaSE8Questions;
import java.util.*;

public class o6_FirstElement {
    public static void main(String[] args) {

        // Question:
        // Find the FIRST element in the list using Streams

        List<Integer> list = List.of(10, 20, 30, 40, 50);

        // Write your code below 👇
        long first = list.stream().findFirst().orElse(null);
        System.out.println(first);
        System.out.println(list.getFirst());
        // best version
        
        list.stream()
        .findFirst()
        .ifPresent(System.out::println);
    }
}