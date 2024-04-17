package org.kamilastd.Controller;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.PhotoSessionEntity;
import org.kamilastd.Services.PhotoSessionService;

import java.util.List;

public class SessionsController {

    PhotoSessionService photoSessionService;
    //sending to front
    public List<PhotoSessionDTS> displayAllSessions(){
        photoSessionService = new PhotoSessionService();
        return photoSessionService.prepareListOfSessionsDTS();
    }

    public PhotoSessionDTS displaySingleSessionsToUpdate(PhotoSessionEntity photoSessionEntity){
        photoSessionService = new PhotoSessionService();
        photoSessionService.updateSession(photoSessionEntity);
        return photoSessionService.prepareListChangesOfSessionsDTS(photoSessionEntity);
    }
    // Get from front single PhotoSessionDTS to update

    public PhotoSessionDTS displaySingleSessionsToCreateNew(PhotoSessionEntity photoSession){
        PhotoSessionService photoSessionService = new PhotoSessionService();
        photoSession = photoSessionService.createNewSession(photoSession.getClient(),photoSession.getSessionDate(),
                photoSession.getSessionType(),photoSession.getPayment(),photoSession.getPhotos(),
                photoSession.getIsContractFinished());
       return photoSessionService.prepareDataForPhotoSessionDTS(photoSession);
    }
    // Get from front single PhotoSessionDTS to create new



}
