
public class Runner {

	public static void main(String[] args) {
		DStack stack = new DStack();
		
		for(int i=0;i<10;i++){
			stack.push(i+1);
		}
		
		for(int i=0;i<10;i++){
			stack.pop();
		}
		
	}

}
