package Stack_CN;

public class StackUsingArray {
	private int data[]; // private int[] data;
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
		// initially when the stack is empty the value of the topIndex is -1.
	}
	
	public boolean isEmpty() {
		/*
		if(topIndex == -1) {
			return true;
		} else {
			return false;
		}
		*/
		return topIndex == -1;
	}
	
	public int size() {
		return topIndex + 1;
		// if the stack is empty, then the size of the value of topIndex will be -1.
		// so in that in case the function will return (-1 + 1) -> 0.
	}
	
	public void push(int element) throws StackFullException {
		if(topIndex == data.length - 1) {
			// Throw StackFullException
			throw new StackFullException();
		}
		data[++topIndex] = element;
	}
	
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			// Throw StackEmptyException
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
 	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			// Throw StackEmptyException
			throw new StackEmptyException();
		}
		return data[--topIndex];
	}
	
	
	
}
