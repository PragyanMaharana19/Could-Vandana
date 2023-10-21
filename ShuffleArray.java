package package19;

public class ShuffleArray {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6, 7};

	        shuffleArray(array);

	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int length = array.length;

	        for (int i = length - 1; i > 0; i--) {
	            // Generate an index between 0 and i (inclusive)
	            int randomIndex = (int) (Math.random() * (i + 1));

	            // Swap the elements at randomIndex and i
	            int temp = array[randomIndex];
	            array[randomIndex] = array[i];
	            array[i] = temp;
	        }
	}

}
