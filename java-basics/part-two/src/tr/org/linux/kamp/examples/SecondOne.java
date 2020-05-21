package tr.org.linux.kamp.examples;

public class SecondOne {
	public static void main(String[] args) {
		int linecount = 5;
	for(int t = 0; t<linecount; t++) {
		for (int i=0;i < linecount; i++) {
			for(int s = 0; s <= linecount; s++) {
				System.out.print(linecount + " ");
				linecount--;
				
			}
			for (int a = 1; a < linecount; a++) {
				System.out.print(linecount + " ");
				
				
			}
		}
	}
	}

}
/* 
543212345
4321234
32123
212
1
 */
