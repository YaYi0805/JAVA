package exception;

public class TestException {

	public static void main(String[] args) {
		
		try {
			int a = 1;
			int c = 1;
			//System.out.println("c="+ c--);
			
			int b = a/c ;
			System.out.println("b="+b);
			
			int[] x = {};
			System.out.println(x[0]);
			//事實上為RuntimeException子類別,是不需要處理的
			
		}catch (ArithmeticException ex) {//攔截Arithmetic錯誤
			System.out.println("程式除到0");
			ex.printStackTrace();//印出錯誤說明
			
		}catch (ArrayIndexOutOfBoundsException ex) {//攔截ArrayIndexOutOfBounds錯誤
			ex.printStackTrace();
			
		}catch (Exception ex) {//其他各式的錯誤在此被攔截->也可只打此攔截方法
			ex.printStackTrace();
			
		}finally {
			System.out.println("finally 一定會被執行的程式區塊");
		}
		System.out.println("finish");


	}

}
