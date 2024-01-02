package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.CategorysDao;
import SpringMVC.Dao.MenuDao;
import SpringMVC.Dao.ProductsDao;
import SpringMVC.Dao.SlidesDao;
import SpringMVC.Dto.ProductsDto;
import SpringMVC.Entity.Categorys;
import SpringMVC.Entity.Menus;
import SpringMVC.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categoryDao.GetDataCategorys();
	}
	public List<Menus> GetDataMenu() {
		return menuDao.GetDataMenu();
	}

	@Override
	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts(); 
		return listProducts;
	}
}
