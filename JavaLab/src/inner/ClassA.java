package inner;

public class ClassA {
	private double weight;
	private double height;
	
	//右鍵source長出Constructor
	public ClassA(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void printBMI() {
		InnerClass inner = new InnerClass();
		double bmi = inner.calcBMI();//alt+shift+1
		System.out.println(bmi);
	}
	private class InnerClass{
		public double calcBMI() {
			return weight / (height*height);
		}
	}
	
	
	
	
	

}
