package com.inburst.server.BuisnessInjection.bridge;

import com.inburst.server.Data.DaggerDataComponent;
import com.inburst.server.Data.DataComponent;
import com.inburst.server.DataAccess.DataAccessComponent;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DataAccessLayerBridgeModule {

    @Provides
    @Singleton
    DataAccessComponent dataComponent() {
        DataComponent dataComponent;
        dataComponent = DaggerDataComponent.create();
        DataComponent.getProvider().setComponent(dataComponent);
        return dataComponent;
    }
}
