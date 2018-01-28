package tw.acelan;

public class ThreadExample02 {
	public static void main(String[] args) throws Exception{
		//取得當前執行中的Thread物件
		Thread mainThread=Thread.currentThread();
		System.out.println(mainThread.getName()+"執行中");
		
		
		MyThread count1=new MyThread();
		MyThread count2=new MyThread();
		count1.setName("count1");//將其thread取名為count1
		count2.setName("count2");//將其thread取名為count2
		
		
		count1.start();//開始執行thread
		count2.start();//開始執行thread
		
		
		count1.join();
		count2.join();
		
		
		//當 Thread count1 及 count2執行完畢後，才會執行以下敘述句
		System.out.println(mainThread.getName()+"執行完畢");
	}
}
