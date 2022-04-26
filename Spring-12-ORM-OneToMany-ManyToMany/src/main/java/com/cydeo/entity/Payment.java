package com.cydeo.entity;

import com.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Table(name = "payments")
@NoArgsConstructor
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createDate;
    private BigDecimal amount;
    private Status paymentStatus;

    public Payment(LocalDate createDate, BigDecimal amount, Status paymentStatus) {
        this.createDate = createDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentDetail paymentDetails;

    @ManyToOne
    private Merchant merchant;
    @ManyToOne
    private Customer customer;


}
