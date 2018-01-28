package tw.acelan;

public class MyThread extends Thread{

	@Override
	public void run(){
		int count = 0;
		for(int i=1;i<=10;i++){
			count = count + 1;
			System.out.println(this.getName()+"="+count);
		}
	}
}
