package xframe.example.datastructure.stack;

public class SqStack {

	private final int maxSize = 20; 
	
	private int top;
	
	private Object[] data;
	
	public SqStack(){
		this.top=-1;
		this.data = new Object[maxSize];
	}	
	
	public void push(Object elem){
		if(this.top + 1 == this.maxSize){
			throw new RuntimeException("stack is full");
		}
		
		
		this.top++;
		this.data[this.top] = elem;
	}
	
	public Object pop(){
		if(this.top == -1){
			throw new RuntimeException("stack is empty");
		}
		
		Object result = this.data[this.top];
		this.top--;
		return result;
	}
	
	public int length(){
		return this.top+1;
	}
	
	public static void main(String[] args){
		SqStack stack =  new SqStack();
		
		for(int i=1; i<=10;i++){
			stack.push(i);
		}
		
		for(int i=1; i<=10;i++){
			System.out.println(stack.pop());
		}
	}
	
	
}
