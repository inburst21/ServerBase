package com.inburst.server.Data.entity;

import com.inburst.server.Data.entity.base.EntityRepoImpl;
import com.inburst.server.Data.entity.base.MockEntityList;
import com.inburst.server.Entitys.Npc;

import javax.inject.Inject;

public class NpcRepoImpl extends EntityRepoImpl<Npc> {

    @Inject
    public NpcRepoImpl() {
        entityList = new MockEntityList<Npc>().mockList();
    }

}
