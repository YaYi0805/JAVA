package array;

public class TestArray {

	public static void main(String[] args) {
		
		//int,double,float,char,boolean
		//陣列 是物件,必須用new關鍵字,指定陣列大小後不可變更
		int[] ages = new int[10];
		ages[0] = 1;//第一格起始位置為0
		ages[1] = 2;
		ages[2] = 3;
		System.out.println( ages[1]);
		System.out.println( "length=" + ages.length );
		
		//{}快速產生陣列
		int[] ages1 = { 1,2,3 };
		for ( int a : ages1 ) {
			System.out.println(a);
		}
		
		//若要清除用null
		ages = null;
		
		

	}

}
