package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import src.com.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>  {
	
	

}
