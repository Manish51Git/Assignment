package com.te.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactFile {
	String name;
	long number;
	String group;
	static List<ContactFile> list = Arrays.asList(new ContactFile("Amir", 9874589654l, "Training"),
			new ContactFile("Mohit", 9874589635l, "training"), new ContactFile("Darshan", 7896589648l, "PG"));

	public ContactFile(String name, long number, String group) {
		super();
		this.name = name;
		this.number = number;
		this.group = group;
	}

	public void showAllContacts() {

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

	public void searchForContacts() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name you wanna search");
		String sname = scanner.next();
		List<ContactFile> collect = list.stream().filter(l -> l.name.equalsIgnoreCase(sname))
				.collect(Collectors.toList());
		ContactFile contactFile = collect.get(0);
		System.out.println(contactFile);

	}

	public void operateOnContact() {
		System.out.println("press:-\n 1 for call \n :2 for msg \n :3 for go back to menu ");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		switch (m) {
		case 1:
			System.out.println("calling");
			break;
		case 2:
			System.out.println("messaging");
			break;
		case 3:
			System.out.println("back to menu");
			searchForContacts();
		
			

			break;

		default:
			break;
		}

	}

	@Override
	public String toString() {
		return "ContactFile [name=" + name + ", number=" + number + ", group=" + group + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
