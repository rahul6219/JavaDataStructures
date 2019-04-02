
public class Stack {
//The order may be LIFO(Last In First Out)

	// isEmpty: Returns true if stack is empty, else false.

	private int[] myArray;
	private int top;
	private int size;

	public Stack(int size) {
		this.size = size;
		myArray = new int[size];
		top = -1;
	}

	// Push: Adds an item in the stack. If the stack is full, then it is said to be
	// an Overflow condition.
	public void push(int item) {
		if (top == (size - 1)) {
			System.out.println("Cannot push, the stack is full");
		} else {
			top++;
			myArray[top] = item;
		}

	}

	// Pop: Removes an item from the stack. The items are popped in the reversed
	// order in which they are pushed.
	// If the stack is empty, then it is said to be an Underflow condition.
	public int pop() {
		if (top == -1) {
			System.out.println("Cannot pop, stack is empty");
			return 0;
		} else {
			int poppedItem = myArray[top];
			top--;
			return poppedItem;
		}
	}

	public void print() {
		if (top == -1) {
			System.out.println("Nothing to print, stack is empty");
		} else {
			for (int i = 0; i < myArray.length; i++) {
				if (myArray[i] != 0) {
					System.out.print(myArray[i] + "  ");

				}

			}

			System.out.println();
		}
	}
	
	//Peek or Top: Returns top element of stack.
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
			return -1;
		}
		else
		{
			int topElement=myArray[top];
			return topElement;
		}
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) {

		Stack myStack = new Stack(5);
		System.out.println(myStack.peek()+"  Element on Top");
		System.out.println(myStack.isEmpty()+"  Element on Top");

		myStack.push(100);
		System.out.println(myStack.isEmpty());

		myStack.push(200);
		myStack.push(300);
		System.out.println(myStack.peek()+"  Element on Top");
		myStack.print();

		myStack.push(400);
		System.out.println(myStack.isEmpty());
		myStack.push(500);
		myStack.print();
		myStack.push(600);
		System.out.println(myStack.peek()+"  Element on Top");
		myStack.print();


	}

}
