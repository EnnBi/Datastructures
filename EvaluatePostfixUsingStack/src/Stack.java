
public class Stack {

	private int[] stack = new int[20];
	private int top=-1;
	private int maxSize = 0;
	
	public Stack(int length){
		this.stack = new int[length];
		this.maxSize=length;
	}
	
	public void push(int item){
		if(top < maxSize){
			stack[++top] = item;
		}
		else{
			System.err.println("Stack is full");
		}
	}
	
	public Integer pop(){
		if(top>-1){
			top=top-1;
			return stack[top+1];			
		}
		else{
			System.err.println("Stack is empty");
			return null;
		}
	}
	
	public Integer peek(){
		if(top>-1){
			return stack[top];
		}
		else{
			System.err.println("Stack is empty");
			return null;
		}
	}
	
	public void display(){
		for(int i=0;i<=top;i++){
			System.err.print(stack[i]+" ");
		}
		System.out.println("");
	}
	
}
