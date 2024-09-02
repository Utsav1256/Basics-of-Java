package Stack_CN;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray stack1 = new StackUsingArray();
		
		System.out.println(stack1.isEmpty());
		stack1.pop(); // Exception in thread "main" Stack_CN.StackEmptyException
		stack1.push(10);
		System.out.println(stack1.size());
		stack1.push(20);
		stack1.pop();
		stack1.push(50);
		System.out.println(stack1.top());
		System.out.println(stack1.size());
		
	}

}
