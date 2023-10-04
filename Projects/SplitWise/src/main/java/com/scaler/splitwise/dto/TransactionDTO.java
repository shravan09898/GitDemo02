package com.scaler.splitwise.dto;


import lombok.*;


/* Below Annotations are replacement of Getter Setter methods
   and no-arg and arg constructor */

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Data
@AllArgsConstructor
        /* instead of above 4 annotations, we use Data which includes Getter, Setter,
          no-arg constructor and toString()  */
public class TransactionDTO {
    private String fromUserName;
    private String toUserName;
    private int amount;

}
