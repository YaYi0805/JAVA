package equals;

public class Employee {
	private String id;
	public Employee(String id) {
		this.id = id;
	}
	//右鍵source自動產生hashCode()、equals()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/*自己寫-----------------------------------------------
	//改寫繼承來的預設Object.class中的方法
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {//obj具備Employee型態才強制轉型
			Employee emp = (Employee)obj;
			//下方的equals是借用String文字的逐字比較
			//String有改寫Override繼承來的equals方法
			return this.id.equals(emp.id);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//回傳代表物件的數字,通常會跟你equals中比較的屬性有關
		//藉用String hashcode滿足java的規範
		//因equals相等hashcode要相等
		return super.hashCode();
	}
	---------------------------------------------------------------*/
	
	@Override
	protected void finalize() throws Throwable {
        System.out.println("id="+id+",被GC!");
	}
	
	//改寫前toString()方法結果為equals.Employee@2a139a55
	@Override
	public String toString() {
		return String.format("Employee(%s)", id);
	}

}
