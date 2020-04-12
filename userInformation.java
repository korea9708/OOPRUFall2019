//YoungJun Kim Encapsulate all user information private
public class userInformation  {
	private String friends;
	private String newFriends;
	private String usernames;
	private String emails;
	private String phoneNumbers;
	private String passwords;
	
	public userInformation() {
		this.friends="";
		this.newFriends="";
		this.usernames="";
		this.emails="";
		this.phoneNumbers="";
		this.passwords="";
	
	} //default constructor
	
	public userInformation (String friends, String newFirnds, String usernames, String emails, String phoneNumbers, String passwords, String newFriends)
	{
		this.friends=friends;
		this.newFriends=newFriends;
		this.usernames=usernames;
		this.emails=emails;
		this.phoneNumbers=phoneNumbers;
		this.passwords=passwords;
	}//Parameterized constructor

    public void setFriends(String friends)
    {
        this.friends = friends;        
    }//end of Setter: FirstName
    public String getFriends(String friends)
    {
        return this.friends;
    }
    
    public void setUsernames(String usernames)
    {
        this.usernames=usernames ;        
    }
    public String get(String usernames)
    {
        return this.usernames;
    }
    public void setNewfriends(String newFriends)
    {
        this.newFriends = newFriends;        
    }
    public String getNewfriends(String newFriends)
    {
        return this.newFriends;
    }
    public void setEmails(String emails)
    {
        this.emails =emails ;        
    }
    public String getEmails(String emails)
    {
        return this.emails;
    }
    public void setPhoneNumbers(String phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;        
    }
    public String getPhoneNumbers(String phoneNumbers)
    {
        return this.phoneNumbers;
    }
    public void setPasswords(String passwords)
    {
        this.passwords =passwords ;        
    }
    public String getPasswords(String passwords )
    {
        return this.passwords;
    }
}
