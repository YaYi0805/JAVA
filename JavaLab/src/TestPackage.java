import category.*;//*引用package中所有的類別
//import category.Item;//*引用package中的Item類別


public class TestPackage {

	public static void main(String[] args) {
		//如果沒有import指令,必須在class前面加上package名稱
		//category.Item item = new category.Item();
		Item item = new category.Item();
		item.name = "Asus notebook";
		
		System.out.println("TestPackage's main : " + item.name);
		

	}

}
