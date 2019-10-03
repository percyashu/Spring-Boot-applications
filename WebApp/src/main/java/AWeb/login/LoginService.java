package AWeb.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		if (user.equals("Enoabane") && password.equals("pep"))
			return true;
		return false;
	}

}
