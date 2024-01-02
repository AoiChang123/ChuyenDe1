package SpringMVC.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.CartDto;
import SpringMVC.Entity.Bills;
@Service
public interface IBillsService {
	public int AddBills(Bills bill);
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts);

}
