package com.theakylino.service;

import com.theakylino.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public Account createAccount(String owner, String currency, double balance) {
        return Account.builder()
                .owner(owner)
                .currency(currency)
                .balance(balance)
                .build();
    }
}
