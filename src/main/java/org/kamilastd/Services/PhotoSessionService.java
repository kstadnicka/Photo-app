package org.kamilastd.Services;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Dao.SessionDao;
import org.kamilastd.Entity.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhotoSessionService {
    ClientDao clientDao;

    public List<PhotoSessionEntity> getAllPhotoSessionFromDatabase(){
        // do dao idziesz
        // robisz sql query
        // zwracasz calą liste albo np tylko przyszle
        return new ArrayList<PhotoSessionEntity>();
    }
    public PhotoSessionDTS prepareDataForPhotoSessionDTS(PhotoSessionEntity photoSessionEntity){

        PhotoSessionDTS photoSessionDTS = new PhotoSessionDTS();
        photoSessionDTS.setSessionPhotoId(photoSessionEntity.getId());
        photoSessionDTS.setSessionType(photoSessionEntity.getSessionType().getType());
        photoSessionDTS.setIsDepositPaid(photoSessionEntity.getPayment().getIsDepositPaid());
        photoSessionDTS.setIsBasePaid(photoSessionEntity.getPayment().getIsBasePaid());
        photoSessionDTS.setIsPhotosSentToClientForChoose(photoSessionEntity.getPhotos().getIsPhotosSentToClientForChoose());
        photoSessionDTS.setIsPhotosChosenByClient(photoSessionEntity.getPhotos().getIsPhotosChosenByClient());
        photoSessionDTS.setIsAdditionalPhotosChosenByClient(photoSessionEntity.getPhotos().getIsAdditionalPhotosChosenByClient());
        photoSessionDTS.setIsAdditionalPaid(photoSessionEntity.getPayment().getIsAdditionalPaid());
        photoSessionDTS.setIsContractFinished(photoSessionEntity.getIsContractFinished());
        return photoSessionDTS;
    }

    public List<PhotoSessionDTS> prepareListOfSessionsDTS(){
        List<PhotoSessionEntity> list = getAllPhotoSessionFromDatabase();
        return list.stream().map(this::prepareDataForPhotoSessionDTS).sorted().toList();
    }

  public PhotoSessionDTS prepareListChangesOfSessionsDTS(PhotoSessionEntity photoSession){
        SessionDao sessionDao = new SessionDao();
        long id = sessionDao.updateSessionWhereId(photoSession);
        photoSession.setId(id);
      return prepareDataForPhotoSessionDTS(photoSession);
    }


    // wziać sessionEntiy, to co się zmienilo podmienic przez set coś tam i znow zapisać zapisać do bazy danych.

    public PhotoSessionEntity createNewSession(ClientEntity client, LocalDateTime sessionDate,
                                                     SessionTypeEntity sessionType, PaymentEntity payment,
                                                     PhotosEntity photos, Boolean isContractFinished){
        clientDao = new ClientDao();
        Long newClientId = clientDao.findClientWithHighestId();
        return new PhotoSessionEntity(newClientId,client,sessionDate,sessionType,payment, photos, isContractFinished);
    }





}
