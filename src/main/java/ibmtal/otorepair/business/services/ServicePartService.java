package ibmtal.otorepair.business.services;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicePartService{
	Result<ServicePart> addServicepart(ServicePartService servicepart);
}