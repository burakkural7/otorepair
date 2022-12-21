package ibmtal.otorepair.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ibmtal.otorepair.business.services.ServicePartService;

@Service
public class implements ServicePartService {
	private ServicepartManager servicepartDao;
	@Autowired
	public ServicepartManager(ServicepartDao servicepartDao) {
		this.servicepartDao = servicepartDao;
	}
	@Override
	public Result<Servicepart> addServicepart(Servicepart servicepart) {
		Result<Servicepart> result=new Result<>();
		if(servicepart.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
		}
		if(servicepart.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.servicepartDao.save(servicepart);
			result.getData().add(servicepart);
		}
		return result;
	}
	
	
}
