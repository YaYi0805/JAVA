package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestProduct {

	public static void main(String[] args) {
		
		//Notebook具備兩個型態,一個是本身的Notebook,另一個是繼承來的Product
		//Product nb = new Notebook("Asus",30000,365);
		
		Notebook nb = new Notebook("Asus",30000,365);
		System.out.printf("%s,%d,%d%n",nb.getName(),nb.getPrice(),nb.getWarranty());

		System.out.println(nb.desc());
		
		
		//(強制轉型)
		Product item = nb; //Notebook->Product,子類別轉父類別
		System.out.println( item instanceof Notebook);//判斷物件是否具備某種型態
		if ( item instanceof Notebook) {
			Notebook nb1 = (Notebook)item;
			System.out.println("保固:"+nb1.getWarranty());
		}
		//Notebook nb1 = (Notebook)item; //Product->Notebook (?) 父類別轉子類別
		//Food f1 = (Food)item; //出錯 Product->Food (?) item實際上不是Food
		
		
		
		//**因父類別為抽象類別故不能產生非子類別的物件
		//Product a = new Product("冷氣",50000);
		//System.out.println(a.name);
		
		//----------------------------------------
		
		//先取得日曆calendar再取得日期Date,<<注意-月份是0起算>> 5月要key 4
		//GregorianCalendar calendar = new GregorianCalendar(2021,Calendar.MAY,13);
		Date date = Product.getDate(2021, 5, 14);	
		Food food = new Food("肉鬆", 200 , date);
		System.out.println(food.desc());
		
		
		SimCard sim = new SimCard("日本漫遊",600, Product.getDate(2021, 4,30));
		
		
		
		
		
		
		
		
		/*用本身型態
		 buy(nb);
		 buy(food);
		*/
		//Product[] items = new Product[] {nb,food};
		Product[] items = {nb,food,sim};
		buy(items);
		
		
	}
	
	/*用本身型態
	public static void buy(Notebook p) {
		System.out.println("買入:"+p.desc());		
	}
	public static void buy(Food p) {
		System.out.println("買入:"+p.desc());	
	}
    */
	
	//利用父類別型態操縱子類別
	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product eachItem : ps) {
			System.out.println("買入:"+eachItem.desc());
			if ( eachItem instanceof Expirable) {
				Expirable exp = (Expirable)eachItem;
				Date now = new Date();//取得電腦現在的時間
				if ( exp.最後期限().before(now)) {
					System.out.println("已過期");
					continue;
				}
			}
			sum = sum + eachItem.getPrice();			
		}
		System.out.println("總金額:"+sum);
	}
	
	
	
}
