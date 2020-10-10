
public class LinkedList {

	private Node head;
	
	public void insert(int data){
		Node node = new Node();
		node.setData(data);
		if(head == null){
			head=node;
		}
		else{
			Node n = head;
			while(n.getNext() != null){
				n = n.getNext();
			}
			n.setNext(node);
		}
		
	}
	
	public void insertAtIndex(int index,int data){
		Node node = new Node();
		node.setData(data);
		if(index == 0){
			if(head==null)
				head=node;
			else{
				node.setNext(head);
				head=node;
			}
				
		}
		else if(head==null&& index>0){
			System.err.println("Index out of bound exception");
		}
		else{
			Node n = head;			
			for(int i=0;i<index-1;i++){
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
		
	}
	
	void deleteAtIndex(int index){
		Node n = head;
		if(index == 0){
			head = head.getNext();
		}
		else{
			for(int i=0;i<index-1;i++){
				n=n.getNext();
			}
			System.out.println("Deleted data: "+n.getNext().getData());
			n.setNext(n.getNext().getNext());
			
		}		
	}
	
	public void display(){
		Node start = head;
		while(start.getNext() != null){
			System.out.print(start.getData() +"  ");
			start=start.getNext();			
		}
		System.out.print(start.getData());
	}
}
