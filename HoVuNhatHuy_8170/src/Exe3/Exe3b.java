package Exe3;

import java.util.Scanner;

public class Exe3b {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String input[] = createInput();
		System.out.println("Input");
		printArray(input);
		System.out.println();		
		System.out.println("Input removed item: ");
		String removeItem = sc.nextLine();
		String output[] = removeItem(input, removeItem);
		System.out.println("Output:");
		printArray(output);
		System.out.println();
	}

	public static String[] removeItem(String[] input, String item) {
		boolean kt = false;
		int j = 0;
		String[] newArray = null;
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals(item)) {
				kt = true;
				j = i;
			}
		}
		if (kt==false) {
			newArray = input;
			System.out.println("No item removed");
		}
		else {
			newArray = new String[input.length - 1];
			for (int i = 0; i < input.length; i++)
			if(i<j) {
				newArray[i] = input[i];
			}
			else if(i>j) {
				newArray[i-1] = input[i];
			}
		}
		return newArray;
	}

	public static void printArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static String[] createInput() {
		String array[];
		System.out.println("Input array length: ");
		int n = Integer.parseInt(sc.nextLine());
		array = new String[n]; 
		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" +i+ "]: ");
			array[i] = sc.nextLine();
		}
		return array;
	}
}
