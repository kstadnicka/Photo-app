package org.kamilastd.Entity;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
@Data
public class PhotoSessionEntity {

    @Getter
    Long id;
    ClientEntity client;
    LocalDateTime sessionDate;
    SessionTypeEntity sessionType;
    PaymentEntity payment;
    PhotosEntity photos;
    Boolean isContractFinished;

    public PhotoSessionEntity(Long id, ClientEntity client, LocalDateTime sessionDate, SessionTypeEntity sessionType,
                              PaymentEntity payment, PhotosEntity photos, Boolean isContractFinished) {
        this.id = id;
        this.client = client;
        this.sessionDate = sessionDate;
        this.sessionType = sessionType;
        this.payment = payment;
        this.photos = photos;
        this.isContractFinished = isContractFinished;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
