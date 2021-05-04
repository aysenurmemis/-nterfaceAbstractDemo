package ödev3;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("AYÞENUR");
		customer.setLastName("MEMÝÞ");
		customer.setNationalityId("TC KÝMLÝK");
		customer.setDateOfBirth(new Date(1999,1,9));
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
	}

}
