
public class TestStringBuilder {

	public static void main(String[] args) {
		
		String hello = "hello";//pool
		String world = "world";//pool
		String helloworld = "helloworld";//pool
		String hw = hello + world;//會在heap區產生另一個新的helloworld
		//String hw = new String("helloworld");
		System.out.println( hw == helloworld);
		
		//for迴圈串接字串
		String temp = "";
		for( int i = 0 ; i < 10 ; i++ ) {
			temp = temp + i;
		}
		System.out.println(temp);
		
		//大量文字串接用StringBuilder,不要用加號
		StringBuilder builder = new StringBuilder();
		for( int i = 0 ; i < 10 ; i++ ) {
			builder.append(i);
		}
		System.out.println(builder.toString());
		
	}

}
