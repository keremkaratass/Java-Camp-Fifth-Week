package besinciHaftaOdev.business.concretes;



import besinciHaftaOdev.business.abstracts.UserService;
import besinciHaftaOdev.core.GoogleService;
import besinciHaftaOdev.dataAccess.abstracts.UserDao;
import besinciHaftaOdev.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private GoogleService googleService;
	

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		for (User users : userDao.getAll()) {
			if(user.geteMail().equals(users.geteMail())) {
				System.out.println("This e-mail is used...");
				return;
			}
			
		}
		userDao.add(user);
		System.out.println("Registration has been completed successfully.");
		
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void login(String eMail, String password) {
		for (User users : userDao.getAll()) {
			if(users.geteMail().equals(eMail) && users.getPassword().equals(password)) {
				System.out.println("The system has been logged in.");
				return;
			}
		}
		System.out.println("The information you entered does not match.");
		
		
	}

}
