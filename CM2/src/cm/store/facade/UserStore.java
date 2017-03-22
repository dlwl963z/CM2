package cm.store.facade;

import java.util.HashMap;
import java.util.List;

import cm.domain.Requirement;
import cm.domain.User;

public interface UserStore {
	
	User searchUser(String userId);
	
	List<User> searchUserAll();
	
	Boolean checkId(String userId);
	
	Boolean insertUser(User user);
	
	Boolean modifyUser(User user);
	
	Boolean deleteUser(String userId);
	
	Requirement searchRequirement(User user);
	
	HashMap<String,Integer> searchSumOfCreditByUser(User user);

}
