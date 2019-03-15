package metier;

import java.io.Serializable;

public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login_email;
    private String login_password;
	
    public String getUsers() {
		return login_email;
	}
	public void setUsers(String users) {
		this.login_email = users;
	}
	
	public String getPass() {
		return login_password;
	}
	
	public void setPass(String pass) {
		this.login_password = pass;
	}
	public Log(String users, String pass) {
		super();
		this.login_email = users;
		this.login_password = pass;
	}
	

}
