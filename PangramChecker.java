package package19;

import java.util.Scanner;

public class PangramChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = checkIfPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        int[] letterFrequency = new int[26];

        // Convert the input to lowercase to handle case-insensitive pangrams
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                letterFrequency[index]++;
            }
        }

        for (int count : letterFrequency) {
            if (count == 0) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present
	}

}
