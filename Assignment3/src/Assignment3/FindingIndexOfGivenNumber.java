package Assignment3;

public class FindingIndexOfGivenNumber {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 234, 2, 323, 5, 345, 345, 23, 43, 42, 4 };
		int x = 234;
		for (int i = 0; i < array.length; i++) {
			if (x == array[i])
				System.out.println("The index of given Number in Array =" + i);
		}
	}
}
