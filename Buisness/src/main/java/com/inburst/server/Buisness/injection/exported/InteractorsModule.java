package com.inburst.server.Buisness.injection.exported;

import com.inburst.server.Buisness.base.interactor.IInteractor;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Module;
import dagger.Provides;

@Module
public class InteractorsModule {

    @Provides
    IInteractor<Player> playerListInteractor(BusinessComponent component) {
        return component.getPlayerController();
    }

    @Provides
    IInteractor<Npc> npcDetailsInteractor(BusinessComponent component) {
        return component.getNpcController();
    }

}
