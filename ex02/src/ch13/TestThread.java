package ch13;

// ������ Ŭ���� �ۼ�
class MyThread extends Thread{
	//String name; 
	int time; 
	static int sum=0; //Ŭ���� ����, ���� ����
	// static�� Ŭ���� �� �ϳ��� ������ �Ǿ, ������ ������ ������ �ϰ� �ִ�.
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
			
			//�ʼ������� ����ó���� �ʿ��� sleep�Լ�
			try {
				sleep(time);
			} catch(Exception e) {}
		}
	}
	
}

public class TestThread {

	public static void main(String[] args) throws Exception {
		System.out.println("���� �޼ҵ� ����");
		// ������ ��ü ����
		MyThread mt = new MyThread("A", 100, 0, 50);
		MyThread mt2 = new MyThread("B", 50, 51, 100);
	
		// ������ ����
		mt.start();
		mt2.start();
		
		// �����尡 ����� ���Ŀ� ���ϰ�������_ �� ��ٸ���
		mt.join();
		mt2.join();
		
		// ��������� �� ���� �ϰ� ����ؾ���
		System.out.println("���� �޼ҵ� ����"+MyThread.sum);
	}

}