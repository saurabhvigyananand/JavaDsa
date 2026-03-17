package JavaSE8Questions;

import java.util.Arrays;
import java.util.List;

public class o4_WordsWithLengthGreaterThan4 {

	public static void main(String[] args) {
		List<String> list = List.of("java","spring","boot","api","micro");
		
		List<String> words = list.stream().filter(s->s.length()>4).toList();
		System.out.println(words);
		
		String [] arr = {"java","spring","boot","api","micro"};
		words = Arrays.stream(arr).filter(s->s.length()>4).toList();
		System.out.println(words);
	}
}
