package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	static int size = 0;
	public static void main (String args[]) {
		int l = 2;
		int r = 5;
		int[] res = oddNumbers(l, r);
		for (int i = 0; i < size; i ++) {
			System.out.println(res[i]);
		}
	}

	private static int[] oddNumbers(int l, int r) {
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0) {
				arr.add(i);
			}
		}
		size = arr.size();
		int[] res = new int[size];
		Object[] temp = arr.toArray();
		for (int i = 0; i < size; i ++) {
			res[i] = (int)temp[i];
		}
		return res;
	}
}
