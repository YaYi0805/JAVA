package interFace;

public class TestPage {

	public static void main(String[] args) {
		Page page = new Page();
//		ButtonClick click1 = new ButtonClick() {
//			@Override
//			public void click() {
//				System.out.println("切換至下一頁");
//			}
//		};
		// lambda
		//Button1Event event1 = new Button1Event();
		page.button1(new ButtonClick() {
			@Override
			public void click() {
				System.out.println("切換至下一頁");
			}
		});
		//lambda
		page.button1(()->{
			System.out.println("切換至下一頁");
		});
		
		ButtonClick click2 = new ButtonClick() {
			@Override
			public void click() {
				System.out.println("彈出視窗");
			}
		};
		page.button2(click2);

	}
}
