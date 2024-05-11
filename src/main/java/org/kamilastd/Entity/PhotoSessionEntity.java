package org.kamilastd.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Data
public class PhotoSessionEntity {

    @Setter
    @Getter
    Long id;
    ClientEntity client;
    LocalDateTime sessionDate;
    SessionTypeEntity sessionType;
    PaymentEntity payment;
    PhotosEntity photos;
    Boolean isContractFinished;

}
