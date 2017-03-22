package cm.store.logic;

import java.util.HashMap;
import java.util.List;

import cm.domain.Requirement;
import cm.domain.User;
import cm.store.facade.UserStore;

public class UserStoreLogic implements UserStore{

	@Override
	public User searchUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Requirement searchRequirement(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Integer> searchSumOfCreditByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
