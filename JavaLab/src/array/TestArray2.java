package array;

import java.util.Iterator;

public class TestArray2 {

	public static void main(String[] args) {
		
		//int[][] x = new int[5][4];
		//x[0][1] = 20;
		//x[1][1] = 40;
		
		int[][] x = { {1,2,3},{4,5},{6,7,8,9} };
		
		System.out.println(x[1][1]);
		System.out.println("有幾排=" + x.length);
		System.out.println("第一排有幾個=" + x[0].length);
		
		//i表第幾排,j表第幾個
		for ( int i = 0 ; i < x.length ; i++ ) {
			for ( int j = 0 ; j < x[i].length ; j++ ) {
				System.out.println(x[i][j]);
			}
		}
		
		//進階for迴圈
		for ( int[] a : x ) {//x[0]
			for ( int b : a ) {
				System.out.println(b);
			}
		}
		
				

	}

}
