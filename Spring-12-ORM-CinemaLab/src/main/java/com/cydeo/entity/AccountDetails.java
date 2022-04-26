package com.cydeo.entity;

import com.cydeo.enums.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class AccountDetails extends BaseEntity {

    private String name;
    private String address;
    private String country;
    private String city;
    private String state;
    private int age;
    private int postalCode;
    @Enumerated(EnumType.STRING)
    private Role role= Role.USER;

    @OneToOne(mappedBy = "accountDetails")
   private UserAccount userAccount;


}
