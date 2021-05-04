package ödev3;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to db : "+customer.getFirstName()+ " "+customer.getLastName());
		
	}

}
