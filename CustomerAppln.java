package aishwarya;

public class CustomerAppln {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerId(10001);
		customer.setCustomerName("Aishwarya");
		customer.setCustomerCity("Bhubaneswar");
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerCity());

	}

}
