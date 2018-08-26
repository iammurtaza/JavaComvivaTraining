package com.comviva;

public class Table {
	private String user;
	private String pass;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Table(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Table [user=" + user + ", pass=" + pass + "]";
	}
	public Table() {
	
	}
}