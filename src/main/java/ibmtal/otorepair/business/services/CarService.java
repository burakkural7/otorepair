package ibmtal.car.business.services;

import ibmtal.car.core.result.Result;
import ibmtal.car.entity.Car;

public interface CarService {
	Result<Car> addCar(Car car);
}
