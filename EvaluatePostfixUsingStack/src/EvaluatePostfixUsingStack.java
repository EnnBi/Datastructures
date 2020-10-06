import java.util.Scanner;

public class EvaluatePostfixUsingStack {

	public static void main(String[] args) {

		System.out.println("Enter your infix expressions.Press q to exit");
		
		Scanner scanner = new Scanner(System.in);
		String testcase = scanner.nextLine();
			if(!testcase.equals("q")){
				evaluatePostFix(testcase);
			}
		scanner.close();
	}
	
	public static void evaluatePostFix(String postfixExp){
		String[] expArr = postfixExp.split(" ");
		Stack stack=new Stack(expArr.length);
		int a,b,c=0;
		for(int i=0;i<expArr.length;i++){
			if(!Character.isDigit(expArr[i].charAt(0))){
				b=stack.pop();
				a=stack.pop();
				c=performOperation(a,b,expArr[i].charAt(0));
				stack.push(c);
			}else{
				stack.push(Integer.valueOf(expArr[i]));
			}
		}
		System.out.println("Here is the result");
		stack.display();
	}

	private static int performOperation(int a, int b, char operator) {
		int value = 0;
		switch (operator) {
		case '+':
			 value=a+b;
			break;
		case '-':
			value=a-b;
			break;
		case '/':
			value=a/b;
			break;
		case '*':
			value=a*b;
			break;
		case '^':
			value=a^b;
			break;	
		default:
			break;
		}
		return value;
	}
	
	
}
