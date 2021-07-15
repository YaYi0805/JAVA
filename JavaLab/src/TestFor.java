import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
		//迴圈
		//for ( 初值設定 ; 判斷條件 ; 次數控制 )
		for (int i = 1; i <= 100; ) {
			System.out.println(i);
			i++;
		}

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		int i = 1 ;//i搬出以印初finally的i
		for ( ; i <= 100 ; i++ ) {
			System.out.println(i);
		}
		System.out.println("finally=" + i );
		
		int sum = 0;//累計暫存
		for ( int j = 1 ; j <= 100 ; j++ ) {
			System.out.println(j);
			sum = sum + j;
			//j=1, sum = 0+1 = 1
			//j=2, sum = 1+2 = 3
			//j=3, sum = 3+3 = 6
		}
		System.out.println("總和=" + sum);
		
		//1~100奇數和
		int sum1 = 0;
		for ( int j = 1 ; j <= 100 ; j++ ) {
			if ( j % 2 == 1) {
				System.out.println(j);
				sum1 = sum1 + j;
			}  	
		}
		System.out.println("總和=" + sum1);
		
		//1~50奇數和
		//continue,break
		int sum2 = 0;
		for ( int j = 1 ; j <= 100 ; j++) {
			if (j % 2 == 0) {
				continue;//跳過下方程式繼續下一次執行
			}
			if ( j >= 50 ) {
				break;//中斷
			}
			System.out.println(j);
			sum2 = sum2 + j;
			
		}
		System.out.println("總和=" + sum2);
		
		//while 只要判斷條件為true就會一直執行
		int a = 1;//宣告
		int sumOfWhile = 0;
		while ( a <= 100 ) {//判斷
			sumOfWhile = sumOfWhile + a;
			a++;//計數器加1
		}
		System.out.println("while 總和=" + sumOfWhile);
		System.out.println("finally a=" + a);
		
		//do while
		//至少執行一次
		//先執行迴圈再檢查條件
		int b = 1;
		int sumOfDoWhile = 0;
		do {
			sumOfDoWhile = sumOfDoWhile + 1;
			b++;
		} while ( b <= 100 );
		System.out.println("Do While 總和=" + sumOfDoWhile);
	}

}
