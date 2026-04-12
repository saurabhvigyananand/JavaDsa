package JavaSE8Questions;
import java.util.*;
import java.util.stream.Collectors;

public class o7_DistinctNumbers {
    public static void main(String[] args) {

        // Question:
        // Remove duplicate elements from the list using Streams

        List<Integer> list = List.of(1, 2, 3, 2, 4, 1, 5, 3);

        // Write your code below 👇
        // with set
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
        
        // with list
        List<Integer> result = list.stream()
                .distinct()
                .toList();

        System.out.println(result);
    }
}