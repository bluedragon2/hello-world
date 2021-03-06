import java.util.Arrays;

public class AllDivisors {

    public static void main(String[] args) {
	int maxDivisor = Integer.parseInt(args[0]);
	// Create the array
	int[] divisors = new int[maxDivisor];
	for (int i = 0; i < maxDivisor; i++) {
	    divisors[i] = i+1;
	}

	// reduce the numbers in the array
	for (int j = 0; j < maxDivisor; j++) {
	    for (int k = j + 1; k < maxDivisor; k++) {
		if (divisors[k] % divisors[j] == 0) {
		    divisors[k] = divisors[k] / divisors[j];
		}
	    }
	}
	long product = 1;
	for (int d = 0; d < maxDivisor; d++) {
	    product *= divisors[d];
	}
	System.out.println(product);
	System.out.println(Arrays.toString(divisors));
    }
}