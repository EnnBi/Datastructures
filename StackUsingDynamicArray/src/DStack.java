
public class DStack {

	private int capacity = 2;
	private int[] stack = new int[capacity];
	private int top=-1;
	
	public void push(int item){
		if(top < capacity-1){
			stack[++top] = item;
		}
		else{
			expand();
			stack[++top] = item;
		}
	}
	
	public Integer pop(){
		if(stack.length/2 >top){
			shrink();
		}
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
	
	public void expand(){
		int [] tempArr = stack;
		capacity=capacity*2;
		stack = new int[capacity];
		for(int i=0;i<tempArr.length;i++){
			stack[i] = tempArr[i];
		}
	}
	
	public void shrink(){
		int [] tempArr = stack;
		capacity=capacity/2;
		stack = new int[capacity];
		for(int i=0;i<top;i++){
			stack[i] = tempArr[i];
		}
	}
}
	

