package metier;

public class LogModel {
	private String login_email;
	private String login_password;
	private Log log;
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
	public Log getLog() {
		return log;
	}
	public void setLog(Log log) {
		this.log = log;
	}
	public LogModel(String users, String pass, Log log) {
		super();
		this.login_email = users;
		this.login_password = pass;
		this.log = log;
	}
	
	
}
