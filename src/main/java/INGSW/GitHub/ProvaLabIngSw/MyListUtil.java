package INGSW.GitHub.ProvaLabIngSw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyListUtil {
	
	public void ordinaCrescente(ArrayList<Integer> numbers) {
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	public void ordinaDecrescente(ArrayList<Integer> numbers) {
		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		});
	}
}
