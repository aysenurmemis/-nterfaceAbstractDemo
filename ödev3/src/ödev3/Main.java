package �dev3;

import java.util.Date;


public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("AY�ENUR");
		customer.setLastName("MEM��");
		customer.setNationalityId("TC K�ML�K");
		customer.setDateOfBirth(new Date(1999,1,9));
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
	}

}
