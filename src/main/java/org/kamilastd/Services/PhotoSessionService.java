package org.kamilastd.Services;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Dao.ClientDao;
import org.kamilastd.Dao.SessionDao;
import org.kamilastd.Entity.*;

import java.sql.SQLException;
import java.util.List;

public class PhotoSessionService {
    ClientDao clientDao;
    SessionDao sessionDao;

    public List<PhotoSessionDTS> getAllPhotoSessionFromDatabase(){
       List<PhotoSessionEntity> list =  sessionDao.getAllSessionFromDatabase();
       return prepareListOfSessionsDTS(list);
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

    public List<PhotoSessionDTS> prepareListOfSessionsDTS( List<PhotoSessionEntity> list){
        return list.stream().map(this::prepareDataForPhotoSessionDTS).sorted().toList();
    }

    public PhotoSessionDTS prepareListChangesOfSessionsDTS(PhotoSessionEntity photoSession){
        SessionDao sessionDao = new SessionDao();
        long id = sessionDao.updateSessionWhereId(photoSession);
        photoSession.setId(id);
      return prepareDataForPhotoSessionDTS(photoSession);
    }


    // wziać sessionEntiy, to co się zmienilo podmienic przez set coś tam i znow zapisać zapisać do bazy danych.

    public void createNewSession(PhotoSessionDTS photoSessionDTS) throws SQLException {
        PhotoSessionEntity photoSessionEntity = new PhotoSessionEntity();
        PaymentEntity payment = new PaymentEntity();
        PhotosEntity photos = new PhotosEntity();
        ClientEntity client = clientDao.getClientById(photoSessionDTS.getClientDTS().getId());
        photoSessionEntity.setClient(client);
        payment.setIsDepositPaid(photoSessionDTS.getIsDepositPaid());
        payment.setIsBasePaid(photoSessionDTS.getIsBasePaid());
        payment.setIsAdditionalPaid(photoSessionDTS.getIsAdditionalPaid());
        photos.setIsPhotosSentToClientForChoose(photoSessionDTS.getIsPhotosSentToClientForChoose());
        photos.setIsPhotosChosenByClient(photoSessionDTS.getIsPhotosChosenByClient());
        photos.setIsAdditionalPhotosChosenByClient(photoSessionDTS.getIsAdditionalPhotosChosenByClient());
     //   sessionDao.saveNewSession(photoSessionEntity);
    }



    public void updateSession(PhotoSessionEntity sessionEntity){
        long id = sessionEntity.getId();
        sessionEntity.setId(id);
        prepareDataForPhotoSessionDTS(sessionEntity);
    }


}
