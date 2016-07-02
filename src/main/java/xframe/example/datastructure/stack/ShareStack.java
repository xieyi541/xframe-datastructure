package xframe.example.datastructure.stack;


public class ShareStack {
	
	private final int size = 100;
	
	private Object[] data;
	
	//
	private int topLow;
	

	//
	private int topHigh;
	
	public ShareStack(){
		this.data = new Object[size];
		this.topHigh = this.size;
		this.topLow = -1;
	}
	
	public void push(Object element, boolean isLow){
		
		if(this.topLow + 1 == this.topHigh){
			throw new RuntimeException("share stack is full");
		}
		
		if(isLow == true){
			this.topLow++;
			this.data[this.topLow] = element; 
		}else{
			this.topHigh--;
			this.data[this.topHigh] = element; 
		}
		
	}
	
	public Object pop(boolean isLow){
		Object result = null;
		if(isLow == true){
			if(this.topLow == -1){
				throw new RuntimeException("share stack is empty");
		
			}
			
			result = this.data[this.topLow];
			this.topLow--;
		}
		
		if(isLow == false){
			if(this.topHigh == size){
				throw new RuntimeException("share stack is empty");
		
			}
			
			result = this.data[this.topHigh];
			this.topHigh++;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		ShareStack stack = new ShareStack();
		for(int i = 1; i<=10; i++){
			stack.push(i, true);
			stack.push(i,false);
		}
		
		for(int i = 1; i<=10; i++){
			System.out.println(stack.pop(true));
			System.out.println(stack.pop(false));
		}
	}
	
	
}
