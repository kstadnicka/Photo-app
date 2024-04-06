package org.kamilastd.Entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PhotoSessionEntity {

    Long id;
    ClientEntity client;
    LocalDateTime sessionDate;
    SessionTypeEntity sessionType;
    PaymentEntity payment;
    PhotosEntity photos;
    Boolean isContractFinished;

}
