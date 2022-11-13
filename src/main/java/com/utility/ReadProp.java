package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	public Properties prop;

	public ReadProp() {

		String path = "E:\\eclipse-workspace4\\com.leetcode.framework\\ConfigFile\\TestcaseData.properties";
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(path);
			prop.load(file);
		} catch (IOException E) {
			E.printStackTrace();
		}

	}

	public String URl() {
		String mainurl = prop.getProperty("url");
		return mainurl;
	}

	public String browser() {
		String browser = prop.getProperty("browser");
		return browser;
	}

	public String username() {
		String username = prop.getProperty("username");
		return username;
	}

	public String password() {
		String password = prop.getProperty("password");
		return password;
	}
	public String user() {
		String user=prop.getProperty("user");
		return user;
	}
	public String passw() {
		String pass=prop.getProperty("pass");
		return pass;
	}
	public String confpass() {
		String confpass=prop.getProperty("confirmpass");
		return confpass;
	}
	public String email() {
		String email =prop.getProperty("email");
		return email;
	}
	

}