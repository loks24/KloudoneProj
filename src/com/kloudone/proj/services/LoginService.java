package com.kloudone.proj.services;



import java.util.List;

import com.kloudone.proj.bean.LoginBean;
import com.kloudone.proj.bean.PostBean;

public interface LoginService {
	
	public LoginBean validateLogin(String username);
	
}
