package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
	
	public  String file_Name="notes.txt";
	public  void writeNote() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your note:");
		String note=sc.nextLine();
		
		try {
			FileWriter fw=new FileWriter(file_Name,true);
			fw.write(note + "\n");
			fw.flush();
			System.out.println("Note Saved successfully....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An Error occured..");
			e.printStackTrace();
		}
	}
	
	public  void readNote() {
		System.out.println("Your Notes..");
		try (BufferedReader br=new BufferedReader(new FileReader(file_Name))){
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An Error occured...");
		}
	}
}
