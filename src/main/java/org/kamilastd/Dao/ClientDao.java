package org.kamilastd.Dao;

import org.kamilastd.Entity.ClientEntity;
import org.kamilastd.Entity.PhotoSessionEntity;

public class ClientDao {
    public Long findClientWithHighestId() {
        //Looking database
        return 5L;
    }

    public Long updateClientWhereId(ClientEntity clientEntity){
        return clientEntity.id();
    }


}
