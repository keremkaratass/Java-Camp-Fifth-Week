package besinciHaftaOdev;

import besinciHaftaOdev.business.abstracts.UserAuthenticationService;
import besinciHaftaOdev.business.abstracts.UserService;
import besinciHaftaOdev.business.concretes.UserAuthenticationManager;
import besinciHaftaOdev.business.concretes.UserManager;
import besinciHaftaOdev.business.concretes.UserValidationManager;
import besinciHaftaOdev.dataAccess.concretes.HibernateUserDao;
import besinciHaftaOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user=new User("Kerem", "Karatas", "example@gmail.com", "12345");
		User user2=new User("X", "Y", "example@gmail.com", "4123124");
		User user3=new User("Z", "A", "example@gmail.com", "1241423523235");
		//.................
		UserAuthenticationService userAuthenticationService=new UserAuthenticationManager(new UserManager(new HibernateUserDao()), new UserValidationManager());
		//gerekli test iþlemleri.............
		
		
		
	}

}
