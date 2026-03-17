package JavaSE8Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class o2_FindEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(3, 7, 2, 9, 4, 8);
		
		List<Integer> evens = list.stream().filter(n->n %2 ==0).toList();
		System.out.println(evens);
		
		int [] arr = {3, 7, 2, 9, 4, 8};
		evens = Arrays.stream(arr).boxed().filter(n->n%2 ==0).collect(Collectors.toList());
		System.out.println(evens);
	}
}
