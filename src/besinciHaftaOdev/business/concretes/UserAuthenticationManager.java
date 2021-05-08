package besinciHaftaOdev.business.concretes;



import besinciHaftaOdev.business.abstracts.UserAuthenticationService;
import besinciHaftaOdev.business.abstracts.UserService;
import besinciHaftaOdev.business.abstracts.UserValidationService;
import besinciHaftaOdev.entities.concretes.User;

public class UserAuthenticationManager implements UserAuthenticationService {
	private UserService userService;
	private UserValidationService userValidationService;
	
	

	public UserAuthenticationManager(UserService userService, UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void register(User user) {
		if(userValidationService.isEmailValidation(user.geteMail()) && user.getFirstName().length()>2
				&& user.getLastName().length()>2 && user.getPassword().length() >=6) {
			
			userService.add(user);
			return;
			
			
		}
		System.out.println("You didn't fulfill the obligations.");
		
	}

	@Override
	public void log(String eMail, String password) {
		if(userValidationService.isEmailValidation(eMail)) {
			
			userService.login(eMail, password);
			return;
		}
		
		System.out.println("You can't log in.");
	}



}
