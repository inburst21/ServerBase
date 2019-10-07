package com.inburst.server.Buisness.injection.internal;

import com.inburst.server.Buisness.base.entity.NpcInteractorImpl;
import com.inburst.server.Buisness.base.entity.PlayerInteractorImpl;
import com.inburst.server.Buisness.base.interactor.IInteractor;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public abstract class InteractorsBindingModule {

    @Singleton @Binds
    abstract IInteractor<Player> getPlayerController(PlayerInteractorImpl interactor);

    @Singleton @Binds
    abstract IInteractor<Npc> getNpcController(NpcInteractorImpl interactor);
}
