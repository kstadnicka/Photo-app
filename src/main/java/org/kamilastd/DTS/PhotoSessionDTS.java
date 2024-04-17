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


}
