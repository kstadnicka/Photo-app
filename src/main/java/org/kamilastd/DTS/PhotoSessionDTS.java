package org.kamilastd.DTS;

import lombok.Data;
import org.kamilastd.Dao.SessionDao;


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

//    public PhotoSessionDTS(Long sessionPhotoId, String sessionType, Boolean isDepositPaid, Boolean isBasePaid,
//                           Boolean isPhotosSentToClientForChoose, Boolean isPhotosChosenByClient,
//                           Boolean isAdditionalPhotosChosenByClient, Boolean isAdditionalPaid, Boolean isContractFinished) {
//        this.sessionPhotoId = sessionPhotoId;
//        this.sessionType = sessionType;
//        this.isDepositPaid = isDepositPaid;
//        this.isBasePaid = isBasePaid;
//        this.isPhotosSentToClientForChoose = isPhotosSentToClientForChoose;
//        this.isPhotosChosenByClient = isPhotosChosenByClient;
//        this.isAdditionalPhotosChosenByClient = isAdditionalPhotosChosenByClient;
//        this.isAdditionalPaid = isAdditionalPaid;
//        this.isContractFinished = isContractFinished;
//    }
//
//    SessionDao sessionDao;
//
//    public PhotoSessionDTS createPhotoSessionDTS(String sessionType, Boolean isDepositPaid,Boolean isBasePaid,
//                                                 Boolean isPhotosSentToClientForChoose, Boolean isPhotosChosenByClient, Boolean isAdditionalPhotosChosenByClient ,
//                                                 Boolean isAdditionalPaid, Boolean isContractFinished) {
//        Long newSessionId = sessionDao.findSessionWithHighestId();
//        return new PhotoSessionDTS(newSessionId,sessionType,isDepositPaid,isBasePaid,isPhotosSentToClientForChoose,isPhotosChosenByClient,
//                isAdditionalPhotosChosenByClient, isAdditionalPaid,isContractFinished);
//    }
}
