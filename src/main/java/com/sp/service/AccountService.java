package com.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.repository.AccountRepository;

import src.com.entity.Account;

@Service
public class AccountService {
	@Autowired
	private AccountRepository arp;
	
	public void InsertAccDetailService(Account acc) {
		arp.save(acc);
	
	}
	
}
