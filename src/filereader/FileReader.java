package filereader;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
	
	static ArrayList<String> linesToPrint;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		if(input.next().equals("search")) {
			searchPattern(input.next(), input.next());
			linesToPrint.forEach((line) -> System.out.println(line));
		}
      
	}
	
	public static void searchPattern(String pattern, String fileName) throws FileNotFoundException {
		linesToPrint = new ArrayList<>();
		File f = new File(fileName); // all-star.txt 
        try (Scanner sc = new Scanner(f)) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				if(line.contains(pattern)) {
					linesToPrint.add(line);
				}
			}
		}
	}

}
