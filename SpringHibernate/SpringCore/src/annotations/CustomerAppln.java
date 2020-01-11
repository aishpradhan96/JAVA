package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("annotations/SpringAnnot.xml");
		Customer cust =(Customer) ctx.getBean("customer");
		//Customer cust =(Customer) ctx.getBean("cust");
		System.out.println(cust.getCode()+" "+cust.getName()+" "+cust.getOrders().getQuantity()+" "+cust.getOrders().getCost());
	}

}
