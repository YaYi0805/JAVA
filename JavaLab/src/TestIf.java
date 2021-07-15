import sun.management.resources.agent;

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO 現在暫時不作稍後在作時可使用(Tasks)
		
		//流程控制 if else statement
		//由上到下判斷,上判斷式成立後往下判斷式不再判斷
		int age = 40;
		if (age >= 30) {//先打一個大誇號按enter,自動補另一個括號
			System.out.println("壯年");	
		}else if (age >= 18) {
			System.out.println("成年");
		}else {
			System.out.println("未成年");
		}
		
		//巢狀
		if (age >= 18) {
			System.out.println("成年");
			if (age >= 30 ) {
				System.out.println("狀年");
			}
		}else {
			System.out.println("未成年");
		}
		
		
		//switch
		int classroom = 204;
		switch (classroom) {
		    case 204:
			    System.out.println("人數大於等於30人");
			    break;
		    case 305:
                System.out.println("人數小於30大於等於20人");
                break;
		    default:
		   	    System.out.println("default 其他");
		}
				

	}

}
