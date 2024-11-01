package tw.sean.learn;

public class Sean64 {

	public static void main(String[] args) {
		Store store = new Store();
		Producer p = new Producer(store);
		Consumer c = new Consumer(store ,"Brad");
		Consumer c1 = new Consumer(store ,"Sean");
		Consumer c2 = new Consumer(store ,"Ian");
		p.start();
		c.start();
		c1.start();
		c2.start();

	}

}
class Store{
	private int qty;
	private int max;
	Store(){
		max = 10;
	}
	
	synchronized void add(int add) throws InterruptedException {
		System.out.printf("準備進貨:%d\n",add);
		while (qty+add>max) {
			wait();
		}
		
		qty += add;
		System.out.printf("完成進貨:%d,目前庫存:%d\n",add,qty);
		notify();
	}
	
	synchronized void buy(int buy,String name) throws InterruptedException {
		System.out.printf("%s想買:%d\n",name,buy);
		while (qty<buy) {
			wait();
		}
		
		qty -= buy;
		System.out.printf("完成賣出:%d(%s),目前庫存:%d\n",buy,name,qty);
		notify();
	}
}

class Producer extends Thread{
	private Store store;
	public Producer(Store store) {
		this.store = store;
	}
	@Override
	public void run() {
		for(int i = 0;i <10;i++) {
			try {
				store.add(5);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}

class Consumer extends Thread{
	private Store store;
	private String name;
	public Consumer(Store store, String name) {
		this.store = store;
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				store.buy((int)(Math.random()*3)+1,name);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
