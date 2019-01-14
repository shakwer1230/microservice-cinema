package com.lvxk.provider.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    public Long id;

    @Column
    public String username;
    @Column
    public String name;

    @Column
    public Integer age;

    @Column
    public BigDecimal balance;
}
