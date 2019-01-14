package com.lvxk.consumer.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
//@Entity
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO )
    public Long id;

//    @Column
    public String username;
//    @Column
    public String name;

//    @Column
    public Integer age;

//    @Column
    public BigDecimal balance;
}
