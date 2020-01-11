package mvchbn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CustomerController {
	@Autowired
	CustomerDao dao;
	@RequestMapping(value="/addcust",method=RequestMethod.GET)
	public String ShowAddCustomerForm(){
		return "AddCustomer";
	}
	@RequestMapping(value="/addcust",method=RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer")Customer cust){
		ModelAndView mav = new ModelAndView();
		dao.addCustomer(cust); 
		mav.setViewName("redirect:viewcustomer");
		return mav;
	}
	@RequestMapping(value="/viewcustomer")
	public ModelAndView viewCustomers(){
		ModelAndView mav = new ModelAndView();
		List<Customer> list = dao.viewCustomer();
		mav.addObject("customers", list);
		mav.setViewName("ViewCust");
		return mav;
	}
	
	@RequestMapping(value="/updatecust",method=RequestMethod.GET)
	public ModelAndView ShowUpdateCustomerForm(int code){
		ModelAndView mav = new ModelAndView();
		Customer customer =dao.getCustomer(code);
		mav.addObject("cust",customer);
		mav.setViewName("UpdateCustomer");
		return mav;
	}
	
	@RequestMapping(value="/updatecust",method=RequestMethod.POST)
	public ModelAndView updateCustomer(@ModelAttribute("customer")Customer cust){
		ModelAndView mav = new ModelAndView();
		dao.updateCustomer(cust); 
		mav.setViewName("redirect:viewcustomer");
		return mav;
	}
	@RequestMapping(value="/deletecust",method=RequestMethod.GET)
	public ModelAndView deleteCustomer(int code){
		Customer customer =dao.getCustomer(code);
		ModelAndView mav = new ModelAndView();
		dao.deleteCustomer(customer); 
		mav.setViewName("redirect:viewcustomer");
		return mav;
	}
}