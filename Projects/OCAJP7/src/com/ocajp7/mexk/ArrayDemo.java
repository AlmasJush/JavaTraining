package com.ocajp7.mexk;

public class ArrayDemo {

	static final int ROWS = 2;
	static final int COLS = 3;
	
	static int grades[][] = new int[ROWS][COLS];
	
	public static void main(String[] args) {

		grades[0][0] = 0;
		grades[0][1] = 1;
		grades[0][2] = 2;
		grades[1][0] = 3;
		grades[1][1] = 4;
		grades[1][2] = 5;
		
		for(int rows=0; rows<ROWS; rows++){
			for(int cols=0; cols<COLS; cols++){
				System.out.printf("%d ",  grades[rows][cols]);
			}
			System.out.println();
		}
		
		int i = 0;
		int[] ages = new int[5];
		for(int num : ages){
			num = 5;
			
			System.out.println(num);
		}
	
	int arr[] = {1,2,3,4,5};
	for(int n=1; n<5; n++){
		System.out.print(arr[n]);
	}
	}

}
