package tw.acelan;

public class ThreadExample02 {
	public static void main(String[] args) throws Exception{
		//���o��e���椤��Thread����
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread.getName()+"���椤");
		
		
		MyThread count1=new MyThread();
		MyThread count2=new MyThread();
		count1.setName("count1");//�N��thread���W��count1
		count2.setName("count2");//�N��thread���W��count2
		
		
		count1.start();//�}�l����thread
		count2.start();//�}�l����thread
		
		
		count1.join();
		count2.join();
		
		
		//�� Thread count1 �� count2���槹����A�~�|����H�U�ԭz�y
		System.out.println(mainThread.getName()+"���槹��");
	}
}
