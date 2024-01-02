package SpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.ProductsDto;
@Service
public interface ICategoryService {
	public List<ProductsDto> GetDataProductsPaginate(int id,int start, int totalPage);
	public List<ProductsDto> GetAllProductsByID(int id);
}
