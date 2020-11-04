package INGSW.GitHub.ProvaLabIngSw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MyListUtil {
	
	private ArrayList<Integer> numbers;
	
	public MyListUtil() {
		numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(3,2,1,4));
	}
	
	public ArrayList<Integer> ordinaCrescente() {
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		return numbers;
	}
	
	public ArrayList<Integer> ordinaDecrescente() {
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		});
		return numbers;
	}
}
