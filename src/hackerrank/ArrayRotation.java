package hackerrank;

public class ArrayRotation {
	
	public static void main(String args[]) {
		int A[] = new int[] {1, 2, 3, 4, 5};
		int n = A.length;
		int d = 4;
		A = rotateLeft(A, n, d);
		System.out.println("Rotated Array\n");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i]+" ");
		}
	}

	private static int[] rotateLeft(int[] A, int n, int d) {
		for (int i = 0; i < d; i++) {
				int j = 0;
				int temp = A[0];
				for (j = 0; j < n-1; j++) {
					A[j] = A[j+1];
				}
				A[j] = temp;
		}
		return A;
	}
}
