package tr.org.linux.kamp.staticthingie;

public class StaticThingie {
	// statics are shared by classes
	public static String myStaticMethod() {
		return "yay";
		
	}
	
	// empty static blocks are called whenever you activate w class
	static {
		System.out.println("a static block");
		
	}
	static {
		int x =5;
		System.out.println(x);
		System.out.println("Another one");
	}
	static {
		System.out.println("And another one (:");
	}
}
