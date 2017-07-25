package tr.org.linux.kamp.enumoperand;

public class EnumCalculator {
	static Calculation calc;

	public EnumCalculator(Calculation calc) {
		this.calc = calc;
	}

	public static void main(String[] args) {

		int a = 132;
		int b = 12;
		System.out.println(Calculation.MULTIPLY.calc(a, b));
	}

}
