package ch13;

// 스레드 클래스 작성
class MyThread extends Thread{
	//String name; 
	int time; 
	static int sum=0; //클래스 변수, 정적 변수
	// static은 클래스 당 하나가 생성이 되어서, 별도의 공간에 저장을 하고 있다.
	int s, e;
	public MyThread(String name, int time, int a, int b) {
		super(name);
		//this.name = name;
		this.time = time;
		s = a; e = b;
	}

	@Override
	public void run() {
		int n=0;
		for(int i=s; i<e; i++) {
			sum += i;
			//System.out.println("["+this.getName() +"]"+i);
			
			//필수적으로 예외처리가 필요한 sleep함수
			try {
				sleep(time);
			} catch(Exception e) {}
		}
	}
	
}

public class TestThread {

	public static void main(String[] args) throws Exception {
		System.out.println("메인 메소드 시작");
		// 스레드 객체 생성
		MyThread mt = new MyThread("A", 100, 0, 50);
		MyThread mt2 = new MyThread("B", 50, 51, 100);
	
		// 스레드 시작
		mt.start();
		mt2.start();
		
		// 스레드가 종료된 이후에 뭘하고싶을때_ 즉 기다리기
		mt.join();
		mt2.join();
		
		// 스레드들이 다 일을 하고 출력해야함
		System.out.println("메인 메소드 종료"+MyThread.sum);
	}

}
