package com.inburst.server.App;
import com.inburst.server.Buisness.injection.bridge.BusinessLayerBridgeModule;
import com.inburst.server.Buisness.injection.exported.InteractorsModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        // business layer interactors
        InteractorsModule.class,
        // business layer module component
        BusinessLayerBridgeModule.class,
})
public interface ApplicationComponent {
    void inject(Activity o);
}
