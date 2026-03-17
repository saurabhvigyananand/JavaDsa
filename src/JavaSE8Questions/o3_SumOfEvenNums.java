package JavaSE8Questions;

import java.util.Arrays;
import java.util.List;

public class o3_SumOfEvenNums {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(3, 7, 2, 9, 4, 8);
		
		int sum = list.stream().mapToInt(Integer::intValue).filter(n-> n%2==0).sum();
		System.out.println(sum);
		
		int [] arr = {3, 7, 2, 9, 4, 8};
		sum = Arrays.stream(arr).filter(n->n%2==0).sum();
		System.out.println(sum);
	}
}
