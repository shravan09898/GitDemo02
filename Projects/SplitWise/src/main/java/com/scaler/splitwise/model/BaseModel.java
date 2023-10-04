package com.scaler.splitwise.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date LastModifiedDate;
}
