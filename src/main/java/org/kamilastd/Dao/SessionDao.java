package org.kamilastd.Dao;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.PhotoSessionEntity;

import java.util.List;

public class SessionDao {

    public Long updateSessionWhereId(PhotoSessionEntity photoSession){
        return photoSession.getId();
    }



    public Long findSessionWithHighestId() {
        //Looking database
        return 5L;
    }

    public List<PhotoSessionEntity> getAllSessionFromDatabase() {

        return null;
    }

    // public void saveNewSession(PhotoSessionEntity photoSessionEntity) {
   //     String query = ""
   // }
}
