package org.kamilastd.DTS;

import lombok.Data;


@Data

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
}
