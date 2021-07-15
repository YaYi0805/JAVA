package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Hello");//0
		list.add("World");//1
		//Double d = new Double(3.0);//boxing,3.0的物件
		//double e = d.doubleValue();//unboxing
		//list.add(3.0);//Autoboxing//其實系統是list.add(new Double(3.0)
		//list.add(new Double(3.0);//2
		//list.add(d);
		//Double f = Double.valueOf("3.0");
		//Double g = Double.valueOf(3.0);
		//System.out.println("3.0"+1);
		//System.out.println(f+1);
		
		System.out.println("Size:"+list.size());
		System.out.println("第一個:"+list.get(0));
		System.out.println("第二個:"+list.get(1));
		//System.out.println("第五個:"+list.get(4));//出錯
		
		for( int i = 0 ; i < list.size() ; i++ ) {
			System.out.printf("第%d個:%s%n",(i+1),list.get(i));
		}
		
		//Iterator
		/*
		Iterator iterator = list.iterator();//alt+shit+1
		while(iterator.hasNext()) {//有沒有下一筆
			Object item = iterator.next();//移到下一筆把值取出來
			System.out.println(item);
		}
		*/
		//型態是確定的所以不用Object
		Iterator<String> iterator = list.iterator();//alt+shit+l
		while(iterator.hasNext()) {//有沒有下一筆
			String item = iterator.next();//移到下一筆把值取出來
			System.out.println(item);
		}
		
		//for進階型
		//for(Object item : list ) {
		for(String item : list ) {//型態是確定的所以不用Object
			System.out.println(item);
		}
		System.out.println("------lambda-------");
		//ctrl+shift+T
		//lambda
		Consumer<String> consumer = (item) -> {
			System.out.println(item);
		};
		//Method reference
		
		list.forEach(consumer);
		/*
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String item) {
				System.out.println(item);
			}
		});
		*/
	}
}
