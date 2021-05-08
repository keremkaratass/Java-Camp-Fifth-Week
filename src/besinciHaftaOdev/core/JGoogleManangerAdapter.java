package besinciHaftaOdev.core;

import java.util.ArrayList;
import java.util.List;

import besinciHaftaOdev.JGoogle.JGoogleManager;

public class JGoogleManangerAdapter implements GoogleService {
JGoogleManager jGoogleManager=new JGoogleManager();
	

	List<String> passwords=new ArrayList<String>() ;
	
	List<String> eMails=new ArrayList<String>() ;


	@Override
	public void register(String eMail, String password) {
		for(int i=0;i<eMails.size();i++)
		{
			if(eMails.get(i).equals(eMail) && passwords.get(i).equals(password))
			{
				System.out.println("Registration with Google failed.");
				return;
			}
		}
	eMails.add(eMail);
	passwords.add(password);
	jGoogleManager.register(eMail, password);
	}

	@Override
	public void login(String eMail, String password) {
		for(int i=0;i<eMails.size();i++)
		{
			if(eMails.get(i).equals(eMail) && passwords.get(i).equals(password))
			{
				jGoogleManager.login(eMail, password);
				return;
			}
		}
	System.out.println("Login with Google failed.");
	}
}
