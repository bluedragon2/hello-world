
import java.util.*;

public class Divisors {
    public static void main(String[] args) {
	int n = 100;
	int divs = 0;
	int answer = n;
	while (divs < 500) {
	     divs = numDivs(n * (n + 1) / 2);
	     if (divs > 500) {
		 answer = n;
	     }
	     n++;
	}
	System.out.println("triangular number for: " + answer + " = " + answer*(answer+1)/2 + "\nnum Divisors = " + divs);
    }

    static int numDivs(long num) {
	long sqrt = Math.round(Math.sqrt(num));
	int div = 1;
	int count = 0;
	while (div <= sqrt ) {
	    if (num % div == 0) {
		count++;
	    }
	    div++;
	}
	return count * 2 // TODO: account for perfect square;
    }
}