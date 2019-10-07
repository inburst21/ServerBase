package com.inburst.server.Data.internal;

import com.inburst.server.Data.entity.NpcRepoImpl;
import com.inburst.server.Data.entity.PlayerRepoImpl;
import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class DataBindingRepoModule {

    @Binds @Singleton
    public abstract EntityRepo<Player> playerRepo(PlayerRepoImpl playerRepo);

    @Binds @Singleton
    public abstract EntityRepo<Npc> npcRepo(NpcRepoImpl npcRepo);

}
