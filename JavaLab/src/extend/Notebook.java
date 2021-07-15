package extend;

public class Notebook extends Product{
	
	//**子類別要把父類別的抽象方法做出來   (不想做也可以把子類別變成抽象類別-通常會做出來)
	/*
	@Override
	public void calc() {
		
	}
	--------------------------------------*/
	
//	public String name;繼承父類別的屬性,不須再寫
//  public int price;
    public int warranty;
   
	public Notebook(String name, int price, int warranty) {
		super(name,price);//super一定要在第一行
		//super();  compiler自動產生,可不寫
    	//this.name = name;//父類用public,protected時
		//this.price = price;//父類用public,protected時
    	//setName(name);父類用private時
    	//setPrice(price);父類用private時
		this.warranty = warranty;
	}
	
    //annotation
	@Override
	public String desc() {
		String info = super.desc();//名稱:%s,價錢:%d
		return String.format("%s,!保固:%d", info,warranty);
	}
    
    
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
    

}
