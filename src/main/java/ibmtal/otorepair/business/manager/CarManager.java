package ibmtal.car.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.car.business.services.BrandService;
import ibmtal.car.core.result.Result;
import ibmtal.car.database.BrandDao;
import ibmtal.car.entity.Brand;
@Service
public class CarManager implements CarService {
	private CarDao CarDao;
	@Autowired
	public CarManager(CarDao carDao) {
		this.carDao = carDao;
	}
	@Override
	public Result<Car> addCar(Car car) {
		Result<Car> result=new Result<>();
		if(car.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
		}
		if(car.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.carDao.save(car);
			result.getData().add(car);
		}
		return result;
	}
	
	
}