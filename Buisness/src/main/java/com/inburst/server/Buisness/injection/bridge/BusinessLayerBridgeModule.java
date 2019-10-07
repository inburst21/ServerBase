package com.inburst.server.Buisness.injection.bridge;

import com.inburst.server.Buisness.injection.exported.BusinessComponent;
import com.inburst.server.Buisness.injection.exported.DaggerBusinessComponent;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class BusinessLayerBridgeModule {
    @Provides
    @Singleton
    BusinessComponent dataComponent() {
        BusinessComponent businessComponent = DaggerBusinessComponent.create();
        BusinessComponent.getProvider().setComponent(businessComponent);
        return businessComponent;
    }
}
