package com.inburst.server.BuisnessInjection.exported;

import com.inburst.server.DataAccess.DataAccessComponent;
import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Module;
import dagger.Provides;

@Module
public class DataRepoModule {

    @Provides
    EntityRepo<Player> playerRepo(DataAccessComponent component) {
        return component.getPlayers();
    }

    @Provides
    EntityRepo<Npc> npcRepo(DataAccessComponent component) {
        return component.getNpcs();
    }
}
