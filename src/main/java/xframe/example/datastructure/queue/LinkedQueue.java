package xframe.example.datastructure.queue;

/*
 * linked queue
 * 
 * 
 * 
 * 
 */
public class LinkedQueue {
	
	private Node front, rear;

	private class Node {
		Object data = null;
		Node next = null;
		
	}
	
	public LinkedQueue(){
		this.front = new Node();
		this.rear = this.front;
	}
	
	public int length(){
		int count = 0 ;
		Node traverseNode = front.next;
		while(traverseNode!=null){
			count++;
			traverseNode = traverseNode.next;
		}
		return count;
	}
	
	public void enqueue(Object ele){
		Node node = new Node();
		node.data = ele;
		node.next = null;
		
		this.rear.next = node;
		this.rear = node;
	}
	
	public Object dequeue(){
		if(this.rear == this.front){
			throw new RuntimeException("queue is empty.");
		}
		
		Node detachNode = this.front.next;
		Object result =detachNode.data;
		this.front.next = detachNode.next;
		if(this.rear == detachNode){
			this.rear = this.front;
		}
		return result;
	}
	
	public static void main(String[] args){
		LinkedQueue queue = new LinkedQueue();
		
		for(int i=1; i<=10; i++){
			queue.enqueue(i);
		}
		
		System.out.println(queue.length());
		
		for(int i=1; i<=10; i++){
			System.out.println(queue.dequeue());
		}
	}
}
