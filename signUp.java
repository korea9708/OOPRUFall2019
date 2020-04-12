//Alec Vidamo
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.Scanner;

public class signUp extends userInformation {
	
	public static void main(String[] args) throws IOException {
		
		//Reading user data files
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
			System.err.println("Usernames file not created");
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
			System.err.println("Passwords file not created");
		}
		
		String emailFile = "src/Emails"; 
		File emailsFile = new File(emailFile);
		try {
			Scanner sc = new Scanner(emailsFile);
			while(sc.hasNextLine()) {
				emails.add(sc.nextLine());
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Emails file not created");
		}
		
		String numberFile = "src/Phone Numbers"; 
		File numbersFile = new File(numberFile);
		try {
			Scanner sc = new Scanner(numbersFile);
			while(sc.hasNextLine()) {
				phoneNumbers.add(sc.nextLine());
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("Phone Numbers not created");
		}
		//End of reading user data files
		
		//Username Section
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your desired username:");
		String newUsername = userInput.nextLine();
		while(usernames.contains(newUsername) || newUsername.equals("")) {
			System.out.println("Username is taken or invalid");
			newUsername = userInput.nextLine();
		}
		if(!newUsername.equals("") && !usernames.contains(newUsername)) {
			try (FileWriter f = new FileWriter("src/Usernames", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
				p.println(newUsername);
			} 
			catch (IOException i) {
				i.printStackTrace();
			}
		}
		//End of Usernames Section
		
		//Passwords Section
		System.out.println("Enter your password:");
		String newPassword = userInput.nextLine();
		while(newPassword.equals("") || newPassword.length() < 8) {
			System.out.println("Password must be 8 or more characters");
			newPassword = userInput.nextLine();
		}
		if(!newPassword.equals("") && newPassword.length() >= 8) {
			System.out.println("Confirm your password:");
			String confirmPassword = userInput.nextLine();
			while(!confirmPassword.equals(newPassword)) {
				System.out.println("Passwords do not match, try again");
				confirmPassword = userInput.nextLine();
			}
			if(confirmPassword.equals(newPassword)) {
				try (FileWriter f = new FileWriter("src/Passwords", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
					p.println(newPassword);
				} 
				catch (IOException i) {
					i.printStackTrace();
				}
			}
		}
		//End of Passwords Section
		
		//Emails section
		System.out.println("Enter your email address:");
		String newEmail = userInput.nextLine();
		while(emails.contains(newEmail) || newEmail.equals("")) {
			System.out.println("Email is already in use or invalid");
			newEmail = userInput.nextLine();
		}
		if(!newEmail.equals("") && !emails.contains(newEmail)) {
			try (FileWriter f = new FileWriter("src/Emails", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
				p.println(newEmail);
			} 
			catch (IOException i) {
				i.printStackTrace();
			}
		}
		//End of Emails section
		
		//Phone Numbers section
		System.out.println("Enter your phone number:");
		String newNumber = userInput.nextLine();
		while(phoneNumbers.contains(newNumber) || newNumber.length() != 10) {
			System.out.println("Phone number is in use or invalid");
			newNumber = userInput.nextLine();
		}
		if(newNumber.length() == 10 && !phoneNumbers.contains(newNumber)) {
			try (FileWriter f = new FileWriter("src/Phone Numbers", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
				p.println(newNumber);
			} 
			catch (IOException i) {
				i.printStackTrace();
			}
		}
		//End of Phone Numbers section
		
		Scanner userBalance = new Scanner(System.in);
		System.out.println("Enter your desired balance:");
		String balance = userBalance.nextLine() +  "\n";
		Files.write(Paths.get("src/balance"), balance.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Sign up successful");
		userInput.close();
	}	
}
//End of Sign Up