package tr.org.linux.kamp.enumoperand;

//enum.element.method for methods in enums;
public enum Calculation {
	ADD, SUBTRACT, DIVIDE, MULTIPLY;

	double calc(double x, double y) {
		switch (this) {
		case ADD:
			return x + y;
		case SUBTRACT:
			return x - y;
		case DIVIDE:
			return (x / (y));
		case MULTIPLY:
			return x * y;
		default:
			break;
		}
		return 0;
	}

}
