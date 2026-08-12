package Day28;

public class Driver {

	public static void main(String[] args) {
//		Supplier s1 = new Supplier();
//		s1.acceptSupplierDetails();
//		s1.displaySupplierDetails();

		Supplier s1 = new Supplier();
		s1.setUsername("Supplier");
		s1.setPassword("Supplier123");

		System.out.println(s1.getUsername());
		System.out.println(s1.getPassword());

	}
}