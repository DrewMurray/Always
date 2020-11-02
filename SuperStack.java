public class SuperStack<T> {

	private T[] items;
	private int top;

	public SuperStack() {
		this(1);
	}
	
	public SuperStack(int size) {
		items = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == items.length;
	}

	public T pop() {
		if (isEmpty())
			return null;
		else {
			return items[top - 1];
		}
	}

	public boolean push(T item) {
		if (isFull()) {
			return false;
		}

		items[top] = item;
		return true;
	}

}
