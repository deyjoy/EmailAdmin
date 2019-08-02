package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	String companySuffix = "company.ca";

	// Constructor to receive the first and last name
	public Email() {
		// Call a method asking name
		System.out.println("Please enter your first name");
		this.firstName = setFirstName();
		System.out.println("Please enter your last name");
		this.lastName = setLastName();
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		// Call a method that returns a random password
		this.password = randomPassword(this.defaultPasswordLength);
		System.out.println("Your password is " + this.password);

		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}

	// Ask for the name
	private String setFirstName() {
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		return firstName;
	}

	private String setLastName() {
		Scanner in = new Scanner(System.in);
		String lastName = in.nextLine();
		return lastName;
	}

	// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department names:\n1 Sales \n2 Development \n3 Accounting \n0 for none ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {
			return "sales";
		} else if (deptChoice == 2) {
			return "dev";
		} else if (deptChoice == 3) {
			return "acct";
		} else {
			return "";
		}
	}

	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) Math.random() * passwordSet.length();
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	// Set the mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public int getMailboxCapacity() {
		return this.mailboxCapacity;
	}

	// Set the alternative Email
	public void setAlternativeEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public String getAlternativeEmail() {
		return this.alternateEmail;
	}

	// Change the password
	public void setPassword(String password) {
		this.password = password;
	}

	public String getpassword() {
		return password;
	}

} // End of class "Email"