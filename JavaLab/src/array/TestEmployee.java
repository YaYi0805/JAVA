package array;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class TestEmployee {

	public static void main(String[] args) {
		
		//物件參考變數陣列
		Employee[] emps = new Employee[2];
		/* 寫法1
		Employee emp1 = new Employee();
		emp1.name = "Vincent";
		emp1.empno = 1;
		emps[0] = emp1;
		*/
		
		emps[0] = new Employee();
		emps[0].name = "Vincent";
		emps[0].empno = 1;
		
		Employee emp2 = new Employee();
		emp2.name = "David";
		emp2.empno = 2;
		emps[1] = emp2;
		
		for ( int i = 0 ; i < emps.length ; i++ ) {
			System.out.println( emps[i].name );
		}
		
	}

}
