package ibmtal.customer.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.customer.business.services.BrandService;
import ibmtal.customer.core.result.Result;
import ibmtal.customer.database.CustomerDao;
import ibmtal.customer.entity.Customer;
@Service
public class CustomerManager implements CustomerService {
	private CustomerDao customerDao;
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public Result<Customer> addCustomer(Customer customer) {
		Result<Customer> result=new Result<>();
		if(customer.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
		}
		if(customer.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.customerDao.save(customer);
			result.getData().add(customer);
		}
		return result;
	}
	
	
}