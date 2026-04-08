package com.theakylino.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountRequest {
    private String owner;
    private String currency;
    private double balance;
}
