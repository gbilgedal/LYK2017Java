package tr.org.linux.kamp.arrays;
//check it out

public class BetterMultiplicationTable {
	public static void main(String[] args) {
		
		arrayToPrint(initialize(4,6));
		
	}
	public static int[][] initialize(int n,int m){
		int[][] matrix = new int [n][m];
		for(int j=0; j<matrix.length; j++) {
			for (int k =0; k < matrix[j].length;k++) {
				matrix[j][k]=(k+1)*(j+1);
			}
			
		}
		
		return matrix;
	}
	public static void arrayToPrint(int[][] matrix) {
		
		for (int j = 0; j < matrix.length; j++) {
			for (int k = 0; k < matrix[j].length; k++) {
			
				System.out.print(matrix[j][k] + "\t ");
				
			}
			System.out.println();
	}
	}
	}

