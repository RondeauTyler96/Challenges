public class Main {

	public static void main(String[] args) {
		Integer[] a = {1,2,3,4};
		CircularArray<Integer> circularArray = new CircularArray<>(a);

		System.out.println("Before rotate");
		printArray(circularArray.getArray());
		
		circularArray.rotateBackward();
		System.out.println("After rotating backwards: ");
		printArray(circularArray.getArray());
		
		circularArray.rotateForward();
		System.out.println("After rotating forwards: ");
		printArray(circularArray.getArray());

		circularArray.rotateForward();
		System.out.println("After rotating forwards from the original position: ");
		printArray(circularArray.getArray());
	}
	
	public static <T> void printArray(T[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}