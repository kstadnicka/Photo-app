package org.kamilastd.Dao;

import org.kamilastd.DTS.PhotoSessionDTS;
import org.kamilastd.Entity.PhotoSessionEntity;

public class SessionDao {

    public Long updateSessionWhereId(PhotoSessionEntity photoSession){
        return photoSession.getId();
    }

    public Long findSessionWithHighestId() {
        //Looking database
        return 5L;
    }
}
