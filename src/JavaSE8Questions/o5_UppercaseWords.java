package JavaSE8Questions;
import java.util.*;

public class o5_UppercaseWords {
    public static void main(String[] args) {

        // Question:
        // Convert all words to UPPERCASE using Java Streams

        List<String> list = List.of(
                "java",
                "spring",
                "boot",
                "api",
                "micro"
        );

        // Write your code below 👇
        list = list.stream().map(String::toUpperCase).toList();
        System.out.println(list);

        
    }
}