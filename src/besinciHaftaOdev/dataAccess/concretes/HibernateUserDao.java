package besinciHaftaOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import besinciHaftaOdev.dataAccess.abstracts.UserDao;
import besinciHaftaOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	private List<User> users= new ArrayList<User>();//Fake Database

	@Override
	public void add(User user) {
		System.out.println("User added: "+user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

	@Override
	public void update(User user) {
		//Update işlemi
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(String eMail) {
		for (User user : users) {
			if(user.geteMail().equals(eMail)) {
				return user;
			}
		}
		return null;
	}
	

}
