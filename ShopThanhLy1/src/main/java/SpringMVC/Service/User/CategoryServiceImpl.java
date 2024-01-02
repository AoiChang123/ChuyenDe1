package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.ProductsDao;
import SpringMVC.Dto.ProductsDto;
@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private ProductsDao productDao;

	public List<ProductsDto> GetDataProductsPaginate(int id,int start, int totalPage) {
		return productDao.GetDataProductsPaginate(id,start, totalPage);
	}
	public List<ProductsDto> GetAllProductsByID(int id) {
		return productDao.GetAllProductsByID(id);
	}
	
}
