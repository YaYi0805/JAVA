package collection;

import java.util.HashSet;//utility工具
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		//HashSet set = new HashSet();
		Set<String> set = new HashSet<>();
		//Set set = new LinkedHashSet();//Linked:紀錄加入的順序
		set.add("Hello");
		boolean success = set.add("Hello");
		System.out.println("加第二次有沒有成功:"+success);
		System.out.println("size="+set.size());
		set.add("World");
		//set.add(3.0);
		System.out.println("size="+set.size());
		
		//檢查是否存在
		boolean contains = set.contains("World");
		System.out.println("有沒有World:"+contains);
		
		//Iterator
		/*
		Iterator iterator = set.iterator();//alt+shit+1
		while(iterator.hasNext()) {//有沒有下一筆
			Object item = iterator.next();//移到下一筆把值取出來
			System.out.println(item);
		}
		*/
		Iterator<String> iterator = set.iterator();//alt+shit+1
		while(iterator.hasNext()) {//有沒有下一筆
			String item = iterator.next();//移到下一筆把值取出來
			System.out.println(item);
		}
		//for
		//for( Object item : set ) {
		for( String item : set ) {
			System.out.println(item);
		}
		
		
		
	}

}
