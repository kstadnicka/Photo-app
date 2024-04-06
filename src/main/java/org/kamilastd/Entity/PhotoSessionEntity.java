package org.kamilastd.Entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class PhotoSessionEntity {

    Long id;
    ClientEntity client;
    LocalDateTime sessionDate;
    SessionTypeEntity sessionType;
    PaymentEntity payment;
    PhotosEntity photos;
    Boolean isContractFinished;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public LocalDateTime getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDateTime sessionDate) {
        this.sessionDate = sessionDate;
    }

    public SessionTypeEntity getSessionType() {
        return sessionType;
    }

    public void setSessionType(SessionTypeEntity sessionType) {
        this.sessionType = sessionType;
    }

    public PaymentEntity getPayment() {
        return payment;
    }

    public void setPayment(PaymentEntity payment) {
        this.payment = payment;
    }

    public PhotosEntity getPhotos() {
        return photos;
    }

    public void setPhotos(PhotosEntity photos) {
        this.photos = photos;
    }

    public Boolean getContractFinished() {
        return isContractFinished;
    }

    public void setContractFinished(Boolean contractFinished) {
        isContractFinished = contractFinished;
    }
}
