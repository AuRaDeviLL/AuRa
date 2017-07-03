package com.hms.service;

import com.hms.DAO.*;
import com.hms.model.*;

public class LoginPageService {
	LoginPage ed;
	
	public LoginPageService() {
		ed = new LoginPage();
	}
	
	public void LoginPageServiceRun(LoginPageVO login) {
		ed.initialize();
	}
}
