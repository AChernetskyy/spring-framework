package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity{
    private String email;
    private String password;
    private String username;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;

    @OneToMany(mappedBy = "userAccount")
    private List<Tickets> tickets;

}
