package com.scaler.splitwise.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name =  "SPLITWISE_EXPENSE")
public class Expense extends BaseModel{
    private String description;
    private double amount;
    @ManyToOne
    private Group group;

//    private HashMap<User, Double> paidByUsers;
//    private HashMap<User, Double> HaveToPayUsers;

    @OneToMany
    private List<UserExpense> userExpenses;

    @Enumerated(EnumType.ORDINAL)
    private Currency currency;
}

/*  -- HASHMAP EXAMPLE
{
    "Description" : "Dinner:,
    "amount" : 1500,
    "group" : 1;
    "Currency" : "INR",
    "PaidBy" : [
                {"Name": "Rituraj", "Amount" : 1000},
                {"Name": "Omkar", "Amount" : 500}
               ]
    "hasToPay" : [
                {"Name": "Rituraj", "Amount" : 500},
                {"Name": "Omkar", "Amount" : 500},
                {"Name": "Shravan", "Amount" : 300},
                {"Name": "Pavam", "Amount" : 200}
                ]

}
 */

/*
        --- USER_EXPENSE ---
{
    "Description" : "Dinner",
    "amount" : 1500,
    "group" : 1,
    "currency" : "INR",
    "UserExpense" : [{"Name": "Rituraj", "Amount" : 1000, "UserExpenseType" : "PAID"},
                     {"Name": "Omkar", "Amount" : 500, "UserExpenseType" : "PAID"},
                     {"Name": "Rituraj", "Amount" : 500, "UserExpenseType" : "PAID"},
                     {"Name": "Omkar", "Amount" : 500, "UserExpenseType" : "PAID"},
                     {"Name": "Shravan", "Amount" : 300, "UserExpenseType" : "PAID"},
                     {"Name": "Pavam", "Amount" : 200, "UserExpenseType" : "PAID"}

    ]

}
 */
