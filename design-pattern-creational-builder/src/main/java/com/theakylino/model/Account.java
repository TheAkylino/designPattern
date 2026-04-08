package com.theakylino.model;

import lombok.Builder;

@Builder
public class Account {
    private  String owner;
    private  String currency;
    private  double balance;
}
