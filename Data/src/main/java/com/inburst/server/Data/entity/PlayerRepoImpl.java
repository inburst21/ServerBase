package com.inburst.server.Data.entity;

import com.inburst.server.Data.entity.base.EntityRepoImpl;
import com.inburst.server.Data.entity.base.MockEntityList;
import com.inburst.server.Entitys.Player;

import javax.inject.Inject;

public class PlayerRepoImpl extends EntityRepoImpl<Player> {
    @Inject
    public PlayerRepoImpl() {
        entityList = new MockEntityList<Player>().mockList();
    }
}
