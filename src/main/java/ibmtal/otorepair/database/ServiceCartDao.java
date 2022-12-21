package ibmtal.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.otorepair.entities.ServiceCart;

public interface ServiceCartDao extends JpaRepository<ServiceCart, Integer> {

}