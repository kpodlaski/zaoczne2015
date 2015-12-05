package watki;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		new Thread(counter).start();
		new Thread(new Checker(counter)).start();
	}

}


class Counter implements Runnable {
	public void run() {
		while (true){
			increase();
		}
	}
	volatile int x=0;	
	public synchronized int getX(){
		return x;
	}
	public int increase(){
		synchronized (this){
			x=x+1;
			x=x+1;
		}
		return x;
	}	
}
class Checker implements Runnable{
	public Counter c;	
	public void run() {
		while(true){
			int x = c.getX();
			if (x%2!=0){
				System.out.println(x+" : "+c.getX());
				System.out.println(x+" : "+c.getX());
				System.exit(1);
			}
		}
	}
	public Checker(Counter c) {
		super();
		this.c = c;
	}
	
}