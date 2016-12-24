package hackerrank;

public class EquilibriumIndex {
	public static int equilibriumIndex(int[] A) {
	    int N = A.length;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + A[i];
        }
        for (int i = 0; i < N; i++) {
            sum = sum - A[i];
            if (left == sum) {
            	return i;
            }
            left = left + A[i];
        }
        return -1;
    }
	
	public static void main (String args[]) {
    	int A[] = new int [] {-1,3,-4,5,1,-6,2,1};
    	System.out.println(equilibriumIndex(A));
    }
}
