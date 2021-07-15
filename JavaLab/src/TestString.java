
public class TestString {

	public static void main(String[] args) {
		
		String name = "Vincent";//pool產生Vincent字,回傳記憶體位置給name
		String name1 = "Vincent";//第二次pool直接回傳Vincent字記憶體位置給name1,不再產生新的字
		//==記憶體位置是否一樣
		System.out.println( name == name1 );
		
		//String字串產生後不能修改
		//immutable不可變
		//name = "Vincent1";
		//System.out.println( name == name1 ); 結果為false
		
		//用new產生字串,會存在heap區,而非pool
		String name2 = new String("Vincent");
		System.out.println( name2 == name1 );
		
		//String 常用方法
		//equals()文字逐字比較
		System.out.println("equals=" + name2.equals(name1));
		//length()字串長度
		System.out.println("中文.abc".length());
		//indexOf()判斷字串是否包含指定字,並回傳符合的位置,第一個字的位置為0
		System.out.println("中文.abc".indexOf("a"));
		System.out.println("中文.abc".indexOf("d"));//找不到時回傳-1
		System.out.println("中文.abc".contains("a"));//contains()回傳true,false
		System.out.println("中文.abc".substring( 1 ,5 ));//substring(含,不含) 截字
		
		//String.format() 格式化
		System.out.println(String.format("Hello World %s", "David"));//%s表文字
		System.out.println(String.format("Hello World %10s", "David"));//10個字,若不足自動補空白
		System.out.println(String.format("%.4f", 10/3.0 ));//%f表小數
		System.out.println(String.format("%12.4f", 10/3.0 ));//總長12位,小數4位自動四捨五入
		System.out.println(String.format("%12d", 10 ));//%d表整數
		System.out.println(String.format("aaa bbb %12d%%", 10 ));
		System.out.printf("aaa bbb %12d%%", 10 );//f:format
				
	}

}
