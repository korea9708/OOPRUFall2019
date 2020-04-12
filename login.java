
//Alec Vidamo
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class login extends userInformation { 
	public static void main(String[] args) {
		
		ArrayList<String> usernames = new ArrayList<String>();
		ArrayList<String> passwords = new ArrayList<String>();
		ArrayList<String> emails = new ArrayList<String>();
	    ArrayList<String> phoneNumbers = new ArrayList<String>(); 
			
		String userFile = "src/Usernames"; 
		File usernamesFile = new File(userFile);
		try {
			Scanner sc = new Scanner(usernamesFile);
			while(sc.hasNextLine()) {
				usernames.add(sc.nextLine());
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Usernames file not found");
		}
		
		String passFile = "src/Passwords"; 
		File passwordsFile = new File(passFile);
		try {
			Scanner sc = new Scanner(passwordsFile);
			while(sc.hasNextLine()) {
				passwords.add(sc.nextLine());
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Passwords file not found");
		}
		
		
		System.out.println("Please enter your username:");
		int index;
		Scanner userInput = new Scanner(System.in);
		String username = userInput.nextLine();
		
		if(usernames.contains(username)) {
			index = usernames.indexOf(username);
			System.out.println("Please enter your password:");
			String password = userInput.nextLine();
			if(passwords.contains(password) && passwords.indexOf(password) == index) {
				System.out.println("Login Successful");
				finalProject.main(new String[] {username});
				userInput.close();

			}
			else {
				while(!passwords.contains(password)) {
					System.out.println("Password is incorrect");
					password = userInput.nextLine();
					if(passwords.contains(password)) {
						System.out.println("Login Successful");
						userInput.close();
					}
				}
			}
		}
		else {
			while(!usernames.contains(username)) {
				System.out.println("Username is incorrect");
				username = userInput.nextLine();
				if(usernames.contains(username)) {
					index = usernames.indexOf(username);
					System.out.println("Please enter your password:");
					String password = userInput.nextLine();
					if(passwords.contains(password) && passwords.indexOf(password) == index) {
						System.out.println("Login Successful");
						userInput.close();
					}
					else {
						while(!passwords.contains(password)) {
							System.out.println("Password is incorrect");
							password = userInput.nextLine();
							if(passwords.contains(password)) {
								System.out.println("Login Successful");
								userInput.close();
							}
						}
					}
				}				
			}
		}
	}
}