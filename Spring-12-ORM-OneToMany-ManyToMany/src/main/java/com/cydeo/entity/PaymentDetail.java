package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentsDetails")
@NoArgsConstructor
@Data
public class PaymentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal commissionAmount;
    private BigDecimal merchantPayoutAmount;
    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetail(BigDecimal commissionAmount, BigDecimal merchantPayoutamount, LocalDate payoutDate) {
        this.commissionAmount = commissionAmount;
        this.merchantPayoutAmount = merchantPayoutamount;
        this.payoutDate = payoutDate;
    }
    @OneToOne(mappedBy = "paymentDetails")
    private Payment payment;
}
