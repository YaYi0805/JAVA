package equals;

import encap.Car;

public class TestEquals {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		System.out.println(e1==e2);//記憶體位置
		//改寫前System.out.println(e1.equals(e2));//false
		//游標停在.equals按f3跳至預設的Object.class觀察
		System.out.println(e1.equals(e2));//改寫後
		
		//Car c = new Car("Prius",'R');
		//System.out.println(e1.equals(c));
		//instanceof結果false
		
		e1 = null;
		System.gc();//強制系統執行GC
		
		System.out.println(e2);//等同於呼叫下方法
		System.out.println(e2.toString());
		
		

	}

}
