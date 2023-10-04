package com.scaler.splitwise.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "SPLITWISE_EXPENSE_USER")
public class UserExpense extends BaseModel{
    @ManyToOne
    private User user;
    private double amount;

    @ManyToOne
    private Expense expense;
    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType euserExpenseType;
}
