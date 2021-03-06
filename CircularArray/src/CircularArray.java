import java.util.Arrays;
import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{
	
	private T[] array;
	
	public CircularArray(T[] array) {
		this.array = array;
	}
	
	public T[] getArray() {
		return array;
	}
	
	public void setArray(T[] array) {
		this.array = array;
	}
	
	public T getIndex(int index) {
		return array[index];
	}
	
	public void rotateForward() {
		//Store last value to go in first position
		T zero = array[array.length - 1];
		
		//Rotate all values
		for(int i = array.length-1; i > 0; i--) {
			array[i] = array[i-1];
		}
		
		//Put zero in first position (0 position)
		array[0] = zero;
	}
	
	//Do the same things as rotating forward, but in the opposite direction
	public void rotateBackward() {
		T zero = array[0];
		
		//incrementing loop instead of decrementing
		for(int i =0; i<array.length -1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length-1] = zero;
	}

	@Override
	public Iterator<T> iterator() {
		return Arrays.stream(array).iterator();
	}
}