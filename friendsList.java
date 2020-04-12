/*YoungJun Kim
 I used encapsulation extend with 
 for loop system*/
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class friendsList extends userInformation { 
	public static void main(String[] args) {
		
		ArrayList<String> usernames = new ArrayList<String>();
	    ArrayList<String> friends = new ArrayList<String>(); 
		
	    String friendFile = "src/friends"; 
		File friendsFile = new File(friendFile);
		try {
			Scanner sc = new Scanner(friendsFile);
			while(sc.hasNextLine()) {
				friends.add(sc.nextLine());
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.err.println("friendsfile not found");
		}
		
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
		
		for(int a=0;a>=0;a++){
		System.out.println("Please enter your friend's username");
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		String id = userInput.nextLine();	
		if(friends.contains(id)) {
			System.out.println("You are already friends");}
		else if(usernames.contains(id)) {
		System.out.println("You cannot add yourself");} 
			else {
			if(!friends.contains(id)&&!usernames.contains(id))
			{
				System.out.println("Friend added!");
				try (FileWriter f = new FileWriter("src/friends", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
							p.println(id);} 
				catch (IOException i) {
					i.printStackTrace();
					
						}
					}break; 
			
			}
		}
		}
	}
		
		