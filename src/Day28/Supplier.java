package Day28;

import java.util.Scanner;

public class Supplier {

	private int id;
	private String name;
	private String city;
	private String email;
	private long mob;
	private boolean isCodAvailable;
	private String password;

	public void acceptSupplierDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter supplier ID");
		id = sc.nextInt();
		System.out.println("Enter supplier name");
		name = sc.next();
		System.out.println("Enter supplier city");
		city = sc.next();
		System.out.println("Enter supplier email");
		email = sc.next();
		System.out.println("Enter supplier mobile no");
		mob = sc.nextLong();
		System.out.println("IS cash on delivery available");
		System.out.println("Enter true or false");
		isCodAvailable = sc.nextBoolean();
	}

	public void displaySupplierDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(city);
		System.out.println(email);
		System.out.println(mob);
		System.out.println(isCodAvailable);
	}

	public void test() {
		Supplier s2 = new Supplier();
		System.out.println(s2.id);
	}

	public void setUsername(String s) {
		name = s;
	}

	public void setPassword(String s) {
		password = s;
	}

	public String getUsername() {
		return name;
	}

	public String getPassword() {
		return password;
	}
}
