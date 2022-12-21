package ibmtal.otorepair.business.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerService {
	Result<Customer> addCustomer(CustomerService customer);
}
