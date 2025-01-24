package com.example.BankingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingApplication.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
	
}
