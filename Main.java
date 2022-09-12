package com.te.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ContactFile contactFile = new ContactFile(null, 0, null);

		Scanner scanner = new Scanner(System.in);
		System.err.println("press:1 to ShowAllContacts\n Press:2 for SearchContacts \n press:3 to OperateOnContact");
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			contactFile.showAllContacts();

			
		case 2:
			System.err.println("To search by name press yes or no");
			String cheak=scanner.next();
			if(cheak.equalsIgnoreCase("yes")) {
			contactFile.searchForContacts();
			}else {
				System.err.println("thank you");
			}
		case 3:
			contactFile.operateOnContact();
			
			break;

		default:
			System.out.println("invalid input");
		}
	}

}
