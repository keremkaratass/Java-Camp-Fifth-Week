package besinciHaftaOdev.business.abstracts;

import besinciHaftaOdev.entities.concretes.User;

public interface UserAuthenticationService {
		void register(User user);
		void log(String eMail,String password);
}
