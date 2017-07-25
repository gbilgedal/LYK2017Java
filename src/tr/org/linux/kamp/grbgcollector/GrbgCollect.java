package tr.org.linux.kamp.grbgcollector;

public class GrbgCollect {
	public static void main(String[] args) throws Throwable {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Toplam bellek : " + rt.totalMemory());
		
		String str = new String("Linux yaz kampı");
		String str1 = new String("java programlama");
		System.out.println(str);
		str = str1;
		str = null;
	//	System.gc();
	for(int i=0;i<1000;i++) {
		GcTest gcTest = new GcTest();
		gcTest.value = 1;
		gcTest = null;
	}
				
		System.out.println("boş bellek : " + rt.freeMemory());
	//System.out.println(gcTest.value);
		System.gc();
		
		
		System.out.println("boş bellek garbage collector çalıştıktan sonra : " + rt.freeMemory());

		//System.out.println(gcTest.value);
		

	}
	
	

}
