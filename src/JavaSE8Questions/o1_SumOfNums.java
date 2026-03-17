package JavaSE8Questions;

import java.util.Arrays;
import java.util.List;

public class o1_SumOfNums {
	
	public static void main(String[] args) {
		List<Integer> list = List.of(3, 7, 2, 9, 4);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		int [] arr = {3, 7, 2, 9, 4};
		sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}
