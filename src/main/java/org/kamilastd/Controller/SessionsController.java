package org.kamilastd.Controller;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Services.PhotoSessionService;

import java.util.List;

public class SessionsController {

    PhotoSessionService photoSessionService;
    //sending to front
    public List<PhotoSessionDTS> displayAllSessions(){
        photoSessionService = new PhotoSessionService();
        return photoSessionService.prepareListOfSessionsDTS();
    }

    // Get from front single PhotoSessionDTS to update
    // Get from front single PhotoSessionDTS to create new

}
