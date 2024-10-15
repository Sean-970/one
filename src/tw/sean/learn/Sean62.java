package tw.sean.learn;

public class Sean62 {

	public static void main(String[] args) {
//		MyThread mt1 = new MyThread();
//		mt1.run();
//		System.out.println("--------------");
//		mt1.start(); //啟動生命特徵 只能有一次
//		System.out.println("--------------");
//		mt1.run();
//		System.out.println("--------------");
////		mt1.start();
		
		
		
		
		
		
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		MyRunnable mr1 = new MyRunnable("C");
		Thread t1 = new Thread(mr1);
		
		mt1.start();   //start 去等候 等cpu叫你 
		mt2.start();
		t1.start();
		System.out.println("ok");
		
	}

}

class MyThread extends Thread { //第一招:直接找Thread當父類別
	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {  
		for(int i = 0 ;i<20;i++) {
			System.out.printf("%s:%d\n",name,i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
}

class MyRunnable implements Runnable { //第二招:
	private String name;
	
	public  MyRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() { //overrride的是 Runnable run()方法
		for(int i = 0 ;i<20;i++) {
			System.out.printf("%s:%d\n",name,i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
}