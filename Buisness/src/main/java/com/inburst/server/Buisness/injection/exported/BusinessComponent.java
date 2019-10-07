package com.inburst.server.Buisness.injection.exported;

import com.inburst.server.Buisness.base.interactor.IInteractor;
import com.inburst.server.Buisness.base.interactor.InteractorHanderler;
import com.inburst.server.Buisness.injection.internal.InteractorHandlerModule;
import com.inburst.server.Buisness.injection.internal.InteractorsBindingModule;
import com.inburst.server.BuisnessInjection.bridge.DataAccessLayerBridgeModule;
import com.inburst.server.BuisnessInjection.exported.DataRepoModule;
import com.inburst.server.Entitys.Npc;
import com.inburst.server.Entitys.Player;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        InteractorsBindingModule.class,
        DataRepoModule.class,
        InteractorHandlerModule.class,
        DataAccessLayerBridgeModule.class
})
public interface BusinessComponent {

    IInteractor<Player> getPlayerController();
    IInteractor<Npc> getNpcController();

    //region component provider

    @SuppressWarnings("unused")
    static ComponentProvider getProvider() {
        return ComponentProvider.COMPONENT_PROVIDER;
    }

    @SuppressWarnings("unused")
    class ComponentProvider {

        private static final ComponentProvider COMPONENT_PROVIDER = new ComponentProvider();

        private volatile BusinessComponent businessComponent;

        public void setComponent(BusinessComponent component) {
            businessComponent = component;
        }

        public BusinessComponent getComponent() {
            if (businessComponent == null) {
                throw new IllegalStateException("SampleBusinessComponent not initialized");
            }
            return businessComponent;
        }
    }
}
