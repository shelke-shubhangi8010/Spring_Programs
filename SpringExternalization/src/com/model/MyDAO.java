package com.model;

public class MyDAO {

	private String dbServer;
    private String dbName;
    private String dbUser;
    private String dbPass;
    
	public MyDAO(String dbServer, String dbName, String dbUser, String dbPass ) {
		super();
		this.dbServer = dbServer;
		this.dbName =dbName;
		this.dbPass = dbPass;
		this.dbUser =dbUser;
	}

	
	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbName=" + dbName + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}

}
