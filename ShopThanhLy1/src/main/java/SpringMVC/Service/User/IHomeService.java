package SpringMVC.Service.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dto.ProductsDto;
import SpringMVC.Entity.Categorys;
import SpringMVC.Entity.Menus;
import SpringMVC.Entity.Slides;

@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenu();
	public List<ProductsDto> GetDataProducts();
}
