package ibmtal.otorepair.business.manager;

@Service
public class  implements ServiceCartService {
	private ServicecartDao ServiceCartDao;
	@Autowired
	public ServiceCartService(ServicecartDao servicecartDao) {
		this.servicecartDao = servicecartDao;
	}
	@Override
	public Result<Servicecart> addServicecart(Servicecart servicecart) {
		Result<Servicecart> result=new Result<>();
		if(servicecart.getName().isEmpty()) {
			result.newError("name","Boş geçilemez");
		}
		if(servicecart.getName().length()>30) {
			result.newError("name", "30 Karakterden fazla olamaz");
		}
		if(result.isSuccess()) {
			this.servicecartDao.save(servicecart);
			result.getData().ad(servicecart));
		}
		return result;
	}
}
	
	
