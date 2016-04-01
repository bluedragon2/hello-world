
public class LargestPrimeFactor {

    public static void main(String[] args) {
	long num = Long.parseLong(args[0]);
	long divisor = 2;
	while (num != 1) {
	    while (num % divisor == 0) {
		num /= divisor;
	    }
	    divisor++;
	}
	System.out.println(divisor - 1);
    }
}