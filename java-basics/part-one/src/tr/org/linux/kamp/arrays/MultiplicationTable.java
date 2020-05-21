package tr.org.linux.kamp.arrays;

public class MultiplicationTable {
	public static void main(String[] args) {
		int table[][] = new int[6][6];
		/*
		int counter = 1;
		for (int k = 0; k < table.length; k++) {
			for (int j = 0; j < table[k].length; j++) {
				table[k][j] = counter;
				counter++;
			}
		}
		counter = 1;
		for (int j = 0; j < table.length; j++) {
			int k = 0;
				
				table[j][k] = counter;
				counter++;
		}*/
		for(int j=0; j< table.length; j++) {
			for(int k =0; k< table.length; k++) {
				
				table[j][k] =(j+1)*(k+1);
								
			}
		}
	
		
		for (int j = 0; j < table.length; j++) {
			for (int k = 0; k < table[j].length; k++) {
			
				System.out.print(table[j][k] + " ");
				
			}
			System.out.println();
	}

	}
	}
