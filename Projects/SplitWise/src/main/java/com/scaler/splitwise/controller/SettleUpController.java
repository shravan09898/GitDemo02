package com.scaler.splitwise.controller;

import com.scaler.splitwise.dto.SettleUpResponseDTO;
import com.scaler.splitwise.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SettleUpController {
    @GetMapping("/hello") // GET call -> localhost:8080/hello
    public ResponseEntity helloWorld(){
        TransactionDTO transactionDTO1 = new TransactionDTO("Shravan", "Arun", 1000000);
        TransactionDTO transactionDTO2 = new TransactionDTO("Mahesh", "Praveen", 20000);
        List<TransactionDTO> transactionDTOS = List.of(transactionDTO1, transactionDTO2);
        SettleUpResponseDTO settleUpResponseDTO = new SettleUpResponseDTO(transactionDTOS);
        return ResponseEntity.ok(settleUpResponseDTO);
    }
}


//GET PUT POST DELETE