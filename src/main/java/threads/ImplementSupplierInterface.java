package threads;

import java.util.Random;
import java.util.function.Supplier;

public class ImplementSupplierInterface {
	public static void main(String[] args) {
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			Integer otp = random.nextInt(100000, 999999);
			System.out.println(otp);
			return otp;
		};
		sup.get();
	}

	
}
