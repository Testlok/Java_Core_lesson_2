
public class Arrays {

	public static void main(String[] args) {
		int[] numbers = {154,25,37,421,5,9,-39,98,74,200};
		int max = numbers[0];
		int min = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			else if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("максимальне значення = "+max);
		System.out.println("мінімальне значення = "+min);

	}

}
