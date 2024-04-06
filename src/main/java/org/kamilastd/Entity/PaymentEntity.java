package org.kamilastd.Entity;

import lombok.Data;

@Data
public class PaymentEntity {
    Float deposit;
    Float basePayment;
    Float additionalPayment;
    Boolean isDepositPaid;
    Boolean isBasePaid;
    Boolean isAdditionalPaid;
}
