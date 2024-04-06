package org.kamilastd.DTS;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class PhotoSessionDTS {
    Long sessionPhotoId;
    String sessionType;
    Boolean isDepositPaid;
    Boolean isBasePaid;
    Boolean isPhotosSentToClientForChoose;
    Boolean isPhotosChosenByClient;
    Boolean isAdditionalPhotosChosenByClient;
    Boolean isAdditionalPaid;
    Boolean isContractFinished;

    public Long getSessionPhotoId() {
        return sessionPhotoId;
    }

    public void setSessionPhotoId(Long sessionPhotoId) {
        this.sessionPhotoId = sessionPhotoId;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public Boolean getDepositPaid() {
        return isDepositPaid;
    }

    public void setDepositPaid(Boolean depositPaid) {
        isDepositPaid = depositPaid;
    }

    public Boolean getBasePaid() {
        return isBasePaid;
    }

    public void setBasePaid(Boolean basePaid) {
        isBasePaid = basePaid;
    }

    public Boolean getPhotosSentToClientForChoose() {
        return isPhotosSentToClientForChoose;
    }

    public void setPhotosSentToClientForChoose(Boolean photosSentToClientForChoose) {
        isPhotosSentToClientForChoose = photosSentToClientForChoose;
    }

    public Boolean getPhotosChosenByClient() {
        return isPhotosChosenByClient;
    }

    public void setPhotosChosenByClient(Boolean photosChosenByClient) {
        isPhotosChosenByClient = photosChosenByClient;
    }

    public Boolean getAdditionalPhotosChosenByClient() {
        return isAdditionalPhotosChosenByClient;
    }

    public void setAdditionalPhotosChosenByClient(Boolean additionalPhotosChosenByClient) {
        isAdditionalPhotosChosenByClient = additionalPhotosChosenByClient;
    }

    public Boolean getAdditionalPaid() {
        return isAdditionalPaid;
    }

    public void setAdditionalPaid(Boolean additionalPaid) {
        isAdditionalPaid = additionalPaid;
    }

    public Boolean getContractFinished() {
        return isContractFinished;
    }

    public void setContractFinished(Boolean contractFinished) {
        isContractFinished = contractFinished;
    }
}
