package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity(name = "SPLITWISE_GROUP")
public class Group extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<User> users;
    @OneToMany
    private List<Expense> expenses;
    private double totalAmountSpent;

}
