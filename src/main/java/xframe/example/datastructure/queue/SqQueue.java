package xframe.example.datastructure.queue;

/*
 * 循环队列，
 * 
 * 
 * 
 * 
 */
public class SqQueue {
	
	private final int MAXSIZE = 20;
	
	//数据存储
	private Object[] data;
	
	//队尾指针
	private int rear;
	
	//队头指针
	private int front;
	
	//构造方法
	public SqQueue(){
		this.rear = 0;
		this.front = 0;
		data = new Object[MAXSIZE];
	}
	
	public int length(){
		return (this.rear-this.front+MAXSIZE)%MAXSIZE;
	}
	
	public void enqueue(Object e){
		if((this.rear+1)%this.MAXSIZE==this.front){
			throw new RuntimeException("队列满！");
		}
		this.data[this.rear] = e;
		this.rear = (this.rear+1)%this.MAXSIZE;
	}
	
	public Object dequeue(){
		Object result = null;
		if(this.rear == this.front){
			throw new RuntimeException("队列为空！");
		}
		result  = data[this.front];
		this.front = (this.front+1)%this.MAXSIZE;
		return result;
	}
	
	public static void main(String[] args){
		SqQueue queue = new SqQueue();
		for(int i = 0 ;i< 10; i++){
			queue.enqueue(i);
		}
		
		System.out.println(queue.length());
		
		for(int i = 0 ;i< 10; i++){
			System.out.println(queue.dequeue());
		}
	}
	
}
