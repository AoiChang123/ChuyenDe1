package SpringMVC.Service.User;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.PaginatesDto;
@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) ;
		
	
}
