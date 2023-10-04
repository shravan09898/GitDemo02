package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.List;

@Data
@Entity(name = "SPLITWISE_USER")
public class User extends BaseModel{
    private String name;
    private String email;
    private String phoneNumber;

    @OneToMany
    private List<UserExpense> userExpenses;
    @ManyToMany
    private List<Group> groups;
    // One user can be part of many groups and 1 group can have many users

}
