package com.tvhung.quanlycang.service;

import com.tvhung.quanlycang.model.Account;
import com.tvhung.quanlycang.model.Pair;

public interface AccountService {
	Pair<String, Account> findRoleAndAccount(Account account);
}