package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.ProductsDao;
import SpringMVC.Dto.ProductsDto;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	ProductsDao productDao = new ProductsDao();

	public ProductsDto GetProductByID(long id) {
		List<ProductsDto> list = productDao.GetProductByID(id);
		return list.get(0);
	}

	@Override
	public List<ProductsDto> GetProductByIDCategory(int id) {
		return productDao.GetAllProductsByID(id);
	}

}
