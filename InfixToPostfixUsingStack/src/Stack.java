
public class Stack {

	char[] stack = new char[20];
	int top=-1;
	int maxSize = 0;
	
	public Stack(int length){
		this.stack = new char[length];
		this.maxSize=length;
	}
	
	public void push(char item){
		if(top < maxSize){
			stack[++top] = item;
		}
		else{
			System.err.println("Stack is full");
		}
	}
	
	public Character pop(){
		if(top>-1){
			top=top-1;
			return stack[top+1];			
		}
		else{
			System.err.println("Stack is empty");
			return null;
		}
	}
	
	public Character peek(){
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
	}
	
}
