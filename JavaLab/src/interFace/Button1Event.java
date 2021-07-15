package interFace;

public class Button1Event implements ButtonClick {

	@Override
	public void click() {
		System.out.println("切換至下一頁");		
	}

}