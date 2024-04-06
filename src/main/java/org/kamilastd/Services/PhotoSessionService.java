package org.kamilastd.Services;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.PhotoSessionEntity;

import java.util.ArrayList;
import java.util.List;

public class PhotoSessionService {

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
        // dla każdego
        return photoSessionDTS;
    }

    public List<PhotoSessionDTS> prepareListOfSessionsDTS(){
        List<PhotoSessionEntity> list = getAllPhotoSessionFromDatabase();
        return list.stream().map(this::prepareDataForPhotoSessionDTS).sorted().toList();
    }

    // wziać sessionEntiy, to co się zmienilo podmienic przez set coś tam i znow zapisać zapisać do bazy danych.

    // new sessionEntiy


}
