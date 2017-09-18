package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxOfMinOfSubArrays {

	public static void main(String[] args) {
		int x = 3; int max;
		int[] arr = {2, 5, 4 ,6, 8};
		max = segment(x, arr);
		System.out.println("MAX: " + max);
	}

	private static int segment(int x, int[] arr) {
		int n = arr.length;
		int j, min;
		List<Integer> minList = new ArrayList<Integer>();
		for (int i = 0; i <= n - x; i ++) {
			min = arr[i];
			for (j = 1; j < x; j++) {
				if (arr[i + j] < min) 
					min = arr[i + j];
			}
			minList.add(min);
		}
		return Collections.max(minList);
	}

}
