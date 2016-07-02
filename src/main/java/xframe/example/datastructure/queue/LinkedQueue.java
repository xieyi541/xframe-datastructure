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

	class Node {
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
	
	public static void main(String[] args){
		
	}
}
