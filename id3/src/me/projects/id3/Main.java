package me.projects.id3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	
    static Algorithm item = new Algorithm();
    static ArrayList<String> attr = new ArrayList<>();
    static HashMap<String,Integer> examples = new HashMap<>();

    public static void main(String args[]) throws IOException {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Give me the path inside the aclImdb folder :  ");
       String path=scanner.nextLine();
       System.out.print("Give me the train files: ");
       int trainfiles = scanner.nextInt();
       System.out.print("Give me the attributes(in the thousands): ");
       int attributes = scanner.nextInt();
       System.out.print("Give me the test files: ");
       int testfiles = scanner.nextInt();
       examples.putAll(item.loadAll(trainfiles,path));
       attr = item.getAttributes(attributes);
       System.out.println("Out of the "+attributes+" atrributes we used " +  attr.size());
       item.ID3_train(examples,attr,0);
       item.loadTest(testfiles,path);
       System.out.println("The accuracy is: " + item.ID3_test());

}
}
