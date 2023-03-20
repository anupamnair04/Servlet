package seed.jsp;

import java.io.Serializable;
//Java Bean
@SuppressWarnings("serial")
public class LogBean implements Serializable{
	
	//private Bean Properties
	private String username;
	private String pass;
	private String dbDriver,dbUrl,dbUser,dbPass;
	
	//Constructors
	public LogBean(){
		super();
	}
	public LogBean(String username, String pass, String dbDriver, String dbUrl, String dbUser, String dbPass) {
		super();
		this.username = username;
		this.pass = pass;
		this.dbDriver = dbDriver;
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}
	
	//Getter Setter Methods
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDbDriver() {
		return dbDriver;
	}
	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
	}
	public String getDbUrl() {
		return dbUrl;
	}
	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public String getDbUser() {
		return dbUser;
	}
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	public String getDbPass() {
		return dbPass;
	}
	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}
	
	//Business Logic
		public boolean validateUser(){
			System.out.println("Username="+username);
			System.out.println("Pass="+pass);
			if(username.equals(pass))
				return true;
			else
				return false;
		}
		
	//toString Method
	@Override
	public String toString() {
		return "LogBean [userName=" + username + ", pass=" + pass + ", dbDriver=" + dbDriver + ", dbUrl=" + dbUrl
				+ ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}
}