package SpringMVC.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.UserDao;
import SpringMVC.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	UserDao userDao= new UserDao();

	@Override
	public int AddAccount(Users user) {
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddAccount(user);
	}

	public Users CheckAccount(Users user) {
		String pass = user.getPassword();
		user = userDao.GetUserByAcc(user);
		if(user != null) {
			if(BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
	
	
}
