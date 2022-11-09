package gitPackage;

import java.util.Scanner;

public class GitTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner + "do you hangry?");
		
	
		String hungry = "Yes";
		
		if (hungry == "Yes") {
			System.out.println("Eat something");
		}else {
			System.out.println("Do your work");
		}
	}

}
