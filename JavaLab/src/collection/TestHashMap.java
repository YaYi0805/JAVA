package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 2000);
		map.put("David", 1000);
		map.put("Tom", 5000);
		map.put("Tom", 2500);//會覆蓋前值,只保留最後一次
		
		//map.containsKey("Tom");
		//map.containsValue(2500);
		
		System.out.println("Tom's 薪水="+map.get("Tom"));
		
		//keySet()
		Set<String> keySet = map.keySet();//alt+shift+l
		for( String key : keySet ) {
			System.out.println(key + "=" + map.get(key));
		}
		
		//entrySet()
		Set< Entry<String, Integer> > entrySet = map.entrySet();
		int sum = 0;
		for( Entry<String, Integer> entry : entrySet ) {
			//Map.Entry entry = (Map.Entry)e;//上方若沒有import java.util.Map.Entry;
			//Entry entry = (Entry)e;//上方若有import java.util.Map.Entry;
			//Object value = entry.getValue();//alt+shift+l,Integer
			sum = sum + entry.getValue();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("總和="+sum);
		
		
		System.out.println("----------forEach----------");
		BiConsumer<String, Integer> consumer = ( key , Value ) -> {
			System.out.println("key="+key+",value="+Value);
		};
	    map.forEach(consumer);
	    //Method Reference
	    map.forEach(TestHashMap::bbbbb);
	}
	public static void bbbbb(String key,Integer value) {
		System.out.println("key="+key+",value="+value);
	}
	

}
