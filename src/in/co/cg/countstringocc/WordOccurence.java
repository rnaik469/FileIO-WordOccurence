package in.co.cg.countstringocc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//class to find number of words in a file
public class WordOccurence {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner get = new Scanner(System.in);
		String path;
		System.out.println("Enter file path");
		path = get.next();// File path
		get= new Scanner(new FileInputStream(path));// Passing path to scanner using FileInputStream
		int wordC = 0;
		while (get.hasNext()) {
			get.next();
			wordC++;// word count
		}
		System.out.println("No. words in file are: " + wordC);
		get.close();
		
	}


}
