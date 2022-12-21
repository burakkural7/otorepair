package ibmtal.otorepair.business.services;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entities.ServiceCart;

public interface ServiceCartService {
	Result<ServiceCart> addServicecart(ServiceCart servisecart);
}