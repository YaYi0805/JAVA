package thread;

public class TestThread {

	public static void main(String[] args) {
		
		/*法一 ----------------------------------
		MyThread t1 = new MyThread();
		t1.setName("倒數執行序");
		t1.start();//開始執行,不會直接呼叫run方法
		System.out.println("Main方法結束");
		-----------------------------------------------------------------------*/
		
		//法二 比較常用
		        //注意!!
		        //客戶不允許你使用anonymous class, TestThread$1.class
				//你給客戶的程式,客戶都會列管,xxxx.class
				//xxxx.java xxxx.class,1對1
				//TestThread.java -> TestThread.class,TestThread$1.class,TestThread$2.class
		
		
		//System.exit(0);中止
		//Runtime.getRuntime().exit(0);中止
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for( int i = 5 ; i > 0 ; i-- ) {
					//Thread.currentThread()可以取得目前執行的執行緒物件
					System.out.println("倒數:"+i+","+Thread.currentThread());
					try {
						Thread.sleep(1000);//暫停一秒,1000=1秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("執行結束");	
			}
		});
		
		/*lambda-----------------------------------------------------------
		Thread t2 = new Thread( () -> {
			for( int i = 5 ; i > 0 ; i-- ) {
				//Thread.currentThread()可以取得目前執行的執行緒物件
				System.out.println("倒數:"+i+","+Thread.currentThread());
				try {
					Thread.sleep(1000);//暫停一秒,1000=1秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("執行結束");	
		});
		*/
		
		t2.setName("Runnable倒數");
		//t2.setDaemon(true);//設成背景執行緒, java不會等他執行完
		t2.setPriority(10);
		t2.start();
		try {
			t2.join();//同步
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("t2 alive = "+t2.isAlive());	
		System.out.println(Thread.currentThread());	//main Thread
		System.out.println("Main方法結束");		
	}

}
