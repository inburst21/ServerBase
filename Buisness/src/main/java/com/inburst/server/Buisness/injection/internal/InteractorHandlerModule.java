package com.inburst.server.Buisness.injection.internal;

import com.inburst.server.Buisness.base.interactor.InteractorHanderler;
import com.inburst.server.DataAccess.EntityRepo;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class InteractorHandlerModule {

    @Singleton
    @Provides
    public InteractorHanderler<Player> playerInteractorHanderler(EntityRepo<Player> entityRepo) {
        return new InteractorHanderler<>(entityRepo);
    }

    @Singleton
    @Provides
    public InteractorHanderler<Npc> npcInteractorHanderler(EntityRepo<Npc> npcEntityRepo) {
        return new InteractorHanderler<>(npcEntityRepo);
    }
}
