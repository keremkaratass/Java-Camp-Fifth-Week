package besinciHaftaOdev.business.concretes;

import java.util.regex.Pattern;

import besinciHaftaOdev.business.abstracts.UserValidationService;
import besinciHaftaOdev.entities.concretes.User;

public class UserValidationManager implements UserValidationService {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

	@Override
	public boolean isEmailValidation(String eMail) { 
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
				return pattern.matcher(eMail).find();
	
	}


}
