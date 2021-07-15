package collection;

import java.util.HashSet;
import java.util.Set;

import equals.Employee;

public class TestHashSet2 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");
		set.add(e1);
		boolean successs = set.add(e2);
		System.out.println("加第二次Employee 001:"+successs);//跟有沒有加hashcode有關
		System.out.println("size="+set.size());
	
	}

}
