package watki;

public class Test {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] t = new Thread [500];
		for (int i=0; i<t.length; i++){
			t[i] = new Thread(new Zadanie ("Z"+i));
		}
		for (int i=0; i<t.length; i++){
			t[i].start();
		}
	}

}

class Zadanie implements Runnable{
	String nazwa;	
	static volatile int x=0;
	static Object monitor = "monitor";
	public void run() {
		for (int i=0; i<1000; i++){
			synchronized (monitor) {
				x++;
			}
			if (x%10==0) {
				System.out.println (nazwa +": x temp="+x);
				System.out.println(nazwa + " : "+i);
			}
			
		}
		System.out.println (nazwa +": x="+x);
	}
	
	//synchronized by this
	synchronized void synchMetyhod(){
		//...
	}
	public Zadanie(String nazwa) {
		super();
		this.nazwa = nazwa;
	}
}

