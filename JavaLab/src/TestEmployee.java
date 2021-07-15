
public class TestEmployee {

	public static void main(String[] args) {
		
		int a = 1;
		//物件宣告: 類別名稱 變數名稱=new 類別名稱 
		Employee emp = new Employee();//產生物件
		emp.empno = 1;
		emp.name = "Vincent";
		
		Employee emp2 = new Employee();
		emp2.empno = 2;
		emp2.name = "Mary";
		//取值和設值都是用.
		System.out.println(emp.name);
		System.out.println(emp2.empno + ",name=" + emp2.name);
		System.out.println(a == 1);
		emp = emp2;
		System.out.println(emp == emp2);
		
		emp = null;
		emp2 = null;
		System.out.println(emp.name);
		
				
		
		
				

	}

}
