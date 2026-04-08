package com.theakylino.controller;

import com.theakylino.model.Account;
import com.theakylino.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired private AccountService service;

    @PostMapping
    public Account create(@RequestBody AccountRequest request) {
        return service.createAccount(
                request.getOwner(),
                request.getCurrency(),
                request.getBalance()
        );
    }
}
