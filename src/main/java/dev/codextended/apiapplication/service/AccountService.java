package dev.codextended.apiapplication.service;

import dev.codextended.apiapplication.model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    Account findByUsername(String username);
    List<Account> getAccounts();
}
