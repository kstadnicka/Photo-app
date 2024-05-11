package org.kamilastd.Controller;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.PhotoSessionEntity;
import org.kamilastd.Services.PhotoSessionService;

import java.sql.SQLException;
import java.util.List;

public class SessionsController {

    PhotoSessionService photoSessionService;
//    public List<PhotoSessionDTS> displayAllSessions(){
//        List<PhotoSessionEntity> list = photoSessionService.getAllPhotoSessionFromDatabase();
//        return photoSessionService.prepareListOfSessionsDTS(list);
//    }

    public void createNewSession(PhotoSessionDTS session) throws SQLException {
        photoSessionService.createNewSession(session);
    }

  //  public PhotoSessionDTS updateSession(PhotoSessionDTS session){

  //  }


}
