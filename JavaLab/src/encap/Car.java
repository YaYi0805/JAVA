package encap;

public class Car {
	private String model;
	private int price;
	private char color;
	
	//--------------------------------------
	
	public Car(String model,char color) {
		setModel(model);
		this.color = color;
	}
	public Car(char color) {
		this.color = color;
	}
	
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	//---------------------------------------
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if (model.equals("Yaris")) {
			this.price = 575000;
		}else if (model.equals("Prius")) {
			this.price = 1099000;
		}else {
			System.out.println("錯誤的型號");
		}
	}
	
	//----------------------------------------
	
	public int getPrice() {
		return price;
	}
	
	
	

}
