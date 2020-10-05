import java.util.Scanner;

public class InfixToPostFix {

	public static void main(String[] args) {
				
		System.out.println("Enter your infix expressions.Press q to exit");
		
		Scanner scanner = new Scanner(System.in);
		String testcase = scanner.nextLine();
			if(!testcase.equals("q")){
				printPostFix(testcase);
			}
		scanner.close();
	}
	
	public static void printPostFix(String infixExp){
		Stack stack = new Stack(20);
		String finalExp = "";
		infixExp = "("+infixExp+")";
		for(int i=0;i<infixExp.length();i++){
			char currentChar =  infixExp.charAt(i);
			if(currentChar == '('){
				stack.push(currentChar);
			}
			else if(currentChar == ')'){
				do{
					finalExp = finalExp.concat(String.valueOf(stack.pop()));
				}while(stack.peek() != '(');
				stack.pop();
			}
			else if(Character.isAlphabetic(currentChar) || Character.isDigit(currentChar)){
				finalExp = finalExp.concat(String.valueOf(currentChar));
			}
			else{
				char value =stack.peek();
				if(value == '('){
					stack.push(currentChar);
				}
				else{
					while(precedenceLevel(value) >= precedenceLevel(currentChar) && value != '('){
						finalExp = finalExp.concat(String.valueOf(stack.pop()));
						value=stack.peek();
					}
					stack.push(currentChar);
				}
			}
		}
		
		System.err.println("Postfix exp is "+finalExp);
	}
	
	static int precedenceLevel(char op) {
	    switch (op) {
	        case '+':
	        case '-':
	            return 0;
	        case '*':
	        case '/':
	            return 1;
	        case '^':
	            return 2;
	        default:
	            return -1;
	    }
	}

}
