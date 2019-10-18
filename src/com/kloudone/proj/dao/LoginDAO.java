package com.kloudone.proj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kloudone.proj.entity.LoginEntity;

@Repository
public interface LoginDAO {
	
	public LoginEntity findLoginDetails(String username);

}
