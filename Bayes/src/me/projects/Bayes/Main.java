package me.projects.Bayes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Bayes item = new Bayes();
	static ArrayList<String> attr = new ArrayList<>();
	static HashMap<String, Integer> examples = new HashMap<>();

	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Give me the path inside the aclImdb folder :  ");
		String path = scanner.nextLine();
		System.out.print("Give me the train files: ");
		int trainfiles = scanner.nextInt();
		System.out.print("Give me the test files: ");
		int testfiles = scanner.nextInt();
		item.loadAll(trainfiles, path);
		item.loadTest(testfiles, path);
		System.out.println("The accuracy is: " + item.testBayes());
	}

}
