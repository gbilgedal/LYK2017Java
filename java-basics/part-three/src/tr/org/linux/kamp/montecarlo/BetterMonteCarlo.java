package tr.org.linux.kamp.montecarlo;

import java.util.Random;

public class BetterMonteCarlo {//notepad.pw/MonteCarlo
	
	
	    private static Random rgen = new Random();
	    
	    public static void main(String[] args) {
	        int dartCount = 10000;
	        int insideCount = 0;
	        for(int i =0; i < dartCount;i++){
	            if(isInCircle(getPoint(), getPoint())){
	                insideCount++;
	            }                
	        }
	        double pi = 4 * (insideCount*1.0/dartCount);
	        System.out.println(pi);
	    }
	    
	    public static double getPoint(){
	        return (2 * rgen.nextDouble()) - 1 ;
	    }
	    
	    public static boolean isInCircle(double x, double y){
	        return Math.pow(x, 2) + Math.pow(y, 2) < 1;        
	    }
	    
	

}
