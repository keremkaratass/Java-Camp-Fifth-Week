package besinciHaftaOdev.business.abstracts;

import besinciHaftaOdev.entities.concretes.User;

public interface UserService {
		void add(User user);
		void delete(User user);
		void update(User user);
		void login(String eMail,String password);
}
