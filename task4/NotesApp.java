package task4;

import java.util.Scanner;

public class NotesApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FileManagement fm=new FileManagement();
		
		boolean start=true;
		System.out.println("Welcome to file Manager...");
		while(start) {
			System.out.println(" 1.Write a new note..\n 2.view all notes....\n 3.Exit..");
			System.out.println("Enter your choice.");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				fm.writeNote();
				break;
			case 2:
				fm.readNote();
				break;
			case 3:
				System.out.println("Thank you for utilizing this app...😍😍");
				start=false;
				break;
			default:System.out.println("Invalid choice....");
			}
		}
	}
}
